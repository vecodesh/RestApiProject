package com.prjgrp.artf.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.prjgrp.artf.entity.User;
import com.prjgrp.artf.repository.UserRepository;

@Service
public class FitnessTrack {

    private static final Logger logger = LoggerFactory.getLogger(FitnessTrack.class);

    @Autowired
    UserRepository userRepo;
    

    public User addUser(User user) {
        logger.info("Saving user: {}", user.getUsername());
        if (user.getUserProfile() != null) {
            user.getUserProfile().setUser(user);
        }
        return userRepo.save(user);
    }
    public List<User>getUser(){
        logger.info("Retrieving all users...");
        return  userRepo.findAll();
    }

}
