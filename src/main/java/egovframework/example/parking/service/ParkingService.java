package egovframework.example.parking.service;

import java.util.List;

public interface ParkingService {

	/**
	 * 목록 조회
	 * @param parkingExVO
	 * @return
	 */
	ParkingVO selectParking(ParkingVO parkingVO);
	
	/**
	 * 하위 코드 목록 조회
	 * @param code
	 * @return
	 */
	List<CodeVO> selectSubCodeList(String code);
}
