package com.DAO;

import java.util.ArrayList;


import com.entity.*;
import java.util.List;

public abstract class DAO {
	public abstract boolean RegisterUser(user u);
	public abstract user getUserByEP(String E, String p);
	public abstract boolean addNewBook(Book b);
	public abstract boolean updateBook(Book b);
	public abstract List<Book> getAllBook();
	public abstract List<Book> getRsentBook();
	public abstract List<Book> getNewBook();
	public abstract List<Book> getOldBook();
	public abstract List<Cart> getCartsByU(int uid);
	public abstract Book getBookById(int id);
	public abstract boolean removeBookById(int id);
	public abstract boolean addCart(Cart c);
	public abstract Cart chackCartByUB(int bid, int uid);
	public abstract boolean RemoveCartbyId(int cid);
	public abstract double getTotalAmount(int uid);
	public abstract int getCartsCountByUid(int uid);
	public abstract boolean saveOrder(Order o);

}
