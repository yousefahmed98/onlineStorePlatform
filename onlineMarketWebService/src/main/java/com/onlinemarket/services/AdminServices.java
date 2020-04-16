package com.onlinemarket.services;

import java.util.List;

import com.onlinemarket.models.User;
import com.onlinemarket.data.IUserDA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class AdminServices implements  IAdminServices {

  @Autowired
  IUserDA UserDA;



  @Override
  public Iterable<User> findAll() {
    return UserDA.findAll();
  }
}