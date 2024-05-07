package com.entity;

public class user {
	public int uid;
	public String name;
	public String email;
	public String phone;
	public String password;
	public String address;
	public String city;
	public String state;
	public String zip;
	public String photo;
	public String role;
	
	
	
	
	
	public user() {
		super();
	}
	
	
	public user(int uid, String name, String email, String phone, String password, String address, String city,
			String state, String zip, String photo, String role) {
		super();
		this.uid = uid;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.photo = photo;
		this.role= role;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "user [uid=" + uid + ", name=" + name + ", email=" + email + ", phone=" + phone + ", password="
				+ password + ", address=" + address + ", city=" + city + ", state=" + state + ", zip=" + zip
				+ ", photo=" + photo + ", role "+ role+ "]";
	}
	
	
	
	

}
