package com.java.lib;

import java.sql.Date;

public class TranBook {
	
	private String userName;
	private int BookId;
	private Date Fromdate;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	public Date getFromdate() {
		return Fromdate;
	}
	public void setFromdate(Date fromdate) {
		Fromdate = fromdate;
	}
	public TranBook(String userName, int bookId, Date fromdate) {
		super();
		this.userName = userName;
		BookId = bookId;
		Fromdate = fromdate;
	}
	public TranBook() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "TranBook [userName=" + userName + ", BookId=" + BookId + ", Fromdate=" + Fromdate + "]";
	}
	
	

}
