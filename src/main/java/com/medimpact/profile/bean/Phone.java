package com.medimpact.profile.bean;

/**
 * 
 * @author chengalvarayan_m
 *
 */
public class Phone {
	private Long id;	
	private String phoneNo;
	private boolean primary;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public boolean isPrimary() {
		return primary;
	}
	public void setPrimary(boolean primary) {
		this.primary = primary;
	}
}
