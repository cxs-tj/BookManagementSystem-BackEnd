package com.yangsan.bookmanagement.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yangsan.bookmanagement.entity.Student;
import com.yangsan.bookmanagement.mapper.StudentMapper;
import com.yangsan.bookmanagement.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {
}
