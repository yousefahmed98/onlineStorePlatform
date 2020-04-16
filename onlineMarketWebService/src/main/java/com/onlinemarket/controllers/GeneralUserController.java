package com.onlinemarket.controllers;

import com.onlinemarket.models.User;
import com.onlinemarket.services.IGeneralServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class GeneralUserController {
    @Autowired
    private IGeneralServices generalServices;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public Boolean login(String email, String pass) {
        return null;
    }
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public Boolean register(User user) {
        return generalServices.saveUser(user);
    }
}
