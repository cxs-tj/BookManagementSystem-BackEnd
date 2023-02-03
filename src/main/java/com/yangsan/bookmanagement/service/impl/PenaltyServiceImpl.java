package com.yangsan.bookmanagement.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yangsan.bookmanagement.entity.Penalty;
import com.yangsan.bookmanagement.mapper.PenaltyMapper;
import com.yangsan.bookmanagement.service.PenaltyService;
import org.springframework.stereotype.Service;

@Service
public class PenaltyServiceImpl extends ServiceImpl<PenaltyMapper, Penalty> implements PenaltyService {
}
