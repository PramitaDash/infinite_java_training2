package com.java.res;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class WalletDAOImpl {
	
	SessionFactory sf;
	Session session;
	
	public static List<Wallet> showWalletDao(){
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Wallet.class);
		List walletList = cr.list();
		return walletList;
	}
	
	

}
