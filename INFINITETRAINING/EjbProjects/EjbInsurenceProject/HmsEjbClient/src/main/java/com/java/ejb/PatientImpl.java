package com.java.ejb;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Criteria;
import org.hibernate.Session;

public class PatientImpl implements PatientDAO{

	SessionFactory sf;
	Session session;
	
	@Override
	public List<Patient> showPatient() {
		
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria cr = session.createCriteria(Patient.class);
		return cr.list();
	}

	@Override
	public String addPatient(Patient patient) {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Transaction trans = session.beginTransaction();
		session.save(patient);
		trans.commit();
		return "ShowPatient.jsp?faces-redirect=true";
	}
	
public List<Login> login() {
		
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria cr = session.createCriteria(Login.class);
		return cr.list();
	}

}
