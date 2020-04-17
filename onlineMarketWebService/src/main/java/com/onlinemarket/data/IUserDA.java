package com.onlinemarket.data;


import com.onlinemarket.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IUserDA extends JpaRepository<User,String> {
    User findByEmail(String email);
}