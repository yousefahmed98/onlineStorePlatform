package com.onlinemarket.services;

import java.util.Vector;

import com.onlinemarket.data.IUserDA;
import com.onlinemarket.models.IUser;



public class UserServices implements IGeneralService, INormalUserServices {

  public IUserDA da;

    public Vector  mySystemController;
    public Vector  myIUserDA;

  public Boolean findUser(String email, String pass) {
  return null;
  }

  @Override
  public Boolean saveUser(IUser user) {
    return null;
  }

}