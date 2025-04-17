package com.bridgelabz.greetingapp.controller;

import com.bridgelabz.greetingapp.model.UserInfoModel;
import com.bridgelabz.greetingapp.service.UserInfoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserInfoController {

    @Autowired
    UserInfoImpl userinfoimpl;

    @GetMapping("/display/{id}")
    public String display(@PathVariable("id") Long id){
        return userinfoimpl.getByID(id);

    }
    @PostMapping("/createuser")
    public void create(@RequestBody UserInfoModel user){
        userinfoimpl.createUser(user);
    }
}
