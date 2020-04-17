package com.onlinemarket.controllers;

import com.onlinemarket.services.INormalUserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NormalUserController{
  @Autowired
  INormalUserServices normalUserService;
}