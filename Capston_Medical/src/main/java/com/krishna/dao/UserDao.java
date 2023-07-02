package com.krishna.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.krishna.model.User;
import com.krishna.util.SessionFactoryManagerImpl;

import jakarta.persistence.TypedQuery;


public class UserDao {
	
	 SessionFactory factory;
	
	public UserDao() {
		factory=new SessionFactoryManagerImpl().getFactory();
	}
	

	public Integer addUser(User user) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Integer user1=(Integer) session.save(user);
		transaction.commit();
		session.close();
		return user1;
	}
	
	public List<User> getUser(int uid) {
		
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		String query="select username,password from user where uid=2;";
		TypedQuery<User> tq=session.createNativeQuery(query, User.class,"user");
		List<User> user2=tq.getResultList();
		return user2;
	}
	
}
