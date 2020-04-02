package com.onlinemarket.controllers;

import com.onlinemarket.models.IUser;
import com.onlinemarket.services.IStoreOwnerServices;
import com.onlinemarket.services.IGeneralServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreOwnerController {

  @Autowired
  IGeneralServices generalService;

  @Autowired
  IStoreOwnerServices storeOwnerServices;

  @RequestMapping(value = "/loginStoreOwner",method = RequestMethod.GET)
  public Boolean login(String email, String pass) {
    return null;
  }
  @RequestMapping(value = "/registerStoreOwner",method = RequestMethod.POST)
  public Boolean register(IUser user) {
    return null;
  }
}