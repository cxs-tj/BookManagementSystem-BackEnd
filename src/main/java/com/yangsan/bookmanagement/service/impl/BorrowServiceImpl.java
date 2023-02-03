package com.yangsan.bookmanagement.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yangsan.bookmanagement.entity.Borrow;
import com.yangsan.bookmanagement.mapper.BorrowMapper;
import com.yangsan.bookmanagement.service.BorrowService;
import org.springframework.stereotype.Service;

@Service
public class BorrowServiceImpl extends ServiceImpl<BorrowMapper, Borrow> implements BorrowService {
}
