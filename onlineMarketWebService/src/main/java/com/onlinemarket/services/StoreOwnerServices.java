package com.onlinemarket.services;

import com.onlinemarket.data.IUserDA;
import com.onlinemarket.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreOwnerServices implements IStoreOwnerServices {

  @Autowired
  IUserDA da;

  @Override
  public Boolean findUser(String email, String pass) {
    return null;
  }


  @Override
  public Boolean saveUser(User user) {
    return null;
  }


}