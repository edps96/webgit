package egovframework.example.parking.service;

import java.util.Date;

import org.apache.ibatis.type.Alias;

@Alias("CodeVO")
public class CodeVO {

	/** 코드 NO */
	public Integer codeNo;
	/** 상위 코드 */
	public String upperCode;
	/** 코드 */
	public String code;
	/** 코드명 */
	public String codeNm;
	/** 단계 */
	public Integer depth;
	/** 순서 */
	public Integer ord;
	/** 비고 */
	public String remark;
	/** 사용여부 */
	public String useYn;
	/** 삭제여부 */
	public String delYn;
	/** 등록일 */
	public Date regDt;
	/** 등록자 */
	public String regId;
	/** 수정일 */
	public Date updateDt;
	/** 수정자 */
	public String updateId;

	public Integer getCodeNo() {
		return codeNo;
	}
	public void setCodeNo(Integer codeNo) {
		this.codeNo = codeNo;
	}
	public String getUpperCode() {
		return upperCode;
	}
	public void setUpperCode(String upperCode) {
		this.upperCode = upperCode;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCodeNm() {
		return codeNm;
	}
	public void setCodeNm(String codeNm) {
		this.codeNm = codeNm;
	}
	public Integer getDepth() {
		return depth;
	}
	public void setDepth(Integer depth) {
		this.depth = depth;
	}
	public Integer getOrd() {
		return ord;
	}
	public void setOrd(Integer ord) {
		this.ord = ord;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
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

}
