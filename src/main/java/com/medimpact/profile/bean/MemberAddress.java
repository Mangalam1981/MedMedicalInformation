package com.medimpact.profile.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * 
 * @author chengalvarayan_m
 *
 */
@JsonIgnoreProperties(value = {"country"}, allowGetters = false)
public class MemberAddress {
	private Long id;
	private Integer doorNo;
	private String street;
	private String city;
	private String state;
	private String country;
	private Integer pinCode;
	private boolean isPrimary;
	private String type;
	private Vacation vacation;

	public Integer getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(Integer doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getPinCode() {
		return pinCode;
	}
	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}
	public boolean isPrimary() {
		return isPrimary;
	}
	public void setPrimary(boolean isPrimary) {
		this.isPrimary = isPrimary;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public Vacation getVacationDate() {
		return vacation;
	}
	public void setVacationDate(Vacation vacation) {
		this.vacation = vacation;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
}
