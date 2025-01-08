package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Accounts {

	@Id
	private long acc_Number;
	private String name;
	private long mobile;
	private long ammount;
	private String address;

	public Accounts() {

	}

	public Accounts(long acc_Number, String name, long mobile, long ammount, String address) {
		super();
		this.acc_Number = acc_Number;
		this.name = name;
		this.mobile = mobile;
		this.ammount = ammount;
		this.address = address;
	}

	public long getAcc_Number() {
		return acc_Number;
	}

	public void setAcc_Number(long acc_Number) {
		this.acc_Number = acc_Number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public long getAmmount() {
		return ammount;
	}

	public void setAmmount(long ammount) {
		this.ammount = ammount;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Accounts [acc_Number=" + acc_Number + ", name=" + name + ", mobile=" + mobile + ", ammount=" + ammount
				+ ", address=" + address + "]";
	}
}