package com.zxk.basis.controller;


import com.zxk.basis.config.StrategyContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/strategy")
public class StrategyController {
    @Autowired
    private StrategyContext context;

    /**
     * 策略模式
     * */
    @RequestMapping("/{code}")
    public String strategy(@PathVariable Integer code){
       return context.getStrategyService(code);
    }
}
