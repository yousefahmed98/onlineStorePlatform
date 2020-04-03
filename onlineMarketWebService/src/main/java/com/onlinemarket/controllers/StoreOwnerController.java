package com.onlinemarket.controllers;

import com.onlinemarket.models.User;
import com.onlinemarket.services.IStoreOwnerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StoreOwnerController {

  @Autowired
  IStoreOwnerServices storeOwnerServices;

  @RequestMapping(value = "/loginStoreOwner",method = RequestMethod.GET)
  public Boolean login(String email, String pass) {
    return null;
  }
  @RequestMapping(value = "/registerStoreOwner",method = RequestMethod.POST)
  public Boolean register(User user) {
    return null;
  }
}