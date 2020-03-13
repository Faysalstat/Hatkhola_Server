/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hatkhola.controller;

import hatkhola.service.CartService;
import java.util.List;
import model.Cart;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Faysal
 */
@RestController
@RequestMapping("/cart")
@CrossOrigin(origins = "*")
public class CartController {
    @Autowired
    CartService cartService;
    
    @PostMapping
    @CrossOrigin(origins = "*")
    public String addToCart(@RequestBody Cart cart) {
        System.out.println(cart);
        String status = cartService.saveAll(cart);
        return status;
    }
    
    @GetMapping("/getCart/{id}")
    @CrossOrigin(origins = "*")
    public List<Cart> getCart(@PathVariable("id") Long id) {
        List<Cart> list = cartService.getList(id);
        return list;
    }
    
    
    @DeleteMapping("/{id}")
    @CrossOrigin(origins = "*")
    public String deleteCartItem(@PathVariable("id") Long id) {
       String status = cartService.deleteCartItem(id);     
       return status;
    }
    
    @PostMapping("/update")
    @CrossOrigin(origins = "*")
    public String updateList(@RequestBody List<Cart> cartlist){
    String status = cartService.updateList(cartlist); 
        return status;
    }
    
        
}
