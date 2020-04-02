package com.onlinemarket.services;

import com.onlinemarket.data.IUserDA;
import com.onlinemarket.models.IUser;
import org.springframework.beans.factory.annotation.Autowired;


public class StoreOwnerServices implements IGeneralServices, IStoreOwnerServices {

  @Autowired
  IUserDA da;

  @Override
  public Boolean findUser(String email, String pass) {
    return null;
  }

  @Override
  public Boolean saveUser(IUser user) {
    return null;
  }


}