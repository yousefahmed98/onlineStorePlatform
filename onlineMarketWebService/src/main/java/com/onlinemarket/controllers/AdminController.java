package com.onlinemarket.controllers;

import java.util.List;
import java.util.Vector;

import com.onlinemarket.models.IUser;
import com.onlinemarket.services.IGeneralService;
import com.onlinemarket.services.IAdminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
  @Autowired
  IGeneralService generalService;
  @Autowired
  IAdminService adminService;

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