package com.onlinemarket.services;

import com.onlinemarket.data.IUserDA;
import com.onlinemarket.models.IUser;


public class StoreOwnerServices implements IGeneralServices, IStoreOwnerServices {

  private IUserDA da;

  @Override
  public Boolean findUser(String email, String pass) {
    return null;
  }

  @Override
  public Boolean saveUser(IUser user) {
    return null;
  }


}