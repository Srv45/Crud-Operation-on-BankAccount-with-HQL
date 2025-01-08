package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entity.Accounts;


public class UpdateData {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Accounts.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = ("update Employee set mobile =: mob, ammount =: amm where acc_Number =: accnum");
		MutationQuery mtQuery = ss.createMutationQuery(hqlQuery);
		mtQuery.setParameter("mob", 79687489);
		mtQuery.setParameter("amm", 500000);
		mtQuery.setParameter("accnum", 396878487);
		mtQuery.executeUpdate();
		tr.commit();

		System.out.println("Data is updated successufully...");
		ss.close();

	}
}
