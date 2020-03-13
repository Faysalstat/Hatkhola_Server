/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hatkhola.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Faysal
 */
@RestController
@RequestMapping("/user")
public class TestController {

//    @CrossOrigin(origins = "http://localhost:9000")
    @GetMapping("/greeting")
    public String greeting(@RequestParam(required = false, defaultValue = "World") String name) {
        System.out.println("==== in greeting ====");
        return "{\"status\":\"Success\"}";
    }

    @GetMapping("/greeting2/{id}")
    @CrossOrigin(origins = "*")
    public String greeting2(@PathVariable("id") Long id) {
        System.out.println("==== in greeting ====");
        return "{\"status\":\"Success\"}";
    }

}
