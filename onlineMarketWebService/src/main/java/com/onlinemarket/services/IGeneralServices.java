package com.onlinemarket.services;


import com.onlinemarket.models.User;


public interface IGeneralServices {

  public Boolean findUser(String email, String pass);

  public Boolean saveUser(User user);

}