package com.onlinemarket.controllers;

import java.util.List;

import com.onlinemarket.data.IUserDA;
import com.onlinemarket.models.Admin;
import com.onlinemarket.models.User;
import com.onlinemarket.services.IAdminServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class AdminController{
  @Autowired
  IAdminServices adminService;

  @RequestMapping(value = "/findAll",method = RequestMethod.GET)
  public Iterable<User> findAll() {
    return adminService.findAll();
  }
}