package com.onlinemarket.services;

import com.onlinemarket.data.IUserDA;
import com.onlinemarket.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServices implements INormalUserServices {

  @Autowired
  IUserDA UserDA;

  @Override
  public Boolean findUser(String email, String pass) {

    if( UserDA.findById(email) != null){
      User user=UserDA.findById(email).get();
      if(user.getPassword().equals(pass)){
      return true;
      }
      else{
        return false;
      }
    }
    else {
      return false;
    }
  }

  @Override
  public Boolean saveUser(User user){
    if(UserDA.findById(user.getEmail()) != null)
    {
      UserDA.save(user);
      return true;
    }
    else{
      return false;
    }
  }

}