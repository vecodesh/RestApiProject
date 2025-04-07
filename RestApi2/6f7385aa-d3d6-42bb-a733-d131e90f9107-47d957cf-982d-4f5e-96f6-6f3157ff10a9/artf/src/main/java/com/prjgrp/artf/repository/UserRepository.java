package com.prjgrp.artf.repository;

import com.prjgrp.artf.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Integer>{
    
    
}
