/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hatkhola.repository;

import java.util.List;
import model.Cart;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


/**
 *
 * @author Faysal
 */
@Repository
@Transactional
public class CartRepository {
    
    
    @Autowired
    private SessionFactory sessionFactory;
    
    public List<Cart> getList(Long id){        
        String sql = "Select p from Cart p where p.customer.id= :id";
        Query query = sessionFactory.getCurrentSession().createQuery(sql);
        query.setParameter("id", id);
        List<Cart> list= query.list();
       return list;  

    }
    
    public String saveAll(Cart cart) {
        boolean isExist = getSingleCart(cart.getProduct().getId());
        if (isExist) {
            return "{\"status\":\"Allready Exists\"}";
        }
        sessionFactory.getCurrentSession().save(cart);
        return "{\"status\":\"Success\"}";
    }
    public String updateList(List<Cart> cartlist) {
        for(Cart cart:cartlist){
        sessionFactory.getCurrentSession().merge(cart);
        }
         return "{\"status\":\"Success\"}";
    }
    public boolean getSingleCart(Long id){         
        String sql = "Select p from Cart p where p.product.id= :id";
        Query query = sessionFactory.getCurrentSession().createQuery(sql);
        query.setParameter("id", id);
        if (query.list().isEmpty()) {
            return false;
        }
     return true;
    }
    
    
    
    public String deleteCartItem(Long id){         
        Cart cart = new Cart();
        cart.setId(id);
        sessionFactory.getCurrentSession().delete(cart);
        return "{\"status\":\"Success\"}";
    }
}
