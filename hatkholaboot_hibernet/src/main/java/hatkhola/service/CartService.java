/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hatkhola.service;

import hatkhola.repository.CartRepository;
import java.util.List;
import model.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CartService {
    @Autowired
    CartRepository cartRepository;

    public List<Cart> getList(Long id) {
        List<Cart> list = cartRepository.getList(id);
        return list;
    }

    public String saveAll(Cart cart) {
        return cartRepository.saveAll(cart);
    }
    public String updateList(List<Cart> cart) {
        return cartRepository.updateList(cart);
    }
     public String deleteCartItem(Long id){         
        return cartRepository.deleteCartItem(id);
    }
     
     
    

}
