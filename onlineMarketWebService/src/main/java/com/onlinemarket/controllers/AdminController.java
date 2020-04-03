package com.onlinemarket.controllers;

import java.util.List;

import com.onlinemarket.data.IUserDA;
import com.onlinemarket.models.Admin;
import com.onlinemarket.models.User;
import com.onlinemarket.services.IAdminServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class AdminController {

  @Autowired
  IAdminServices adminService;

  @RequestMapping(value = "/loginAdmin",method = RequestMethod.GET)
  public Boolean login(String email, String pass) {
    return null;
  }
  @RequestMapping(value ="/registerAdmin",method = RequestMethod.POST)
  public Boolean register(@RequestBody User user, @RequestParam String email) {
    Iterable<User> users = adminService.findAll();
    boolean isAdmin = false;
    for (User user1 : users) {
      if (user1.getEmail().equals(email) && user1.getUserType().equals("admin")) {
        isAdmin = true;
        break;
      }
    }
    if (isAdmin == true) {
      return adminService.saveUser(user);
    }
    else{
      return false;
    }
  }
  @RequestMapping(value = "/findAll",method = RequestMethod.GET)
  public Iterable<User> findAll() {
    return adminService.findAll();
  }


}