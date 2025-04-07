package com.prjgrp.artf.controller;

import com.prjgrp.artf.entity.User;
import com.prjgrp.artf.service.FitnessTrack;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController@RequestMapping("/user")
public class UserController {
    
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private FitnessTrack fitnesstrack;

    @PostMapping("/add")
    public User insertUser(@RequestBody User use){
        logger.info("Adding new user: {}", use.getUsername());
        return fitnesstrack.addUser(use);
    }

    @GetMapping("/get")
    public List<User>getUser(){
        logger.info("Fetching all users...");
        return fitnesstrack.getUser();
    }

    
    
}