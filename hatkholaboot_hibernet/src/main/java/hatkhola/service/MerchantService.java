/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hatkhola.service;

import hatkhola.repository.MerchantRepository;
import model.Merchant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Faysal
 */
@Service
public class MerchantService {
    @Autowired
    MerchantRepository merchantRepository;
    
    
    public String checkLogin(Merchant merchant){
    String status = merchantRepository.checkLogin(merchant);
    return status;
    }
    
}
