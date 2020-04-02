package com.onlinemarket.services;

import com.onlinemarket.data.IUserDA;
import com.onlinemarket.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices implements IGeneralServices, INormalUserServices {

  @Autowired
  IUserDA UserDA;

  @Override
  public Boolean findUser(String email, String pass) {
    return null;
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