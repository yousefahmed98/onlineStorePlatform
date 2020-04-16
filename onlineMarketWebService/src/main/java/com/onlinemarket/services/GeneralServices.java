package com.onlinemarket.services;

import com.onlinemarket.data.IUserDA;
import com.onlinemarket.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

public class GeneralServices implements IGeneralServices {

    @Autowired
    IUserDA UserDA;

    @Override
    public Boolean findUser(String email, String pass) {
        return null;
    }

    @Override
    public Boolean saveUser(@RequestBody User user) {
        boolean found = false;
        user.setUserType(user.getUserType());
        Iterable<User> users = UserDA.findAll();
        for(User user1 : users){
            if ((user1.getEmail().equals(user.getEmail()))){
                found = true;
                break;
            }
        }
        if(found == false){
            UserDA.save(user);
            return true;
        }
        else{
            return false;
        }
    }
}
