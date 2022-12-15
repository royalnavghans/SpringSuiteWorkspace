package com.spring.Profiles2.beans;



public class Country {


	private String CountryName;

	private String CountryCapital;

	private int CountryCode;
	public Country(String countryName, String countryCapital, int countryCode) {
		super();
		CountryName = countryName;
		CountryCapital = countryCapital;
		CountryCode = countryCode;
	}
	public Country() {
		super();
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
