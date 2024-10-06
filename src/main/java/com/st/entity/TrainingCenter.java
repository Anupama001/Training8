/**
Training Center entity Class
 */
package com.st.entity;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
@Entity
public class TrainingCenter {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int  id;
	@NotBlank(message="user name can not be empty!-- ") 
	@Size(max=40,message="less than 40 characters!--" )	
	private String centerName;
	@NotNull
	@Pattern(regexp = "^[a-zA-Z0-9]{12}$", message = "Center code must be exactly 12 character alphanumeric")
	private String centerCode;
	@Embedded
	private Address address;
	@Min(value = 0, message = "Capacity cannot be negative")
	private Integer studentCapacity;
	@ElementCollection
	private List<String> coursesOffered;
	private Long createdOn;
	@Email(message = "Ensure it follows 'example@domain.com'")
	private String contactEmail;
	@Pattern(regexp = "^\\d{10}$", message = "Phone number must contain exactly 10 digits")
	private String contactPhone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCenterName() {
		return centerName;
	}
	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}
	public String getCenterCode() {
		return centerCode;
	}
	public void setCenterCode(String centerCode) {
		this.centerCode = centerCode;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Integer getStudentCapacity() {
		return studentCapacity;
	}
	public void setStudentCapacity(Integer studentCapacity) {
		this.studentCapacity = studentCapacity;
	}
	public List<String> getCoursesOffered() {
		return coursesOffered;
	}
	public void setCoursesOffered(List<String> coursesOffered) {
		this.coursesOffered = coursesOffered;
	}
	public Long getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Long createdOn) {
		this.createdOn = createdOn;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public String getContactPhone() {
		return contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	


}
