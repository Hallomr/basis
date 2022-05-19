package com.zxk.basis.service.impl;

import com.zxk.basis.service.StrategyOneService;
import com.zxk.basis.service.StrategyService;
import org.springframework.stereotype.Service;

@Service
public class StrategyOneServiceImpl implements StrategyOneService,StrategyService {
    @Override
    public String print() {
        return "One";
    }
}
