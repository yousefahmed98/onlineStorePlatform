package com.onlinemarket.data;


import com.onlinemarket.models.User;
import org.springframework.data.repository.CrudRepository;


public interface IUserDA extends CrudRepository<User,String> {

}