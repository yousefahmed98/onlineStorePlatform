package com.onlinemarket.services;

import com.onlinemarket.models.IUser;

import java.util.List;

public interface IAdminServices {

  public List<IUser> findAll();

}