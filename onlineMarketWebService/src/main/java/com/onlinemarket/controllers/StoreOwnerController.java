package com.onlinemarket.controllers;


import com.onlinemarket.services.IStoreOwnerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StoreOwnerController{

  @Autowired
  IStoreOwnerServices storeOwnerServices;
}