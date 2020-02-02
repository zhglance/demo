package com.lance.spi.demo.service.impl;


import com.lance.spi.demo.iservice.SpiService;

public class SimpleSpiServiceImpl implements SpiService {
    @Override
    public void execute() {
        System.out.println("SimpleSpiService execute.");
    }
}
