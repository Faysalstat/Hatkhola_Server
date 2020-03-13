/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hatkhola.service;

import hatkhola.repository.WishListRepository;
import java.util.List;
import model.Cart;
import model.Wishlist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class WishlistService {
    @Autowired
    WishListRepository wishListRepository;

    public List<Wishlist> getList(Long id){ 
        List<Wishlist> list = wishListRepository.getList(id);
        return list;
    }

    public String saveAll(Wishlist wish) {
        return wishListRepository.saveAll(wish);
    }
    

}
