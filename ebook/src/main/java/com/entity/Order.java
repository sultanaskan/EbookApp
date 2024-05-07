package com.entity;

public class Order {
	int o_id;
	int c_id;
	int b_id;
	int s_id;
	
	
	
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int o_id, int c_id, int b_id, int s_id) {
		super();
		this.o_id = o_id;
		this.c_id = c_id;
		this.b_id = b_id;
		this.s_id = s_id;
	}
	@Override
	public String toString() {
		return "Order [o_id=" + o_id + ", c_id=" + c_id + ", b_id=" + b_id + ", s_id=" + s_id + "]";
	}
	public int getO_id() {
		return o_id;
	}
	public void setO_id(int o_id) {
		this.o_id = o_id;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public int getB_id() {
		return b_id;
	}
	public void setB_id(int b_id) {
		this.b_id = b_id;
	}
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	
	
	

}
