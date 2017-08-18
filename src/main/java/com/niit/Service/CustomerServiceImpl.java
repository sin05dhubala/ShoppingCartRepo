package com.niit.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Dao.CustomerDao;
import com.niit.model.Customer;
import com.niit.model.User;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
	@Autowired
    private CustomerDao customerDao;
	public void registerCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.registerCustomer(customer);
		
	}
	public User validateUsername(String username) {
		// TODO Auto-generated method stub
		return customerDao.validateUsername(username);
	}
	public Customer validateEmail(String email) {
		// TODO Auto-generated method stub
		return customerDao.validateEmail(email);
	}
	public Customer getCustomerByUsername(String username) {
		// TODO Auto-generated method stub
		return customerDao.getCustomerByUsername(username);
	}

}
