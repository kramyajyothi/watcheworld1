package com.watchWorld.service;

import com.watchWorld.model.Cart;

public interface CartService {

    Cart getCartById(int cartId);

    void update(Cart cart);
}
