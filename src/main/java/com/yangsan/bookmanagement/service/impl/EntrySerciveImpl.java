package com.yangsan.bookmanagement.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yangsan.bookmanagement.entity.Entry;
import com.yangsan.bookmanagement.mapper.EntryMapper;
import com.yangsan.bookmanagement.service.EntryService;
import org.springframework.stereotype.Service;

@Service
public class EntrySerciveImpl extends ServiceImpl<EntryMapper, Entry> implements EntryService {
}
