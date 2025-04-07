package com.prjgrp.artf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prjgrp.artf.entity.DietChart;

public interface DietChartRepository extends JpaRepository<DietChart, Integer>{
    
}
