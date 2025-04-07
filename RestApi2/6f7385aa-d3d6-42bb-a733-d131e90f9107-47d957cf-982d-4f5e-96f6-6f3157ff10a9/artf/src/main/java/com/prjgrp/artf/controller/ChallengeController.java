package com.prjgrp.artf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prjgrp.artf.entity.Challenge;
import com.prjgrp.artf.service.ChallengeService;

@RestController@RequestMapping("/Chal")
public class ChallengeController {
    
    @Autowired
    ChallengeService chaSer;

    @PostMapping("/add")
    public Challenge addChallenge(@RequestBody Challenge cha){
        return chaSer.addChallenge(cha);
    }

    @GetMapping("/get")
    public List<Challenge>listAll(){
        return chaSer.listAll();
    }
}
