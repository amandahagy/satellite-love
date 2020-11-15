package com.shiningstars.satellitelove.entity;

import java.io.Serializable;
import java.util.Calendar;

public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String email;
	private String password;
	private Calendar birthday;
	private String name;
	private Calendar creationDate;
	private byte sun;
	private byte asc;
	private byte house5;
	private byte house7;
	private byte moon;
	private byte venus;
	private byte mars;
	
	public User() {
		creationDate = Calendar.getInstance();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Calendar getBirthday() {
		return birthday;
	}

	public void setBirthday(Calendar birthday) {
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Calendar getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Calendar creationDate) {
		this.creationDate = creationDate;
	}

	public byte getSun() {
		return sun;
	}

	public void setSun(byte sun) {
		this.sun = sun;
	}

	public byte getAsc() {
		return asc;
	}

	public void setAsc(byte asc) {
		this.asc = asc;
	}

	public byte getHouse5() {
		return house5;
	}

	public void setHouse5(byte house5) {
		this.house5 = house5;
	}

	public byte getHouse7() {
		return house7;
	}

	public void setHouse7(byte house7) {
		this.house7 = house7;
	}

	public byte getMoon() {
		return moon;
	}

	public void setMoon(byte moon) {
		this.moon = moon;
	}

	public byte getVenus() {
		return venus;
	}

	public void setVenus(byte venus) {
		this.venus = venus;
	}

	public byte getMars() {
		return mars;
	}

	public void setMars(byte mars) {
		this.mars = mars;
	}
	
}