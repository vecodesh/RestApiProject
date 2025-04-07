package com.prjgrp.artf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prjgrp.artf.entity.Admin;
import com.prjgrp.artf.repository.AdminRepository;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepo;

    public Admin addAdmin(Admin admin) {
        return adminRepo.save(admin);
    }

    public List<Admin> getAllAdmins() {
        return adminRepo.findAll();
    }

    public String deleteAdmin(int id) {
        adminRepo.deleteById(id);
        return "Admin deleted successfully!";
    }
}
