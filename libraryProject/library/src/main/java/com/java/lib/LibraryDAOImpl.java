package com.java.lib;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LibraryDAOImpl implements LibraryDAO{
	
	PreparedStatement pst;
	Connection connection;
	
	public boolean checkPassWord(String pwd, String retype) {
		if(pwd.equals(retype)){
			return true;
		}
		return false;
	}

	@Override
	public String createUser(LibUsers libUsers) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String encPwd = EntryptPassword.getCode(libUsers.getPassWord());
		String cmd = "Insert into LibUsers(UserName,Password) "
				+ " values(?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setString(1,libUsers.getUserName());
		pst.setString(2, encPwd);
		pst.executeUpdate();
		return "User Account Created...";
		
	}

	@Override
	public int authenticate(LibUsers libUsers) throws SQLException, ClassNotFoundException {
		connection = ConnectionHelper.getConnection();
		String encr=EntryptPassword.getCode(libUsers.getPassWord());
		String cmd = "select count(*) cnt from LibUsers where userName=? AND Password=?";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, libUsers.getUserName());
		pst.setString(2, encr.trim());
		ResultSet rs = pst.executeQuery();
		rs.next();
		int count = rs.getInt("cnt");
		return count;

	}

	@Override
	public List<Books> searchBooks(String searchType, String searchValue) throws SQLException, ClassNotFoundException {
		String sql;
		boolean isValid=true;
		if(searchType.equals("id")) {
			sql = " SELECT * FROM Books WHERE Id = ? " ;
		} else if(searchType.equals("bookname")) {
			sql = " SELECT * FROM Books WHERE Name = ? " ;
		} else if(searchType.equals("authorname")) {
			sql = " SELECT * FROM Books WHERE Author = ? " ;
		} else if(searchType.equals("dept")) {
			sql = " SELECT * FROM Books WHERE Dept = ? " ;
		}
		else {
			isValid=false;
			sql = " SELECT * FROM Books" ;
		}
		connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement(sql);
		if (isValid==true) {
			pst.setString(1, searchValue);
		} 
		ResultSet rs = pst.executeQuery();
		Books books = null;
		List<Books> booksList = new ArrayList<Books>();
		while(rs.next()) {
			books = new Books();
			books.setId(rs.getInt("id"));
			books.setName(rs.getString("name"));
			books.setAuthor(rs.getString("author"));
			books.setEdition(rs.getString("edition"));
			books.setDept(rs.getString("dept"));
			books.setNoOfBooks(rs.getInt("TotalBooks"));
			booksList.add(books);
		}
		return booksList;

	}

	@Override
	public List<TranBook> showIssueBooks(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String issueBook(String userName, int bookId) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		Books book = issueOrNot(bookId);
				String cmd = "UPDATE Books SET TotalBooks =totalBooks - 1  WHERE Id = ?";//Decrease the count by 1
				pst = connection.prepareStatement(cmd);
				pst.setInt(1,  bookId);
				pst.executeUpdate();
				
				cmd = "Insert into TranBook(UserName,bookId) values(?,?)";
				pst = connection.prepareStatement(cmd);
				pst.setString(1,userName);
				pst.setInt(2, bookId);
				pst.executeUpdate();
				
				//Rest of the code for recording the transaction
				return "Book issued successfully.";
	}
		 public Books issueOrNot(int Id) throws ClassNotFoundException, SQLException {
			Connection connection = ConnectionHelper.getConnection();
			PreparedStatement pst = null;
			ResultSet rst = null;
			Books book = null;
			
			try {
			String query = "SELECT * from Books where Id = ?";
			pst = connection.prepareStatement(query);
			pst.setInt(1, Id);
			rst = pst.executeQuery();
			
			if(rst.next()) {
				int id = rst.getInt("Id");
				String name = rst.getString("name");
				String author = rst.getString("author");
				String edition = rst.getString("Edition");
				String dept = rst.getString("dept");
				int noOfBooks = rst.getInt("TotalBooks");
				
				book = new Books(id, name, author, edition, dept, noOfBooks);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {}
			return book;
			
		}
		
	}

