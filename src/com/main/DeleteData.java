package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Accounts;

public class DeleteData {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Accounts.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "delete from Accounts where acc_Number =: accnum";
		Query<Accounts> query = ss.createQuery(hqlQuery, Accounts.class);
		query.setParameter("accnum", 396878487);
		query.executeUpdate();
		tr.commit();
		
		System.out.println("Data is deleted successfully...");
		ss.close();
	}

}
