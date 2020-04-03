package com.onlinemarket.services;

import java.util.List;

import com.onlinemarket.models.User;
import com.onlinemarket.data.IUserDA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class AdminServices implements  IAdminServices {

  @Autowired
  IUserDA UserDA;

  @Override
  public Boolean findUser(String email, String pass) {
    return null;
  }

  @Override
  public Boolean saveUser(@RequestBody User user) {
    boolean found = false;
    user.setUserType("Admin");
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

  @Override
  public Iterable<User> findAll() {
    return UserDA.findAll();
  }
}