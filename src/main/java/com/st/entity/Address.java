/**
Address entity Class
 */
package com.st.entity;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Embeddable
public class Address {
	@NotNull(message = "This field is required")
	private String detailedAddress;
	@NotNull(message = "This field is required")
    private String city;
	@NotNull(message = "This field is required")
    private String state;
	@Pattern(regexp = "^\\d{6}$", message = "Pincode must be 6 digits")
    private String pincode;
	public String getDetailedAddress() {
		return detailedAddress;
	}
	public void setDetailedAddress(String detailedAddress) {
		this.detailedAddress = detailedAddress;
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
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

}
