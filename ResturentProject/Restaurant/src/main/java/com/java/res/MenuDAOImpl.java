package com.java.res;

import java.util.List;

import java.util.Map;

import javax.faces.context.FacesContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

public class MenuDAOImpl {
	
	SessionFactory sf;
	Session session;
	
	public String showMenu(int Restaurant_ID) {
		SessionFactory sf = SessionHelper.getConnection();
		Map<String,Object> sessionMap = 
	FacesContext.getCurrentInstance().getExternalContext().getSessionMap();		
		
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Menu.class);
		cr.add(Restrictions.eq("Restaurant_ID",Restaurant_ID));
		List<Menu> mList = cr.list();
		sessionMap.put( "mList", mList);
		
		return "Menu.jsp?faces-redirect=true";
		
	}

}
