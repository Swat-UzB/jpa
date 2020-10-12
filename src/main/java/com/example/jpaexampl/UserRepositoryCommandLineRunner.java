package com.example.jpaexampl;

import com.example.jpaexampl.entity.User;
import com.example.jpaexampl.service.UserDAOService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

    // == fields ==
    @Autowired
    private UserDAOService userDAOService;


    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jack", "Admin");
        long insert = userDAOService.insert(user);
        log.info("New User is created :{}",insert);
    }
}
