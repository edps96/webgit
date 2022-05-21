package egovframework.example.parking.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.example.parking.service.CodeVO;
import egovframework.example.parking.service.ParkingService;
import egovframework.example.parking.service.ParkingVO;

@Service("ParkingService")
public class ParkingServiceImpl implements ParkingService {
  
	@Resource(name="ParkingMapper")
	private ParkingMapper parkingMapper;

	@Override
	public ParkingVO selectParking(ParkingVO parkingVO) {

		return parkingMapper.selectParking(parkingVO);
	}

	@Override
	public List<CodeVO> selectSubCodeList(String code) {

		return parkingMapper.selectSubCodeList(code);
	}


}
