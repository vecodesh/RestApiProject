package com.prjgrp.artf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prjgrp.artf.entity.Challenge;
import com.prjgrp.artf.repository.ChallengeRepository;

@Service
public class ChallengeService {

    @Autowired
    ChallengeRepository chaRepo;

    public Challenge addChallenge(Challenge cha){
        return chaRepo.save(cha);
    }
    
    public List<Challenge>listAll(){
        return chaRepo.findAll();
    }
}
