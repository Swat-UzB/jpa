package com.example.jpaexampl;

import com.example.jpaexampl.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {

}
