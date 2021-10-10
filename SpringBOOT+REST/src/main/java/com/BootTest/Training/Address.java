package com.BootTest.Training;

import java.util.List;

public class Address {

	private String State,City,Country;
	private long ZipCode;
	public Address(String state, String city, String country, long zipCode) {
		super();
		State = state;
		City = city;
		Country = country;
		ZipCode = zipCode;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public long getZipCode() {
		return ZipCode;
	}
	public void setZipCode(long zipCode) {
		ZipCode = zipCode;
	}
	
	
}
