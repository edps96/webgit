package egovframework.example.parking.service;

import java.util.Date;

import org.apache.ibatis.type.Alias;

@Alias("ParkingVO")
public class ParkingVO {

	private String  parkingCode;
	private String  parkingNm;
	private String  businessNm;
	private String  businessNo;
	private String  buildingNm;
	private String  buildingForm;
	private String  postCode;
	private String  address;
	private String  detailAddress;
	private String  lat;
	private String  lng;
	private String  cellNum;
	private String  email;
	private String  parkingForm;
	private String  availableCar;
	private String  useGb;
	private String  useStHh;
	private String  useStMm;
	private String  useEndHh;
	private String  useEndMm;
	private Integer fileNo;
	private Integer totalParkingCnt;
	private Integer ticketParkingCnt;
	private String  ticketUseYn;
	private String  cancelDay;
	private String  additional;
	private String  useYn;
	private String  delYn;
	private Date    regDt;
	private String  regId;
	private Date    updateDt;
	private String  updateId;
	private Integer ticketUseCnt;  //이용중인주차대수
	private Integer totalAmt;      //총 결제금액
	private Integer cancelAmt;      //총 결제금액
	private String  mallId;     // 가맹점ID
	private String  vanName;    // 밴사(NICE, KICC)
	private String  vanMode;    // 밴사(live, test)
	private String  parkingInfo;
	private String  holidayYn;
	private String  freeMin;
	private String  freeYn;
	private String  basicMin;
	private Integer  basicFee;
	private String  basicYn;
	private String  surMin;
	private Integer  surFee;
	private String  surYn;
	private Integer  dailyFee;
	private String  dailyYn;
	private Integer  dailyMaxFee;
	private String  dailyMaxYn;
	private String refundPolicy;



