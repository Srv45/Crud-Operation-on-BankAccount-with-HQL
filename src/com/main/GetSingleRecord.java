package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Accounts;

public class GetSingleRecord {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Accounts.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "from Accounts where acc_Number =: accnum";
		Query<Accounts> query = ss.createQuery(hqlQuery, Accounts.class);
		query.setParameter("accnum", 396878487);
		Accounts acc = query.getSingleResult();
		tr.commit();

		System.out.println(acc);
		ss.close();

	}
}
