package com.onlinemarket.controllers;

import java.util.List;

import com.onlinemarket.models.IUser;
import com.onlinemarket.services.IGeneralServices;
import com.onlinemarket.services.IAdminServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
  @Autowired
  IGeneralServices generalService;
  @Autowired
  IAdminServices adminService;

  @RequestMapping("/loginAdmin")
  public Boolean login(String email, String pass) {
    return null;
  }
  @RequestMapping("/registerAdmin")
  public Boolean register(IUser user) {
    return null;
  }
  @RequestMapping("/findAll")
  public List<IUser> findAll() {
  return null;
  }


}