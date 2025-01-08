package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Accounts;

public class GetAllRecord {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Accounts.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "from Accounts";
		Query<Accounts> query = ss.createQuery(hqlQuery, Accounts.class);
		List<Accounts> list = query.getResultList(); 

		for (Accounts accounts : list) {
			System.out.println(accounts);
		}
		tr.commit();
		ss.close();
	}
}