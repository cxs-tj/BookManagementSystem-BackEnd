package com.yangsan.bookmanagement.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yangsan.bookmanagement.entity.Admin;
import com.yangsan.bookmanagement.mapper.AdminMapper;
import com.yangsan.bookmanagement.service.AdminService;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {
}
