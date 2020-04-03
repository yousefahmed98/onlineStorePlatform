package com.onlinemarket.models;

import javax.persistence.*;


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
}