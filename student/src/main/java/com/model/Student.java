package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
	//Entity : Making Product Class as a Product Table under Database
		//Id     : Making prodId Column as a Primary Key Column
		//Column : Providing our own column name instead of variable name as the column name
		//GeneratedValue: Auto_Increment
		
		@Id@GeneratedValue
		private int studId;			
		
		@Column(name="sname")
		private String studName;	
		private double fee;
public Student(){
super();	
}
public Student(int studId, String studName, double fee) {
	
	this.studId = studId;
	this.studName = studName;
	this.fee = fee;
}
public int getStudId() {
	return studId;
}
public void setStudId(int studId) {
	this.studId = studId;
}
public String getStudName() {
	return studName;
}
public void setStudName(String studName) {
	this.studName = studName;
}
public double getFee() {
	return fee;
}
public void setFee(double fee) {
	this.fee = fee;
}
@Override
public String toString() {
    return "Student [studId=" + studId + ", studName=" + studName + ", fee=" + fee + "]";
}


}
