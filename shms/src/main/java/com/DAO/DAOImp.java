package com.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.Entity.*;

public class DAOImp implements DAO{
	private Connection conn;
	public  DAOImp(Connection conn) {
		super();
		this.conn= conn;
	}

	@Override
	public boolean MbRegister(mborders b) {
		boolean r= false;
		int mbid = b.getMbid();
		int mid = b.getMid();
		String mbnam = b.getMbnam();
		String mbpho= b.getMbpho();
		String mbmai =b.getMbmai();
		String mbpas= b.getMbpass();
		String mbadd= b.getMbadd();
		String mbrol = b.getMbrol();
		Double mbdep= b.getMbdep();
		Double mbmel= b.getMbmel();
		Double mbrem= b.getMbrem();
		Double mbcon= b.getMbcon();
		
		String sql = "INSERT INTO mborders(mbnam, mbpho,mbmai,  mbadd, mbpas) Values(?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, mbnam);
			ps.setString(2, mbpho);
			ps.setString(3, mbmai);
			ps.setString(4, mbadd);
			ps.setString(5, mbpas);
			
			 r = ps.execute();
			 if(r) {
				 System.out.println("user registered");
			 }
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		return r;
	}

}
