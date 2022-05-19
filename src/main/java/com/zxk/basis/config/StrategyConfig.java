package com.zxk.basis.config;


import com.zxk.basis.enums.StrategyEnum;
import com.zxk.basis.service.StrategyService;
import com.zxk.basis.service.impl.StrategyOneServiceImpl;
import com.zxk.basis.service.impl.StrategyTwoServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class StrategyConfig {
    @Resource
    private StrategyOneServiceImpl strategyOneService;
    @Resource
    private StrategyTwoServiceImpl strategyTwoService;

    @Bean
    public Map strategyMap(){
        Map<Integer, StrategyService> strategyMap = new HashMap<>();
        strategyMap.put(StrategyEnum.STRATEGY_ONE.getCode(),strategyOneService);
        strategyMap.put(StrategyEnum.STRATEGY_TWO.getCode(),strategyTwoService);
        return strategyMap;
    }

}
