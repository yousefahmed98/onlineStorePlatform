package com.onlinemarket.services;

import java.util.List;
import java.util.Vector;
import com.onlinemarket.models.IUser;
import com.onlinemarket.data.IUserDA;


public class AdminServices implements IGeneralService, IAdminService {

  public IUserDA da;

    public Vector  mySystemController;
    public Vector  myIUserDA;

  public List<IUser> findAll() {
  return null;
  }

  public Boolean findUser(String email, String pass) {
  return null;
  }

  @Override
  public Boolean saveUser(IUser user) {
    return null;
  }



}