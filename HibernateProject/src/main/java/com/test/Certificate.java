package com.test;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Certificate {
    
	@Id
	private int certificate_id,certificate_no;
	private String certificate_name,certificate_title,student_id,student_name;
	@Temporal(TemporalType.DATE)
	private Date date;
	
	public Certificate(int certificate_id, int certificate_no, String certificate_name, String certificate_title,
			String student_id, String student_name, Date date) {
		super();
		this.certificate_id = certificate_id;
		this.certificate_no = certificate_no;
		this.certificate_name = certificate_name;
		this.certificate_title = certificate_title;
		this.student_id = student_id;
		this.student_name = student_name;
		this.date = date;
	}
	public Certificate() {
		super();
	}
	public int getCertificate_id() {
		return certificate_id;
	}
	public void setCertificate_id(int certificate_id) {
		this.certificate_id = certificate_id;
	}
	public int getCertificate_no() {
		return certificate_no;
	}
	public void setCertificate_no(int certificate_no) {
		this.certificate_no = certificate_no;
	}
	public String getCertificate_name() {
		return certificate_name;
	}
	public void setCertificate_name(String certificate_name) {
		this.certificate_name = certificate_name;
	}
	public String getCertificate_title() {
		return certificate_title;
	}
	public void setCertificate_title(String certificate_title) {
		this.certificate_title = certificate_title;
	}
	public String getStudent_id() {
		return student_id;
	}
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
