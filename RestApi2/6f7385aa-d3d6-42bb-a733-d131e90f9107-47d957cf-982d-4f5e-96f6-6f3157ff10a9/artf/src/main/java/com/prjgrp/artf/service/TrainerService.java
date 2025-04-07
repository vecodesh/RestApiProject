package com.prjgrp.artf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prjgrp.artf.entity.Trainer;
import com.prjgrp.artf.repository.TrainerRepository;

@Service
public class TrainerService {

    @Autowired
    TrainerRepository trainrepo;

    public Trainer addTrainer(Trainer train){
        return trainrepo.save(train);
    }
    
    public List<Trainer>getTrainer(){
        return trainrepo.findAll();
    }

    public List<Trainer>findTrainerByName(String name){
        return trainrepo.findByName(name);
    }

    public String deleteTrain(int id){
        trainrepo.deleteById(id);
        return "Successfully deleted  the goal";
    }
}
