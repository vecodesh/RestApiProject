package com.prjgrp.artf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prjgrp.artf.entity.Challenge;

public interface ChallengeRepository extends JpaRepository<Challenge , Integer>{
    
}
