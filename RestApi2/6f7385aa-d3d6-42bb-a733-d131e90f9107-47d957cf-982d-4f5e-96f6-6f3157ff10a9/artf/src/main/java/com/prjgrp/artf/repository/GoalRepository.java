package com.prjgrp.artf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.prjgrp.artf.entity.Goal;

public interface GoalRepository extends JpaRepository<Goal , Integer> {
    // List<Goal>findByGoalTypeContaining(String goaltype);

    List<Goal>findByGoaltypeContainingIgnoreCase(String goaltype);


    @Query("SELECT g from Goal g where g.goaltype like 'c%'")
    List<Goal>findGoals();
}