	public String getParkingCode() {
		return parkingCode;
	}
	public void setParkingCode(String parkingCode) {
		this.parkingCode = parkingCode;
	}
	public String getParkingNm() {
		return parkingNm;
	}
	public void setParkingNm(String parkingNm) {
		this.parkingNm = parkingNm;
	}
	public String getBusinessNm() {
		return businessNm;
	}
	public void setBusinessNm(String businessNm) {
		this.businessNm = businessNm;
	}
	public String getBusinessNo() {
		return businessNo;
	}
	public void setBusinessNo(String businessNo) {
		this.businessNo = businessNo;
	}
	public String getBuildingNm() {
		return buildingNm;
	}
	public void setBuildingNm(String buildingNm) {
		this.buildingNm = buildingNm;
	}
	public String getBuildingForm() {
		return buildingForm;
	}
	public void setBuildingForm(String buildingForm) {
		this.buildingForm = buildingForm;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDetailAddress() {
		return detailAddress;
	}
	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLng() {
		return lng;
	}
	public void setLng(String lng) {
		this.lng = lng;
	}
	public String getCellNum() {
		return cellNum;
	}
	public void setCellNum(String cellNum) {
		this.cellNum = cellNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getParkingForm() {
		return parkingForm;
	}
	public void setParkingForm(String parkingForm) {
		this.parkingForm = parkingForm;
	}
	public String getAvailableCar() {
		return availableCar;
	}
	public void setAvailableCar(String availableCar) {
		this.availableCar = availableCar;
	}
	public String getUseGb() {
		return useGb;
	}
	public void setUseGb(String useGb) {
		this.useGb = useGb;
	}
	public String getUseStHh() {
		return useStHh;
	}
	public void setUseStHh(String useStHh) {
		this.useStHh = useStHh;
	}
	public String getUseStMm() {
		return useStMm;
	}
	public void setUseStMm(String useStMm) {
		this.useStMm = useStMm;
	}
	public String getUseEndHh() {
		return useEndHh;
	}
	public void setUseEndHh(String useEndHh) {
		this.useEndHh = useEndHh;
	}
	public String getUseEndMm() {
		return useEndMm;
	}
	public void setUseEndMm(String useEndMm) {
		this.useEndMm = useEndMm;
	}
	public Integer getFileNo() {
		return fileNo;
	}
	public void setFileNo(Integer fileNo) {
		this.fileNo = fileNo;
	}
	public Integer getTotalParkingCnt() {
		return totalParkingCnt;
	}
	public void setTotalParkingCnt(Integer totalParkingCnt) {
		this.totalParkingCnt = totalParkingCnt;
	}
	public Integer getTicketParkingCnt() {
		return ticketParkingCnt;
	}
	public void setTicketParkingCnt(Integer ticketParkingCnt) {
		this.ticketParkingCnt = ticketParkingCnt;
	}
	public String getTicketUseYn() {
		return ticketUseYn;
	}
	public void setTicketUseYn(String ticketUseYn) {
		this.ticketUseYn = ticketUseYn;
	}
	public String getCancelDay() {
		return cancelDay;
	}
	public void setCancelDay(String cancelDay) {
		this.cancelDay = cancelDay;
	}
	public String getAdditional() {
		return additional;
	}
	public void setAdditional(String additional) {
		this.additional = additional;
	}
	public String getUseYn() {
		return useYn;
	}
	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}
	public String getDelYn() {
		return delYn;
	}
	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}
	public Date getRegDt() {
		return regDt;
	}
	public void setRegDt(Date regDt) {
		this.regDt = regDt;
	}
	public String getRegId() {
		return regId;
	}
	public void setRegId(String regId) {
		this.regId = regId;
	}
	public Date getUpdateDt() {
		return updateDt;
	}
	public void setUpdateDt(Date updateDt) {
		this.updateDt = updateDt;
	}
	public String getUpdateId() {
		return updateId;
	}
	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}
	public Integer getTicketUseCnt() {
		return ticketUseCnt;
	}
	public void setTicketUseCnt(Integer ticketUseCnt) {
		this.ticketUseCnt = ticketUseCnt;
	}
	public Integer getTotalAmt() {
		return totalAmt;
	}
	public void setTotalAmt(Integer totalAmt) {
		this.totalAmt = totalAmt;
	}
	public Integer getCancelAmt() {
		return cancelAmt;
	}
	public void setCancelAmt(Integer cancelAmt) {
		this.cancelAmt = cancelAmt;
	}
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public String getVanName() {
		return vanName;
	}
	public void setVanName(String vanName) {
		this.vanName = vanName;
	}
	public String getVanMode() {
		return vanMode;
	}
	public void setVanMode(String vanMode) {
		this.vanMode = vanMode;
	}
	public String getParkingInfo() {
		return parkingInfo;
	}
	public void setParkingInfo(String parkingInfo) {
		this.parkingInfo = parkingInfo;
	}
	public String getHolidayYn() {
		return holidayYn;
	}
	public void setHolidayYn(String holidayYn) {
		this.holidayYn = holidayYn;
	}
	public String getFreeMin() {
		return freeMin;
	}
	public void setFreeMin(String freeMin) {
		this.freeMin = freeMin;
	}
	public String getFreeYn() {
		return freeYn;
	}
	public void setFreeYn(String freeYn) {
		this.freeYn = freeYn;
	}
	public String getBasicMin() {
		return basicMin;
	}
	public void setBasicMin(String basicMin) {
		this.basicMin = basicMin;
	}
	public Integer getBasicFee() {
		return basicFee;
	}
	public String getBasicYn() {
		return basicYn;
	}
	public void setBasicYn(String basicYn) {
		this.basicYn = basicYn;
	}
	public String getSurMin() {
		return surMin;
	}
	public void setSurMin(String surMin) {
		this.surMin = surMin;
	}
	public Integer getSurFee() {
		return surFee;
	}
	public void setSurFee(Integer surFee) {
		this.surFee = surFee;
	}
	public String getSurYn() {
		return surYn;
	}
	public void setSurYn(String surYn) {
		this.surYn = surYn;
	}
	public Integer getDailyFee() {
		return dailyFee;
	}
	public void setDailyFee(Integer dailyFee) {
		this.dailyFee = dailyFee;
	}
	public String getDailyYn() {
		return dailyYn;
	}
	public void setDailyYn(String dailyYn) {
		this.dailyYn = dailyYn;
	}
	public Integer getDailyMaxFee() {
		return dailyMaxFee;
	}
	public void setDailyMaxFee(Integer dailyMaxFee) {
		this.dailyMaxFee = dailyMaxFee;
	}
	public String getDailyMaxYn() {
		return dailyMaxYn;
	}
	public void setDailyMaxYn(String dailyMaxYn) {
		this.dailyMaxYn = dailyMaxYn;
	}
	public void setBasicFee(Integer basicFee) {
		this.basicFee = basicFee;
	}
	public String getRefundPolicy() {
		return refundPolicy;
	}
	public void setRefundPolicy(String refundPolicy) {
		this.refundPolicy = refundPolicy;
	}
}
