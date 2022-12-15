package com.spring.Valid.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.Valid.bean.User;
@Repository
public interface UserJpa extends JpaRepository<User, Integer> {

}
