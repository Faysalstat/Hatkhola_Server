package hatkhola.controller;

import hatkhola.service.UserService;
import model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    UserService userService;
    
    @PostMapping
    @CrossOrigin(origins = "*")
    public String checkLogin(@RequestBody Customer customer) {
        
        System.out.println("got it");
        String status = userService.checkLogin(customer);
        return status;
    }
}
