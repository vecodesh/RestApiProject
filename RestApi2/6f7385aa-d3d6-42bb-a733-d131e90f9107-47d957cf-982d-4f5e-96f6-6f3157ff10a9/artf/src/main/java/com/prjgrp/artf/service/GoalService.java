package com.prjgrp.artf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.prjgrp.artf.entity.Goal;
import com.prjgrp.artf.repository.GoalRepository;

@Service
public class GoalService {
    
    @Autowired
    GoalRepository goalRepo;

    public Goal addGoal(Goal go){
        return goalRepo.save(go);
    }

    public List<Goal> listGoal(){
        return goalRepo.findAll();
    }

    public String deleteGoal(int id){
        goalRepo.deleteById(id);
        return "Successfully deleted  the goal";
    }

    public Page<Goal>getGoalByPage(int page, int size){
        Pageable pageable = PageRequest.of(page, size);
            return goalRepo.findAll(pageable);
    }

    public List<Goal>searchGoalByType(String goaltype){
        return goalRepo.findByGoaltypeContainingIgnoreCase(goaltype);
    }
    
    // public List<Goal>searchGoalByType(String goaltype){
    //     return goalRepo.findByGoalTypeContaining(goaltype);
    // }
}
