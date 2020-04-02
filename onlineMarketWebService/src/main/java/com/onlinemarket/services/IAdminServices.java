package com.onlinemarket.services;

import com.onlinemarket.models.User;

import java.util.List;

public interface IAdminServices extends IGeneralServices{

  public List<User> findAll();

}