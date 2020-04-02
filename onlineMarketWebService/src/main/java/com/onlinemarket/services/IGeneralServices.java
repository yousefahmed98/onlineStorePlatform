package com.onlinemarket.services;

import com.onlinemarket.models.IUser;


public interface IGeneralServices {

  public Boolean findUser(String email, String pass);

  public Boolean saveUser(IUser user);

}