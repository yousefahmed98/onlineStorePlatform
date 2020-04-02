package com.onlinemarket.services;

import java.util.List;

import com.onlinemarket.models.IUser;
import com.onlinemarket.data.IUserDA;


public class AdminServices implements IGeneralServices, IAdminServices {

  private IUserDA da;

  @Override
  public Boolean findUser(String email, String pass) {
    return null;
  }

  @Override
  public Boolean saveUser(IUser user) {
    return null;
  }


  @Override
  public List<IUser> findAll() {
    return null;
  }
}