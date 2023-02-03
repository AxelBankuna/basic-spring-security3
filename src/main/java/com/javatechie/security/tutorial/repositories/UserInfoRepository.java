package com.javatechie.security.tutorial.repositories;

import com.javatechie.security.tutorial.config.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
}
