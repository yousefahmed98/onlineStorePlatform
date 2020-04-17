package com.onlinemarket.services;

import com.onlinemarket.data.IUserDA;
import com.onlinemarket.models.GeneralUserDetails;
import com.onlinemarket.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class GeneralServices implements UserDetailsService, IGeneralServices {

    private static String securityKey = "admin";
    @Autowired
    IUserDA UserDA;

    @Override
    public Boolean findUser(@RequestParam String email,@RequestParam String pass) {
        User user = UserDA.findByEmail(email);
        if(user == null){
            return false;
        }else {
            if (user.getPassword().equals(pass)) {
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    public Boolean saveUser(User user) {
        User user1 = UserDA.findByEmail(user.getEmail());
        if(user1 == null){
            if(user.getUserType().equals(securityKey)){
                user.setUserType("ADMIN");
                UserDA.save(user);
                return true;
            }else if(user.getUserType().equals("STOREOWNER") || user.getUserType().equals("NORMALUSER") ){
                UserDA.save(user);
                return true;
            }else {
                return false;
            }
        }else{
            return false;
        }
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = UserDA.findByEmail(email);
        if(user == null){
            new UsernameNotFoundException(("Not found" + email));
        }
        return new GeneralUserDetails(user);
    }
}
