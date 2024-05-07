package com.entity;

public class Book {
	private int bid;
	private String name;
	private String author;
	private double price;
	private String cat;
	private String status;
	private String file;
	private String email;
	

	public Book() {
		
	}
	
	
	public Book(int bid, String author, double price, String cat, String status, String file, String email, String name) {
		super();
		this.bid = bid;
		this.author = author;
		this.price = price;
		this.cat = cat;
		this.status = status;
		this.file = file;
		this.email = email;
		this.name= name;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCat() {
		return cat;
	}
	public void setCat(String cat) {
		this.cat = cat;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", author=" + author + ", price=" + price + ", cat=" + cat + ", status=" + status
				+ ", file=" + file + ", email=" + email + "]";
	}
	
	
	
	

}
