package com.java.com;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

public interface ComplaintDAO {
	
	List<Complaint> showComplaintDao() throws ClassNotFoundException, SQLException, ParseException;
	Complaint searchComplaintDao(String ComplaintID) throws ClassNotFoundException, SQLException;
	String addComplaintDao(Complaint complaint) throws ClassNotFoundException, SQLException ;

}
