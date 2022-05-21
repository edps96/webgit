package egovframework.example.parking.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import egovframework.example.parking.service.CodeVO;
import egovframework.example.parking.service.ParkingService;
import egovframework.example.parking.service.ParkingVO;
import egovframework.example.parking.service.TestVO;

@Controller
public class ParkingController {

	@Resource(name = "ParkingService")
	private ParkingService parkingService;

	/**
	 * 주차장 조회
	 * 
	 * @param request
	 * @param response
	 * @param model
	 * @param parkingExVO
	 * @return
	 */
	@RequestMapping(value = "/parkingList.do")
	public String parkingList(@ModelAttribute ParkingVO parkingVO, ModelMap model) {
		List<CodeVO>  code= new ArrayList<CodeVO>();
		
		code = parkingService.selectSubCodeList("0019");
		
		for (CodeVO codeVO : code) {
			System.out.println(codeVO.getCodeNm());
		}
		
		
		// 건물형태
		model.addAttribute("buildingForm", parkingService.selectSubCodeList("0019"));
		
		ParkingVO park = new ParkingVO();
		park =  parkingService.selectParking(parkingVO);
		
		System.out.println(park.getBuildingForm());
		
		model.addAttribute("data", parkingService.selectParking(parkingVO));
		
		return "parking/parkingList";
	}

	/**
	 * Serialize
	 * @param parkingExVO
	 * @return
	 */
	@RequestMapping(value = "/serializeAjax.do", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> serializeAjax(@ModelAttribute TestVO testVO) {
		
		System.out.println(testVO.getBuildingForm());
		
		
		List<String> list = new ArrayList<String>();

		for (String string : testVO.getBuildingForm().split(",")) {
			list.add(string);
		}
	
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		
		resultMap.put("result", true);
		resultMap.put("message", "성공");
		
		return resultMap;
	}

	/**
	 * Array
	 * 
	 * @param parkingExVO
	 * @return
	 */
	@RequestMapping(value = "/arrayAjax.do", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> testAjax(@RequestParam(value = "valueArrTest[]") List<String> valueArr) {


		for (String string : valueArr) {
			System.out.println(string);
		}

		Map<String, Object> resultMap = new HashMap<String, Object>();

		resultMap.put("result", true);
		resultMap.put("message", "성공");

		return resultMap;
	}

	/**
	 * AjaxSubmit
	 * 
	 * @param parkingExVO
	 * @return
	 */
	@RequestMapping(value = "/AjaxSubmit.do", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> AjaxSubmit(@ModelAttribute TestVO testVO) {

		System.out.println(testVO.getBuildingForm());

		Map<String, Object> resultMap = new HashMap<String, Object>();

		resultMap.put("result", true);
		resultMap.put("message", "성공");

		return resultMap;
	}

	/**
	 * 주차장 조회
	 * 
	 * @param request
	 * @param response
	 * @param model
	 * @param parkingExVO
	 * @return
	 */
	@RequestMapping(value = "/listAjax.do")
	public String listAjax(HttpServletRequest request, HttpServletResponse response, Model model,
			@ModelAttribute ParkingVO parkingVO) {

		model.addAttribute("data", parkingService.selectParking(parkingVO));

		return "parking/parkingList";
	}

}
