package com.onlinemarket.controllers;

import java.util.Vector;
import com.onlinemarket.models.IUser;
import com.onlinemarket.services.INormalUserServices;
import com.onlinemarket.services.IGeneralService;


public class NormalUserController  {

  public IGeneralService generalService;

  public INormalUserServices normalUserServices;

    public Vector  myAdmin;
    public Vector  myNormalUser;

  public Boolean login(String email, String pass) {
  return null;
  }

  public Boolean register(IUser user) {
  return null;
  }

}