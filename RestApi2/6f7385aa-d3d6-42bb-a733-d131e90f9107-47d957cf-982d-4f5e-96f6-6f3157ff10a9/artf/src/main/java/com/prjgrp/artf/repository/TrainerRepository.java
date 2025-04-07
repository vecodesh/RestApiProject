package com.prjgrp.artf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prjgrp.artf.entity.Trainer;

public interface TrainerRepository extends JpaRepository<Trainer, Integer>{
    List<Trainer>findByName(String name);
}
