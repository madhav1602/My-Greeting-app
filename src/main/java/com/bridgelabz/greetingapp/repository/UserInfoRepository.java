package com.bridgelabz.greetingapp.repository;

import com.bridgelabz.greetingapp.model.UserInfoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfoModel, Long> {
}
