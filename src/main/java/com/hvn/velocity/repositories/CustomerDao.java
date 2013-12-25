package com.hvn.velocity.repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hvn.velocity.entities.Customer;

@Repository
public class CustomerDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public Integer save(Customer customer) {
		Session session = sessionFactory.getCurrentSession();
		return (Integer) session.save(customer);
	}
	
	public Customer findById(Integer id) {
		return (Customer) sessionFactory.getCurrentSession().get(Customer.class, id);
	}
	
	public Customer findByEmail(String email) {
		return (Customer) sessionFactory.getCurrentSession().get(Customer.class, email);
	}
	
}