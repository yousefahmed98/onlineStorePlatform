package com.onlinemarket.controllers;

import java.util.List;

import com.onlinemarket.data.IUserDA;
import com.onlinemarket.models.User;
import com.onlinemarket.services.IAdminServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AdminController {

  @Autowired
  IAdminServices adminService;

  @RequestMapping(value = "/loginAdmin",method = RequestMethod.GET)
  public Boolean login(String email, String pass) {
    return null;
  }
  @RequestMapping(value ="/registerAdmin",method = RequestMethod.POST)
  public Boolean register(User user) {
    return null;
  }
  @RequestMapping(value = "/findAll",method = RequestMethod.GET)
  public Iterable<User> findAll() {
  return adminService.findAll();
  }


}