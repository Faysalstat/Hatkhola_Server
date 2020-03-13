/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hatkhola.repository;

import java.util.List;
import model.Customer;
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
public class UserRepository {
    @Autowired
    private SessionFactory sessionFactory;
    
    public String checkLogin(Customer customer){
        String email = customer.getEmail();
        String sql = "Select c from Customer c where c.email= :email";
        Query query = sessionFactory.getCurrentSession().createQuery(sql);
        query.setParameter("email", email);
        List<Customer> list = query.list();
        if (list.get(0).getPassword().equals(customer.getPassword())) {
            return "{\"status\":\"Login Success\"}";
        }
        return "{\"status\":\"Login Failed\"}";
    }
}
