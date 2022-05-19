package com.zxk.basis.config;


import com.zxk.basis.service.StrategyService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Map;

@Component
public class StrategyContext {
    @Resource
    private Map<Integer,StrategyService> strategyMap;

    public String getStrategyService(Integer code){
        StrategyService s = strategyMap.get(code);
        return s.print();

    }
}
