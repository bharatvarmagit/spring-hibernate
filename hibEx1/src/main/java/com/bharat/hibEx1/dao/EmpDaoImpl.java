package com.bharat.hibEx1.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bharat.hibEx1.model.Emp;

@Repository
public class EmpDaoImpl implements EmpDao {
	SessionFactory sessionFactory;
	public EmpDaoImpl() {
		
	}
	@Autowired
	public EmpDaoImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	public void add(Emp e) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.persist(e);
		tx.commit();
		System.out.println("insertion was a Sucess ! Drumroll .... Congrats");
		// TODO Auto-generated method stub

	}

}























