package com.onlinemarket.controllers;

import com.onlinemarket.models.User;
import com.onlinemarket.services.IGeneralServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
public class GeneralUserController {
    @Autowired
    IGeneralServices generalServices;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public Boolean login(@RequestParam String email,@RequestParam String pass) {
        return generalServices.findUser(email, pass);
    }

    @PostMapping(value = "/register")
    public Boolean register(@RequestBody User user) {
        return generalServices.saveUser(user);
    }
}
