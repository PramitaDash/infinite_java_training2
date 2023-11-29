package com.java.com;



import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class ComplaintDAOImpl implements ComplaintDAO {
	Connection connection;
	PreparedStatement pst;
	
	public String generateComplaintID() throws ClassNotFoundException, SQLException {
 		connection = ConnectionHelper.getConnection();
 		String cmd = "select max(ComplaintID) sid from complaint";
    	pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
    		if(rs.next()) {
    	String sid = rs.getString("sid");
    	int id = Integer.parseInt(sid.substring(1));
    	id++;
    	sid = String.format("C%03d", id);
		return sid;
		}else {
			return "C001";
		}
	}
	
	
	public int DateCalculate(Date startDate) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		long endDate=System.currentTimeMillis();  
		long ms = endDate - startDate.getTime();
		int diff = (int)(ms/(1000 * 60 * 60 * 24));
		diff++;
		return diff;
	}
	
	@Override
	public Complaint searchComplaintDao(String ComplaintID) throws ClassNotFoundException, SQLException {
		connection=ConnectionHelper.getConnection();
		
		return null;
	}
	@Override
	public String addComplaintDao(Complaint complaint) throws ClassNotFoundException, SQLException {
		connection=ConnectionHelper.getConnection();
		String id=generateComplaintID();
		String cmd = "Insert into Complaint(ComplaintId, ComplaintType,CDescription,Severity) values(?,?,?,?)";
		pst=connection.prepareStatement(cmd);
		pst.setString(1,  id);
		pst.setString(2, complaint.getComplaintType());
		pst.setString(3,complaint.getCDescription());
		pst.setString(4, complaint.getSeverity());
		pst.executeUpdate();
		return "Complaint Registered" +complaint.getComplaintID();
	}


	@Override
	public List<Complaint> showComplaintDao() throws ClassNotFoundException, SQLException, ParseException {
		connection=ConnectionHelper.getConnection();
		String cmd = "select * from Complaint";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Complaint> complaintList = new ArrayList<Complaint>();
		Complaint complaint = null;
	
		while(rs.next()) {
	    	complaint=new Complaint();
	    	SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd"); 
			java.util.Date cd = sdf.parse(rs.getString("ComplaintDate"));
	    	complaint.setComplaintID(rs.getString("ComplaintID"));
	    	complaint.setComplaintType(rs.getString("ComplaintType"));
	    	complaint.setCDescription(rs.getString("CDescription"));
//    	complaint.setComplaintDate(cd);
	    	complaint.setSeverity(rs.getString("Severity"));
	    	complaint.setStatus(Status.valueOf(rs.getString("Status")));
	    	complaintList.add(complaint);
		}
		return complaintList;
	}
	
}