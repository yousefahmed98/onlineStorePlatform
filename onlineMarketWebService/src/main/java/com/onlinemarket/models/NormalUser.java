package com.onlinemarket.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "normaluser")
public class NormalUser extends User {
    @Column(name = "address")
    public String address;
    @Column(name = "phoneNo")
    public String phoneNo;

    public NormalUser(User user) {
        super(user);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }


}