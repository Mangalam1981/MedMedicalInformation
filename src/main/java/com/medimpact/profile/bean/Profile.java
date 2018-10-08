package com.medimpact.profile.bean;

import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * 
 * @author chengalvarayan_m
 *
 */
@JsonRootName(value="memberProfile")
@JsonIgnoreProperties(value = {"listOfAddressTypes"}, allowGetters = false)
public class Profile {
	private Long memberId;
	private String memberName;
	private String memberRelationship;
	private Integer memberInsuredNo;
	private String language;
	private String dateOfBirth;
	private String email;
	private List<MemberAddress> addresses;
	private List<String> listOfAddressTypes;
	private List<Phone> phones; 
	private BenefitCard benefitCard;

	@NotNull
	@Min(value = 11111111, message = "The minimum member id should be 11111111")
	@Max(value = 99999999, message = "The maximum member id can not more than 99999999")
	public Long getMemberId() {
		return memberId;
	}
	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}
	@NotBlank
	@Length(max = 50, min = 5, message = "The member name should be within 5 to 50 characters")
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberRelationship() {
		return memberRelationship;
	}
	public void setMemberRelationship(String memberRelationship) {
		this.memberRelationship = memberRelationship;
	}
	public Integer getMemberInsuredNo() {
		return memberInsuredNo;
	}
	public void setMemberInsuredNo(Integer memberInsuredNo) {
		this.memberInsuredNo = memberInsuredNo;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public List<MemberAddress> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<MemberAddress> addresses) {
		this.addresses = addresses;
	}
	public BenefitCard getBenefitCard() {
		return benefitCard;
	}
	public void setBenefitCard(BenefitCard benefitCard) {
		this.benefitCard = benefitCard;
	}
	public List<String> getListOfAddressTypes() {
		return listOfAddressTypes;
	}
	public void setListOfAddressTypes(List<String> listOfAddressTypes) {
		this.listOfAddressTypes = listOfAddressTypes;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public List<Phone> getPhones() {
		return phones;
	}
	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
