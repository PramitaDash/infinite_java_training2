package com.java.lib;

import java.sql.SQLException;
import java.util.List;

public interface LibraryDAO {
	
	List<TranBook> showIssueBooks(String userName);
	String createUser(LibUsers libUsers) throws ClassNotFoundException, SQLException;
	int authenticate(LibUsers libUsers) throws SQLException, ClassNotFoundException;
	List<Books> searchBooks(String searchType, String searchValue) throws SQLException, ClassNotFoundException;
	String issueBook(String userName, int bookId) throws ClassNotFoundException, SQLException;
	Books issueOrNot(int Id) throws ClassNotFoundException, SQLException;
}
