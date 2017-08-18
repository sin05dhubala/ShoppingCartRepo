package com.niit.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Dao.CustomerOrderDao;
import com.niit.model.Cart;
import com.niit.model.CustomerOrder;

@Service
@Transactional
public class CustomerOrderServiceImp implements CustomerOrderService{
	@Autowired
private CustomerOrderDao customerOrderDao;
	public CustomerOrder createOrder(Cart cart) {
		return customerOrderDao.createOrder(cart);
	}
	
}
