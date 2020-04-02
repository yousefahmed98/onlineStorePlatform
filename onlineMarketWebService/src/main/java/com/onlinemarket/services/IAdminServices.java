package com.onlinemarket.services;

import com.onlinemarket.models.IUser;

import java.util.List;

public interface IAdminService {

  public List<IUser> findAll();

}