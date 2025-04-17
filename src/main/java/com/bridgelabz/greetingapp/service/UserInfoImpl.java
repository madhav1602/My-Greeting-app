package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.model.UserInfoModel;
import com.bridgelabz.greetingapp.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoImpl implements IUserInfoService {
    @Autowired
    UserInfoRepository userinforepository;
    public void createUser(UserInfoModel user){
        userinforepository.save(user);
    }

    public String getByID(Long id){
        Object obj= userinforepository.findById(id);
        return obj.toString();
    }
}
