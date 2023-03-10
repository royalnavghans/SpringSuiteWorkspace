package com.spring.Profiles.beans;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Country {
@Id
@Column(name = "Country_Name")
	private String CountryName;
@Column(name = "Country_Capital")
	private String CountryCapital;
@Column(name = "Country_Code")
	private int CountryCode;
	public Country(String countryName, String countryCapital, int countryCode) {
		super();
		CountryName = countryName;
		CountryCapital = countryCapital;
		CountryCode = countryCode;
	}
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCountryName() {
		return CountryName;
	}
	public void setCountryName(String countryName) {
		CountryName = countryName;
	}
	public String getCountryCapital() {
		return CountryCapital;
	}
	public void setCountryCapital(String countryCapital) {
		CountryCapital = countryCapital;
	}
	public int getCountryCode() {
		return CountryCode;
	}
	public void setCountryCode(int countryCode) {
		CountryCode = countryCode;
	}
	
	
}
