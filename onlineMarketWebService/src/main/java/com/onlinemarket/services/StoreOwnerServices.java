package com.onlinemarket.services;

import java.util.Vector;

import com.onlinemarket.data.IUserDA;
import com.onlinemarket.models.IUser;


public class StoreOwnerServices implements IGeneralService, IStoreOwnerServices {

  public IUserDA da;
  @Override
  public Boolean findUser(String email, String pass) {
    return null;
  }

  @Override
  public Boolean saveUser(IUser user) {
    return null;
  }


}