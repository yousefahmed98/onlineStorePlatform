package com.onlinemarket.services;

import com.onlinemarket.models.IUser;


public interface IGeneralService {

  public Boolean findUser(String email, String pass);

  public Boolean saveUser(IUser user);

}