package com.java.com;

import java.sql.Date;

public class Complaint {

		private String ComplaintID;
		private String ComplaintType;
		private String CDescription;
		private Date ComplaintDate;
		private String Severity;
		private Status Status;
		public String getComplaintID() {
			return ComplaintID;
		}
		public void setComplaintID(String complaintID) {
			ComplaintID = complaintID;
		}
		public String getComplaintType() {
			return ComplaintType;
		}
		public void setComplaintType(String complaintType) {
			ComplaintType = complaintType;
		}
		public String getCDescription() {
			return CDescription;
		}
		public void setCDescription(String cDescription) {
			CDescription = cDescription;
		}
		public Date getComplaintDate() {
			return ComplaintDate;
		}
		public void setComplaintDate(Date complaintDate) {
			ComplaintDate = complaintDate;
		}
		public String getSeverity() {
			return Severity;
		}
		public void setSeverity(String severity) {
			Severity = severity;
		}
		public Status getStatus() {
			return Status;
		}
		public void setStatus(Status status) {
			Status = status;
		}
		public Complaint(String complaintID, String complaintType, String cDescription, Date complaintDate,
				String severity, com.java.com.Status status) {
			super();
			ComplaintID = complaintID;
			ComplaintType = complaintType;
			CDescription = cDescription;
			ComplaintDate = complaintDate;
			Severity = severity;
			Status = status;
		}
		@Override
		public String toString() {
			return "Complaint [ComplaintID=" + ComplaintID + ", ComplaintType=" + ComplaintType + ", CDescription="
					+ CDescription + ", ComplaintDate=" + ComplaintDate + ", Severity=" + Severity + ", Status="
					+ Status + "]";
		}
		public Complaint() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
}