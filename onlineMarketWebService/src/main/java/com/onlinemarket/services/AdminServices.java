package com.onlinemarket.services;

import java.util.List;

import com.onlinemarket.models.User;
import com.onlinemarket.data.IUserDA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServices implements  IAdminServices {

  @Autowired
  IUserDA da;

  @Override
  public Boolean findUser(String email, String pass) {
    return null;
  }

  @Override
  public Boolean saveUser(User user) {
    return null;
  }

  @Override
  public Iterable<User> findAll() {
    return da.findAll();
  }
}