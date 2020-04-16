package com.onlinemarket.services;

import com.onlinemarket.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IAdminServices {

  public Iterable<User> findAll();

}