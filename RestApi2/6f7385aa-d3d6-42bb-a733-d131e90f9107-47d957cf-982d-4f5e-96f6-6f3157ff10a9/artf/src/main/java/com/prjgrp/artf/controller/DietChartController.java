package com.prjgrp.artf.controller;

import com.prjgrp.artf.entity.DietChart;
import com.prjgrp.artf.entity.User;
import com.prjgrp.artf.repository.DietChartRepository;
import com.prjgrp.artf.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dietchart")
public class DietChartController {

    @Autowired
    private DietChartRepository dietChartRepository;

    @Autowired
    private UserRepository userRepository;

    // Add DietChart for a user
    @PostMapping("/{userId}/add")
    public DietChart addDietChart(@PathVariable int userId, @RequestBody DietChart dietChart) {
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
        dietChart.setUser(user);
        return dietChartRepository.save(dietChart);
    }

    // Get all Diet Charts
    @GetMapping("/get")
    public List<DietChart> getAllDietCharts() {
        return dietChartRepository.findAll();
    }
}
