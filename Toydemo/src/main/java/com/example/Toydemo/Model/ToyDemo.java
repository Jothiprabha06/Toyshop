package com.example.Toydemo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="demo")
public class ToyDemo {
@Id
@Column(unique=true)
private int Sno;
@Column(name="Toyname",nullable=false)
private String Toyname;
@Column(name="Cost",nullable=false)
private int Cost;

ToyDemo(){}

public int getSno() {
	return Sno;
}

public void setSno(int sno) {
	Sno = sno;
}

public String getToyname() {
	return Toyname;
}

public void setToyname(String toyname) {
	Toyname = toyname;
}

public int getCost() {
	return Cost;
}

public void setCost(int cost) {
	Cost = cost;
}




}
