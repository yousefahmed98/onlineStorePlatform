package com.onlinemarket.controllers;

import java.util.Vector;
import com.onlinemarket.models.IUser;
import com.onlinemarket.services.INormalUserServices;
import com.onlinemarket.services.IGeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NormalUserController  {
  @Autowired
  IGeneralService generalService;
  @Autowired
  INormalUserServices normalUserServices;

  @RequestMapping("/loginNormalUser")
  public Boolean login(String email, String pass) {
  return null;
  }
  @RequestMapping("/registerNormalUser")
  public Boolean register(IUser user) {
  return null;
  }

}