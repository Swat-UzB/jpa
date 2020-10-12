package com.example.jpaexampl.service;

import com.example.jpaexampl.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class UserDAOService {

    // == fields ==
    @PersistenceContext
    private EntityManager entityManager;

    // == public methods ==
    public long insert(User user) {
        entityManager.persist(user);
        return user.getId();
    }
}
