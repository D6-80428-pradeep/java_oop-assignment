package com.sunbeam;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class UserDao implements AutoCloseable {
	private Connection con;
	private PreparedStatement stmtInsert;
	private PreparedStatement stmtFindAll;
	private PreparedStatement stmtUpdate;
	private PreparedStatement stmtFindById;
	private PreparedStatement stmtDelete;
	
	
	public UserDao() throws Exception {
		con = DbUtil.getConnection();
		String sql1 = "INSERT INTO users VALUES(default,?,?,?,?,?,?,?)";
		stmtInsert = con.prepareStatement(sql1);
		String sql2 = "Select * from users";
		stmtFindAll = con.prepareStatement(sql2);
		String sql3 = "Update users set status = ? where id = ?";
		stmtUpdate = con.prepareStatement(sql3);
		String sql4 = "Select * from users where id = ?";
		stmtFindById = con.prepareStatement(sql4);
		String sql5 = "DELETE FROM users WHERE id=?";
		stmtDelete = con.prepareStatement(sql5);
	}

	@Override
	public void close() {
		try {
			if(stmtDelete != null) 
				stmtDelete.close();
			if(stmtFindById != null) 
				stmtFindById.close();
			if(stmtUpdate != null) 
				stmtUpdate.close();
			if(stmtFindAll != null) 
				stmtFindAll.close();
			if(stmtInsert != null) 
				stmtInsert.close();
			if(con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int save(User u) throws Exception{
			stmtInsert.setString(1, u.getFname());
			stmtInsert.setString(2, u.getLname());
			stmtInsert.setString(3, u.getEmail());
			stmtInsert.setString(4, u.getPass());
			
			java.sql.Date sDate = new java.sql.Date(u.getDob().getTime());
			stmtInsert.setDate(5, sDate);
			
			stmtInsert.setInt(6, u.getStatus());
			stmtInsert.setString(7, u.getRole());
			
			int cnt = stmtInsert.executeUpdate();
			return cnt;
	}
	
	public List<User> findAll() throws Exception {
		List<User> li = new ArrayList<>();
		try(ResultSet rs = stmtFindAll.executeQuery()){
			while(rs.next()) {
				int id = rs.getInt("id");
				String fname = rs.getString("first_name");
				String lname = rs.getString("last_name");
				String email = rs.getString("email");
				String pass = rs.getString("password");
				
				String dob = rs.getString("dob");
				SimpleDateFormat sdf;
				sdf = new SimpleDateFormat("dd-MM-yyyy");
				java.util.Date uDate = sdf.parse(dob);
				
				int status = rs.getInt("status");
				String role = rs.getString("role");
				User u = new User(id, fname, lname, email, pass, uDate, status, role);
				li.add(u);
			}
		}
		return li;
	}
	
	public int update(User u) throws Exception {
		stmtUpdate.setInt(1, u.getStatus());
		stmtUpdate.setInt(2, u.getId());
		int count = stmtUpdate.executeUpdate();
		return count;
	} 
	
	public User findById(int id) throws Exception {
		stmtFindById.setInt(1, id);
		try(ResultSet rs = stmtFindById.executeQuery()){
			if(rs.next()) {
				String fname = rs.getString("first_name");
				String lname = rs.getString("last_name");
				String email = rs.getString("email");
				String pass = rs.getString("password");
				
				java.sql.Date sDate = rs.getDate("dob");
				java.util.Date uDate = new java.util.Date(sDate.getTime());
				
				int status = rs.getInt("status");
				String role = rs.getString("role");
				
				User c = new User(id, fname, lname, email, pass, uDate, status, role);
				return c;
			}
		}
		return null;
	}
	
	public int delete(int id) throws Exception{
		stmtDelete.setInt(1, id);
		int count = stmtDelete.executeUpdate();
		return count;
	}
}
