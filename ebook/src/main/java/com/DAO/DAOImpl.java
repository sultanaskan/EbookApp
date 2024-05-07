package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Book;
import com.entity.Cart;
import com.entity.Order;
import com.entity.user;

public class DAOImpl extends DAO {
	private Connection conn;

	public DAOImpl(Connection conn) {
		super();
		this.conn = conn;
	}

	@Override
	public boolean RegisterUser(user u) {
		boolean f = false;
		try {
			String sql = "insert into user(name, email, phone, password, address, city, state, zip) values(?,?,?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, u.getName());
			ps.setString(2, u.getEmail());
			ps.setString(3, u.getPhone());
			ps.setString(4, u.getPassword());
			ps.setString(5, u.getAddress());
			ps.setString(6, u.getCity());
			ps.setString(7, u.getState());
			ps.setString(8, u.getZip());

			boolean r = ps.execute();

			if (r == false) {
				f = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	@Override
	public user getUserByEP(String E, String P) {
		user u = null;
		try {
			String sql = "select * from `ebook`.user where email= ? and password = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, E);
			ps.setString(2, P);

			ResultSet re = ps.executeQuery();
			while (re.next()) {
				u = new user();
				u.setUid(re.getInt(1));
				u.setName(re.getString(2));
				u.setEmail(re.getString(3));
				u.setPhone(re.getString(4));
				u.setPassword(re.getString(5));
				u.setAddress(re.getString(6));
				u.setCity(re.getString(7));
				u.setState(re.getString(8));
				u.setState(re.getString(9));
				u.setPhoto(re.getString(10));
				u.setRole(re.getString(11));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return u;
	}

	@Override
	public boolean addNewBook(Book b) {
		boolean r = false;
		try {
			String sql = "insert into books(name, author, price, cat, status, photo, email) values(?,?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, b.getName());
			ps.setString(2, b.getAuthor());
			ps.setDouble(3, b.getPrice());
			ps.setString(4, b.getCat());
			ps.setString(5, b.getStatus());
			ps.setString(6, b.getFile());
			ps.setString(7, b.getEmail());

			boolean f = ps.execute();
			if (f == false) {
				r = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return r;
	}

	@Override
	public boolean updateBook(Book b) {
		boolean r = false;
		try {
			String sql = "update  books set name =?, author=?, price=?, cat=?, status=? where bid = ?";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, b.getName());
			ps.setString(2, b.getAuthor());
			ps.setDouble(3, b.getPrice());
			ps.setString(4, b.getCat());
			ps.setString(5, b.getStatus());
			ps.setInt(6, b.getBid());

			int f = ps.executeUpdate();
			if (f == 1) {
				r = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return r;
	}

	@Override
	public List<Book> getAllBook() {
		List<Book> list = new ArrayList<>();
		Book b = null;

		try {
			String sql = "select * from books";
			PreparedStatement bs = conn.prepareStatement(sql);

			ResultSet re = bs.executeQuery();
			while (re.next()) {
				b = new Book();
				b.setBid(re.getInt(1));
				b.setName(re.getString(2));
				b.setAuthor(re.getString(3));
				b.setPrice(re.getDouble(4));
				b.setCat(re.getString(5));
				b.setStatus(re.getString(6));
				b.setFile(re.getString(7));
				b.setEmail(re.getString(8));

				list.add(b);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public Book getBookById(int id) {
		Book b = null;

		try {
			String sql = "select * from books Where bid= ?";
			PreparedStatement bs = conn.prepareStatement(sql);
			bs.setInt(1, id);

			ResultSet re = bs.executeQuery();

			while (re.next()) {
				b = new Book();
				b.setBid(re.getInt(1));
				b.setName(re.getString(2));
				b.setAuthor(re.getString(3));
				b.setPrice(re.getDouble(4));
				b.setCat(re.getString(5));
				b.setStatus(re.getString(6));
				b.setFile(re.getString(7));
				b.setEmail(re.getString(8));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return b;
	}

	@Override
	public List<Book> getRsentBook() {
		List<Book> list = new ArrayList<>();
		Book b = null;

		try {
			String sql = "select * from books where status=? order by bid desc";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, "Active");

			ResultSet re = ps.executeQuery();
			while (re.next()) {
				b = new Book();
				b.setBid(re.getInt(1));
				b.setName(re.getString(2));
				b.setAuthor(re.getString(3));
				b.setPrice(re.getDouble(4));
				b.setCat(re.getString(5));
				b.setStatus(re.getString(6));
				b.setFile(re.getString(7));
				b.setEmail(re.getString(8));

				list.add(b);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public List<Book> getNewBook() {
		List<Book> list = new ArrayList<>();
		Book b = null;

		try {
			String sql = "select * from books where status=? and cat=? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, "Active");
			ps.setString(2, "New");

			ResultSet re = ps.executeQuery();
			while (re.next()) {
				b = new Book();
				b.setBid(re.getInt(1));
				b.setName(re.getString(2));
				b.setAuthor(re.getString(3));
				b.setPrice(re.getDouble(4));
				b.setCat(re.getString(5));
				b.setStatus(re.getString(6));
				b.setFile(re.getString(7));
				b.setEmail(re.getString(8));

				list.add(b);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public List<Book> getOldBook() {
		List<Book> list = new ArrayList<>();
		Book b = null;

		try {
			String sql = "select * from books where status=? and cat=? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, "Active");
			ps.setString(2, "Old");

			ResultSet re = ps.executeQuery();
			while (re.next()) {
				b = new Book();
				b.setBid(re.getInt(1));
				b.setName(re.getString(2));
				b.setAuthor(re.getString(3));
				b.setPrice(re.getDouble(4));
				b.setCat(re.getString(5));
				b.setStatus(re.getString(6));
				b.setFile(re.getString(7));
				b.setEmail(re.getString(8));

				list.add(b);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public boolean removeBookById(int id) {
		boolean r = false;
		try {
			String sql = "delete from books where bid=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);

			int i = ps.executeUpdate();
			if (i == 1) {
				r = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return r;
	}

	@Override
	public boolean addCart(Cart c) {
		boolean r = false;
		try {
			String sql = "insert into carts(bid, uid, bookname,author, price, address, phone,email) values(?,?,?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, c.getBid());
			ps.setInt(2, c.getUid());
			ps.setString(3, c.getBname());
			ps.setString(4, c.getAuthor());
			ps.setDouble(5, c.getPrice());
			ps.setString(6, c.getAddress());
			ps.setString(7, c.getPhone());
			ps.setString(8, c.getEmail());

			boolean f = ps.execute();
			if (f == false) {
				r = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return r;
	}

	@Override
	public Cart chackCartByUB(int bid, int uid) {
		Cart c = null;
		try {
			String sql = "select * from carts where bid=? and uid=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, bid);
			ps.setInt(2, uid);

			ResultSet re = ps.executeQuery();
			boolean i = re.next();
			while (re.next()) {
				c = new Cart();
				c.setCid(re.getInt(1));
				c.setBid(re.getInt(2));
				c.setUid(re.getInt(3));
				c.setBname(re.getString(4));
				c.setPrice(re.getDouble(5));
				c.setAddress(re.getString(6));
				c.setPhone(re.getString(7));
				c.setEmail(re.getString(8));
			}

		} catch (Exception e) {
			e.printStackTrace();
			;
		}

		return c;
	}

	@Override
	public List<Cart> getCartsByU(int uid) {
		List<Cart> list = new ArrayList<>();
		Cart c = null;

		try {
			String sql = "select * from carts where uid=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, uid);

			ResultSet re = ps.executeQuery();
			while (re.next()) {
				c = new Cart();
				c.setCid(re.getInt(1));
				c.setBid(re.getInt(2));
				c.setUid(re.getInt(3));
				c.setBname(re.getString(4));
				c.setAuthor(re.getString(5));
				c.setPrice(re.getDouble(6));
				c.setAddress(re.getString(7));
				c.setPhone(re.getString(8));
				c.setEmail(re.getString(9));

				list.add(c);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;

	}

	@Override
	public boolean RemoveCartbyId(int cid) {
		boolean r = false;
		try {
			String sql = "delete from carts where cid=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, cid);

			int i = ps.executeUpdate();
			if (i == 1) {
				r = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return r;
	}

	@Override
	public double getTotalAmount(int uid) {
		double total = 00.0;
		try {
			String sql = "select * from carts where uid = ?";

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, uid);
			ResultSet re = ps.executeQuery();

			while (re.next()) {
				total = total + re.getInt(6);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}

	@Override
	public int getCartsCountByUid(int uid) {
		int cartsCount = 0;

		try {
			String sql = "select * from carts where uid = ?";

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, uid);
			ResultSet re = ps.executeQuery();

			while (re.next()) {
				cartsCount++;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return cartsCount;
	}

	@Override
	public boolean saveOrder(Order o) {
		// TODO Auto-generated method stub
		boolean r = false;
		String sql = "insert into order values(o_id, c_id, b_id, s_id)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, o.getO_id());
			ps.setInt(2, o.getC_id());
			ps.setInt(3, o.getB_id());
			ps.setInt(4, o.getS_id());
			r= ps.execute();
			

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

}
