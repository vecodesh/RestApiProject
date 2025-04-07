package com.prjgrp.artf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
// import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prjgrp.artf.entity.Goal;
import com.prjgrp.artf.repository.GoalRepository;
import com.prjgrp.artf.service.GoalService;


@RestController
@RequestMapping("/goal")
public class GoalController {
    
    @Autowired
    private GoalService goSer;

    @Autowired
    private GoalRepository goRepo;

    @PostMapping("/add")
    public Goal addGoal(@RequestBody Goal go){
        return goSer.addGoal(go);
    }

    @GetMapping("/get")
    public List<Goal>listGoal(){
        return goSer.listGoal();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteGoal(@PathVariable int id){
        return goSer.deleteGoal(id);
    }

    @GetMapping("/page")
    public Page<Goal>getGoalByPage(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "5") int size){
        return goSer.getGoalByPage(page, size);
    }

    // @GetMapping("/search")
    // public ResponseEntity<List<Goal>>searchGoalType(@RequestParam String goaltype){
    //     List<Goal> goa = goSer.searchGoalByType(goaltype);
    //     return ResponseEntity.ok(goa);
    // }
    @GetMapping("/finc")
    public List<Goal>getByCGoals(){
        return goRepo.findGoals();
    }

    @GetMapping("/searchByGoalType")
    public List<Goal>searchGoalType(@RequestParam String goaltype){
        return goSer.searchGoalByType(goaltype);
    }

}
