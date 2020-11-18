package com.shiningstars.satellitelove.entity;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_SLS_USER")
@SequenceGenerator(name="sqUser",
sequenceName="SEQ_NAME", allocationSize=1)
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sqUser")
	@Column(name = "cd_user")
	private int id;
	
	@Column(name = "ds_email")
	private String email;
	
	@Column(name = "ds_password")
	private String password;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_birth")
	private Calendar birthday;
	
	@Column(name = "nm_name")
	private String name;
	
	@Column(name = "vl_gender")
	private byte gender;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_creation")
	private Calendar creationDate;
	
	@Column(name = "vl_sun")
	private byte sun;
	
	@Column(name = "vl_asc")
	private byte asc;
	
	@Column(name = "vl_house5")
	private byte house5;
	
	@Column(name = "vl_house7")
	private byte house7;
	
	@Column(name = "vl_moon")
	private byte moon;
	
	@Column(name = "vl_venus")
	private byte venus;
	
	@Column(name = "vl_mars")
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
	
	public byte getGender() {
		return gender;
	}
	
	public void setGender(byte gender) {
		this.gender = gender;
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
	
	public String toString() {
		return "User [id = " + id + ", email = " + email + ", password = " + password + ", birthday =" + birthday + ", name = " + name + ", gender = " + gender + ", creation date = " + creationDate + ", sun = " + sun + ", ascendant = " + asc + ", 5th house = " + house5 + ", 7th house" + house7 + "moon = " + moon + ", venus = " + venus + ", mars = " + mars + "]";
	}
	
}