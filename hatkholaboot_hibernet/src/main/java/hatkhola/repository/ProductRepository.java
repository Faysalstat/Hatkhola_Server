/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hatkhola.repository;

import java.util.List;
import model.Product;
import org.hibernate.Hibernate;
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
public class ProductRepository {
    
    
    @Autowired
    private SessionFactory sessionFactory;
    
    public List<Product> getList(){        
        String sql = "Select p from Product p";
        Query query = sessionFactory.getCurrentSession().createQuery(sql);
        List<Product> list= query.list();     
       return list;  

    }
    
    public String saveAll(Product product) {
        sessionFactory.getCurrentSession().save(product);
        return "{\"status\":\"Success\"}";
    }
}
