/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hatkhola.service;

import hatkhola.repository.UserRepository;
import model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Faysal
 */
@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    
    
    public String checkLogin(Customer customer){
    String status = userRepository.checkLogin(customer);
    return status;
    }
    
}
