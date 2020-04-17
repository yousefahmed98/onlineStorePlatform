package com.onlinemarket.models;

import com.onlinemarket.data.IUserDA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


@Entity(name = "user")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", unique = true)
  private int id;
  @Column(name = "email")
  private String email;
  @Column(name = "name")
  private String name;
  @Column(name = "password")
  private String password;
  @Column(name = "type")
  private String userType;

  public User (){
  }

  public User(User user){
    this.id = user.id;
    this.email = user.email;
    this.name = user.name;
    this.password = user.password;
    this.userType = user.userType;
  }

  public void setUserType(String userType) {
    this.userType = userType;
  }

  public String getUserType() {
    return userType;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getPassword(){
    return password;
  }
}