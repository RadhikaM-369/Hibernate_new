package com.xworkz.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="State_details")

public class StateEntity implements Serializable{
	@Id	//primitive key
	@Column(name="s_id")
private int state_id;
	
	@Column(name="s_name")
private String state_name;
	
	@Column(name="s_famous")
private String famousFor;
	
	@Column(name="s_capital")
private String capital;
	
	@Column(name="s_population")
private long population;

public StateEntity() {
	System.out.println("Its default constructor");
}
public StateEntity(int state_id, String state_name, String famousFor, String capital, long population) {
	super();
	this.state_id = state_id;
	this.state_name = state_name;
	this.famousFor = famousFor;
	this.capital = capital;
	this.population = population;
}

public int getState_id() {
	return state_id;
}
public void setState_id(int state_id) {
	this.state_id = state_id;
}
public String getState_name() {
	return state_name;
}
public void setState_name(String state_name) {
	this.state_name = state_name;
}
public String getFamousFor() {
	return famousFor;
}
public void setFamousFor(String famousFor) {
	this.famousFor = famousFor;
}
public String getCapital() {
	return capital;
}
public void setCapital(String capital) {
	this.capital = capital;
}
public long getPopulation() {
	return population;
}
public void setPopulation(long population) {
	this.population = population;
}
@Override
public String toString() {
	return "StateEntity [state_id=" + state_id + ", state_name=" + state_name + ", famousFor=" + famousFor
			+ ", capital=" + capital + ", population=" + population + "]";
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




