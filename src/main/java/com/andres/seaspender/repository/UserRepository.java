package com.andres.seaspender.repository;

import com.andres.seaspender.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
