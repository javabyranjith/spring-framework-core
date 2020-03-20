package jbr.annotation.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	@Autowired
	private Address address;
	private Education education;

	/*
	 * public Address getAddress() { return address; }
	 * 
	 * public void setAddress(Address address) { this.address = address; }
	 */

	public Education getEducation() {
		return education;
	}

	public void setEducation(Education education) {
		this.education = education;
	}

	@Override
	public String toString() {
		return address.getStreeName();
	}
}
