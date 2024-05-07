package com.Entity;

public class mborders {
	int mbid;
	int mid;
	String mbnam;
	String mbpho;
	String mbmai;
	String mbadd;
	String mbpass;
	String mbrol;
	@Override
	public String toString() {
		return "mborders [mbid=" + mbid + ", mid=" + mid + ", mbnam=" + mbnam + ", mbpho=" + mbpho + ", mbmai=" + mbmai
				+ ", mbadd=" + mbadd + ", mbpass=" + mbpass + ", mbrol=" + mbrol + ", mbdep=" + mbdep + ", mbmel="
				+ mbmel + ", mbrem=" + mbrem + ", mbcon=" + mbcon + "]";
	}
	public int getMbid() {
		return mbid;
	}
	public void setMbid(int mbid) {
		this.mbid = mbid;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMbnam() {
		return mbnam;
	}
	public void setMbnam(String mbnam) {
		this.mbnam = mbnam;
	}
	public String getMbpho() {
		return mbpho;
	}
	public void setMbpho(String mbpho) {
		this.mbpho = mbpho;
	}
	public String getMbmai() {
		return mbmai;
	}
	public void setMbmai(String mbmai) {
		this.mbmai = mbmai;
	}
	public String getMbadd() {
		return mbadd;
	}
	public void setMbadd(String mbadd) {
		this.mbadd = mbadd;
	}
	public String getMbpass() {
		return mbpass;
	}
	public void setMbpass(String mbpass) {
		this.mbpass = mbpass;
	}
	public String getMbrol() {
		return mbrol;
	}
	public void setMbrol(String mbrol) {
		this.mbrol = mbrol;
	}
	public Double getMbdep() {
		return mbdep;
	}
	public void setMbdep(Double mbdep) {
		this.mbdep = mbdep;
	}
	public Double getMbmel() {
		return mbmel;
	}
	public void setMbmel(Double mbmel) {
		this.mbmel = mbmel;
	}
	public Double getMbrem() {
		return mbrem;
	}
	public void setMbrem(Double mbrem) {
		this.mbrem = mbrem;
	}
	public Double getMbcon() {
		return mbcon;
	}
	public void setMbcon(Double mbcon) {
		this.mbcon = mbcon;
	}
	Double mbdep;
	Double mbmel;
	Double mbrem;
	Double mbcon;
	

}
