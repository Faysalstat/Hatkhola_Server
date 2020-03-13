/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hatkhola.controller;

import hatkhola.service.WishlistService;
import java.util.List;
import model.Wishlist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wishlist")
@CrossOrigin(origins = "*")
public class WishListController {
    @Autowired
    WishlistService wishlistService;
    
    @PostMapping
    @CrossOrigin(origins = "*")
    public String addToCart(@RequestBody Wishlist wish) {
        System.out.println(wish);
        String status = wishlistService.saveAll(wish);
        return status;
    }
    
    @GetMapping("/getwishlist/{id}")
    @CrossOrigin(origins = "*")
    public List<Wishlist> getWishList(@PathVariable("id") Long id) {
        List<Wishlist> list = wishlistService.getList(id);
        return list;
    }
}
