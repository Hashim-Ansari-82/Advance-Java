package com.test;

import java.util.*;
import jakarta.persistence.*;
 
@Entity
class College{
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollno;
   @Column(name="Student_name")
	private String name;
   @Column(name="Student_Address")  
	private String address;
    private String state;
	private int age;
	@Column(name="Date")
	@Temporal(TemporalType.DATE)
	private Date addedDate;
	public Date getAddedDate() {
		return addedDate;
	}
	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	@Lob
	@Column(name = "IMAGE", columnDefinition = "LONGBLOB")
	private byte[] image;
	public College(int rollno, String name, String address, int age, String state, Date addedDate, byte[] image) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
		this.age = age;
		this.state = state;
		this.addedDate = addedDate;
		this.image = image;
	}
	public College() {

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Certificate [rollno=" + rollno + ", name=" + name + ", address=" + address + ", age=" + age + ", state="
				+ state + ", addedDate=" + addedDate + ", image=" + Arrays.toString(image) + "]";
	}
	
}