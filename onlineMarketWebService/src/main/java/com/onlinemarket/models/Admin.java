package com.onlinemarket.models;

import javax.persistence.*;

@Entity(name = "Admin")
public class Admin extends User {

    public Admin(User user) {
        super(user);
    }
}