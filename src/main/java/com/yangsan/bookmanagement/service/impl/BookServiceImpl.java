package com.yangsan.bookmanagement.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yangsan.bookmanagement.entity.Book;
import com.yangsan.bookmanagement.mapper.BookMapper;
import com.yangsan.bookmanagement.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {
}
