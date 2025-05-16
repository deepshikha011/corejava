package com.abc.practice6;

public class Country {
	//multilevel- level by level inherit the data
	
	private String countryName;
	private String capital;
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", capital=" + capital + "]";
	}
	
	

}
