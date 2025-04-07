package com.prjgrp.artf.controller;

import com.prjgrp.artf.entity.Admin;
import com.prjgrp.artf.service.AdminService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/add")
    public Admin addAdmin(@RequestBody Admin admin) {
        return adminService.addAdmin(admin);
    }

    @GetMapping("/get")
    public List<Admin> getAdmins() {
        return adminService.getAllAdmins();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteAdmin(@PathVariable int id) {
        return adminService.deleteAdmin(id);
    }
}
