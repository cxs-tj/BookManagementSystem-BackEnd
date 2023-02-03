package com.yangsan.bookmanagement.controller;


import com.yangsan.bookmanagement.entity.Admin;
import com.yangsan.bookmanagement.results.Result;
import com.yangsan.bookmanagement.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
@CrossOrigin
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("")
    public Result<List<Admin>> getAll(){
        return Result.success(adminService.list());
    }
}
