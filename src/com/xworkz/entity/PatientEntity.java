package com.xworkz.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Patients_details")
public class PatientEntity implements Serializable{
	@Id
	@Column(name="pid")
private int p_id;
	
	@Column(name="pname")	
private String p_name;
	
	@Column(name="pplace")
private String p_place;
	
	@Column(name="page")
private int p_age;

public PatientEntity() {
	
}

public PatientEntity(int p_id, String p_name, String p_place, int p_age) {
	super();
	this.p_id = p_id;
	this.p_name = p_name;
	this.p_place = p_place;
	this.p_age = p_age;
}

public int getP_id() {
	return p_id;
}
public void setP_id(int p_id) {
	this.p_id = p_id;
}
public String getP_name() {
	return p_name;
}
public void setP_name(String p_name) {
	this.p_name = p_name;
}
public String getP_place() {
	return p_place;
}
public void setP_place(String p_place) {
	this.p_place = p_place;
}
public int getP_age() {
	return p_age;
}
public void setP_age(int p_age) {
	this.p_age = p_age;
}

@Override
public String toString() {
	return "PatientEntity [p_id=" + p_id + ", p_name=" + p_name + ", p_place=" + p_place + ", p_age=" + p_age + "]";
}

@Override
public int hashCode() {
	return super.hashCode();
}

@Override
public boolean equals(Object obj) {
	return super.equals(obj);
}


}
