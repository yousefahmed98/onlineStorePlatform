package com.onlinemarket.controllers;

import com.onlinemarket.models.NormalUser;
import com.onlinemarket.models.User;
import com.onlinemarket.services.INormalUserServices;
import com.onlinemarket.services.IGeneralServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NormalUserController  {


  @Autowired
  INormalUserServices normalUserService;

  @RequestMapping(value = "/loginNormalUser",method = RequestMethod.GET)
  public Boolean login(@RequestBody String email,@RequestBody String pass) {
    return null;
  }

  @RequestMapping(value = "/registerNormalUser",method = RequestMethod.POST)
  public Boolean register(@RequestBody User user) {
    return normalUserService.saveUser(user);
  }

}