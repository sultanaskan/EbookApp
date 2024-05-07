package com.entity;

public class Cart {
	private int cid;
	private int uid;
	private int bid;
	private String bname;
	private String author;
	private double price;
	private String phone;
	private String address;
	private String email;

	public Cart() {

	}

	public Cart(int cid, int uid, int bid, String bname, String author, double price, String phone, String address, String email) {
		super();
		this.cid = cid;
		this.uid = uid;
		this.bid = bid;
		this.bname = bname;
		this.author=author;
		this.price = price;
		this.phone = phone;
		this.address = address;
		this.email = email;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Cart [cid=" + cid + ", uid=" + uid + ", bid=" + bid + ", bname=" + bname + ", price=" + price
				+ ", phone=" + phone + ", address=" + address + ", email=" + email + "]";
	}

}
