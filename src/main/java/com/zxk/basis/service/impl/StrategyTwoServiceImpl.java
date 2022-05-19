package com.zxk.basis.service.impl;

import com.zxk.basis.service.StrategyService;
import com.zxk.basis.service.StrategyTwoService;
import org.springframework.stereotype.Service;

@Service
public class StrategyTwoServiceImpl implements StrategyTwoService,StrategyService {
    @Override
    public String print() {
        return "Two";
    }
}
