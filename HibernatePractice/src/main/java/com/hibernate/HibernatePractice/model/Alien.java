package com.hibernate.HibernatePractice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien {

	@Id
	private int aid;
	private String aname;
	private String color;

	public Alien() {
		super();
	}

	public Alien(int aid, String aname, String color) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.color = color;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
	}

}
