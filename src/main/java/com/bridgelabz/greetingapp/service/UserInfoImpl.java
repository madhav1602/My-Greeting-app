package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.model.UserInfoModel;
import com.bridgelabz.greetingapp.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserInfoImpl implements IUserInfoService {
    @Autowired
    UserInfoRepository userinforepository;


    public void createUser(UserInfoModel user) {
        System.out.println("Creating user: " ); // log input
        userinforepository.save(user);
        System.out.println("User saved successfully.");
    }

    public String getByID(Long id) {
        System.out.println("Fetching user by ID: " + id);
        Optional<UserInfoModel> user = userinforepository.findById(id);
        UserInfoModel u=user.get();
        return "hello "+u.getFirstName()+" "+u.getLastName();
    }


}
