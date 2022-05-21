package egovframework.example.parking.service;

import org.apache.ibatis.type.Alias;

@Alias("TestVO")
public class TestVO {

	private String  testCheck;
	private String  buildingForm;
	
	public String getTestCheck() {
		return testCheck;
	}
	public void setTestCheck(String testCheck) {
		this.testCheck = testCheck;
	}
	public String getBuildingForm() {
		return buildingForm;
	}
	public void setBuildingForm(String buildingForm) {
		this.buildingForm = buildingForm;
	}




}
