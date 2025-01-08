package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Accounts;

public class InsertData {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Accounts.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = ("insert into Accounts(acc_Number,name,mobile,ammount,address)values(:accnum,:name, :mob, :amm, :add)");
		Query<Accounts> query = ss.createNativeQuery(hqlQuery);
		query.setParameter("accnum", 396878487);
		query.setParameter("name", "Shubham");
		query.setParameter("mob", 798684758);
		query.setParameter("amm", 900000);
		query.setParameter("add", "Pune");
		query.executeUpdate();
		tr.commit();

		System.out.println("Data Inserted Successufully...");
		ss.close();

	}

}
