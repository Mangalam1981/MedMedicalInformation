package com.medimpact.profile.bean;

import java.util.List;

/**
 * 
 * @author mohankumara_n
 *
 */
public class MedicalInformation {
	
	private Long memberNumber;
	private List<Allergies> allergies;
	private List<OtherAllergies> otherAllergies;
	private List<HealthConditions> healthConditions;
	private List<OtherHealthConditions> otherHealthConditions;
	
	public List<Allergies> getAllergies() {
		return allergies;
	}
	public void setAllergies(List<Allergies> allergies) {
		this.allergies = allergies;
	}
	public List<OtherAllergies> getOtherAllergies() {
		return otherAllergies;
	}
	public void setOtherAllergies(List<OtherAllergies> otherAllergies) {
		this.otherAllergies = otherAllergies;
	}
	public List<HealthConditions> getHealthConditions() {
		return healthConditions;
	}
	public void setHealthConditions(List<HealthConditions> healthConditions) {
		this.healthConditions = healthConditions;
	}
	public List<OtherHealthConditions> getOtherHealthConditions() {
		return otherHealthConditions;
	}
	public void setOtherHealthConditions(List<OtherHealthConditions> otherHealthConditions) {
		this.otherHealthConditions = otherHealthConditions;
	}
	public Long getMemberNumber() {
		return memberNumber;
	}
	public void setMemberNumber(Long memberNumber) {
		this.memberNumber = memberNumber;
	}	
}
