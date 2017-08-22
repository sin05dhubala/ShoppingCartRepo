package com.niit.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Dao.CartItemDao;
import com.niit.model.Cart;
import com.niit.model.CartItem;

@Service
@Transactional
public class CartItemServiceImp implements CartItemService{

	@Autowired
	private CartItemDao cartItemDao;
	public void addCartItem(CartItem cartItem) {
		// TODO Auto-generated method stub
		cartItemDao.addCartItem(cartItem);
		
	}

	public void removeCartItem(int cartItemId) {
		// TODO Auto-generated method stub
		cartItemDao.removeCartItem(cartItemId);
		
	}

	public void removeAllCartItems(int cartId) {
		// TODO Auto-generated method stub
		cartItemDao.removeAllCartItem(cartId);
		
	}

	public Cart getCart(int cartId) {
		// TODO Auto-generated method stub
		return cartItemDao.getCart(cartId);
	}

	public CartItem getCartItem(int cartId) {
		// TODO Auto-generated method stub
		return cartItemDao.getCartItem(cartId);
	}

	public CartItem getCartItemIDByCartID(int cartID) {
		// TODO Auto-generated method stub
		return cartItemDao.getCartItemIDByCartID(cartID);
	}

}
