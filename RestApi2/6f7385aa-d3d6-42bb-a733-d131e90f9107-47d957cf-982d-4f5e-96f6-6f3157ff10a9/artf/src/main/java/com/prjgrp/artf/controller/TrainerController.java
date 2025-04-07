package com.prjgrp.artf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prjgrp.artf.entity.Trainer;
import com.prjgrp.artf.service.TrainerService;


@RestController@RequestMapping("/trainer")
public class TrainerController {
    
    @Autowired
    private TrainerService trainser;

    @PostMapping("/add")
    public Trainer insertTrainer(@RequestBody Trainer train){
        return trainser.addTrainer(train);
    }

    @GetMapping("/get")
    public List<Trainer>getTrainer(){
        return trainser.getTrainer();
    }

    @GetMapping("/find")
    public List<Trainer>findTrainerByName(@RequestParam String name){
        return trainser.findTrainerByName(name);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteTrain(@PathVariable int id){
        return trainser.deleteTrain(id);
    }

}
