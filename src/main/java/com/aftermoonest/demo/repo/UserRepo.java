package com.aftermoonest.demo.repo;

import com.aftermoonest.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepo extends JpaRepository<User, Long> {

}
