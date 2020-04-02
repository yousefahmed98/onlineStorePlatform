package com.onlinemarket.data;


import com.onlinemarket.models.IUser;
import org.springframework.data.repository.CrudRepository;

import java.util.Vector;

public interface IUserDA extends CrudRepository<IUser,String> {

}