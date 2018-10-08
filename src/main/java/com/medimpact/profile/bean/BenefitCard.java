package com.medimpact.profile.bean;

/**
 * 
 * @author chengalvarayan_m
 *
 */
public class BenefitCard {
	private String benefitCardId;
	private String memberName;
	private String benefitHealthPlan;
	private String rxGrp;
	private String rxBin;
	private String rxPcn;

	public String getBenefitCardId() {
		return benefitCardId;
	}
	public void setBenefitCardId(String benefitCardId) {
		this.benefitCardId = benefitCardId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getBenefitHealthPlan() {
		return benefitHealthPlan;
	}
	public void setBenefitHealthPlan(String benefitHealthPlan) {
		this.benefitHealthPlan = benefitHealthPlan;
	}
	public String getRxGrp() {
		return rxGrp;
	}
	public void setRxGrp(String rxGrp) {
		this.rxGrp = rxGrp;
	}
	public String getRxBin() {
		return rxBin;
	}
	public void setRxBin(String rxBin) {
		this.rxBin = rxBin;
	}
	public String getRxPcn() {
		return rxPcn;
	}
	public void setRxPcn(String rxPcn) {
		this.rxPcn = rxPcn;
	}
}
