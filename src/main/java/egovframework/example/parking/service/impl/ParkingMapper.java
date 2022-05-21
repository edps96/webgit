package egovframework.example.parking.service.impl;

import java.util.List;

import egovframework.example.parking.service.CodeVO;
import egovframework.example.parking.service.ParkingVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("ParkingMapper")
public interface ParkingMapper {

	/**
	 * 목록 조회
	 * @param parkingVO
	 * @return
	 */
	ParkingVO selectParking(ParkingVO parkingVO);

	/**
	 * 코드 조회
	 * @param parkingVO
	 * @return
	 */
	List<CodeVO> selectSubCodeList(String code);

}
