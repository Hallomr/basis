package com.zxk.basis.proxy.service.impl;

import com.zxk.basis.proxy.service.ProxyService;

public class ProxyServiceImpl implements ProxyService {
    @Override
    public void add() {
        System.out.println("----add----");
    }

    @Override
    public void del() {
        System.out.println("----del----");
    }
}
