package com.abhi.springdemo.patient.registration;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
public class RegistrationEntity {

	@Id
	@Column(name= "patient_id")
	int id;

	@Column
	String first_name;
	
	@Column
	String Last_name;
	
	@Column
	String Gender;
	
	@Column
	String City;
	
	@Column
	String Mobile_No;
	
	@Column
	int Age;
	
	@Column
	String Address;
	
	@Column
	String Country;
	
	@Column
	String State;
	

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfirst_name() {
		return first_name;
	}

	public void setfirst_name(String first_name) {
		this.first_name = first_name;
	}
	
	

	public String getLast_name() {
		return Last_name;
	}

	public void setLast_name(String Last_name) {
		this.Last_name = Last_name;
	}

	


	public String getGender() {
		return Gender;
	}

	public void setGender(String Gender) {
		this.Gender = Gender;
	}
	
	public String getCity() {
		return City;
	}

	public void setCity(String City) {
		this.City = City;
	}
	
	
	public String getMobile_No() {
		return Mobile_No;
	}

	public void setMobile_No(String Mobile_No) {
		this.Mobile_No = Mobile_No;
	}
	
	
	public int getAge() {
		return Age;
	}

	public void setAge(int Age) {
		this.Age = Age;
	}
	
	
	public String getAddress() {
		return Address;
	}

	public void setAddress(String Address) {
		this.Address = Address;
	}
	
	
	public String getCountry() {
		return Country;
	}

	public void setCountry(String Country) {
		this.Country = Country;
	}
	
	
	public String getState() {
		return State;
	}

	public void setState(String State) {
		this.State = State;
	}
	
}
