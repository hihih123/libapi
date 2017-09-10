package com.example.libapi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Libinfo {
	
	@Id
	@GeneratedValue
	private Integer serial;
	private String name;
	private String location;
	private String location2;
	private String ptype;
	private String holiday;
	private String starttime;
	private String endtime;
	private String seatsnum;
	private String booksnum;
	private String address;
	private String tel;
	private String website;
	private String ypoint;
	private String xpoint;
	private String refreshdate;
	
	public Libinfo() {}
	public Libinfo(String name) {
		this.name = name;
	}
	public Integer getSerial() {
		return serial;
	}
	public void setSerial(Integer serial) {
		this.serial = serial;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getLocation2() {
		return location2;
	}
	public void setLocation2(String location2) {
		this.location2 = location2;
	}
	public String getPtype() {
		return ptype;
	}
	public void setPtype(String ptype) {
		this.ptype = ptype;
	}
	public String getHoliday() {
		return holiday;
	}
	public void setHoliday(String holiday) {
		this.holiday = holiday;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	public String getSeatsnum() {
		return seatsnum;
	}
	public void setSeatsnum(String seatsnum) {
		this.seatsnum = seatsnum;
	}
	public String getBooksnum() {
		return booksnum;
	}
	public void setBooksnum(String booksnum) {
		this.booksnum = booksnum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getYpoint() {
		return ypoint;
	}
	public void setYpoint(String ypoint) {
		this.ypoint = ypoint;
	}
	public String getXpoint() {
		return xpoint;
	}
	public void setXpoint(String xpoint) {
		this.xpoint = xpoint;
	}
	public String getRefreshdate() {
		return refreshdate;
	}
	public void setRefreshdate(String refreshdate) {
		this.refreshdate = refreshdate;
	}
	
	

}
