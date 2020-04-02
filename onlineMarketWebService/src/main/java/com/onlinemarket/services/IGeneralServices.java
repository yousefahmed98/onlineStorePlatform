package com.onlinemarket.services;


import com.onlinemarket.models.User;
import org.springframework.stereotype.Service;

@Service
public interface IGeneralServices {

  public Boolean findUser(String email, String pass);

  public Boolean saveUser(User user);

}