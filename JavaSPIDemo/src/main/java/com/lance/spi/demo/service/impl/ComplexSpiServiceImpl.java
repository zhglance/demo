package com.lance.spi.demo.service.impl;


import com.lance.spi.demo.iservice.SpiService;

public class ComplexSpiServiceImpl  implements SpiService {
    @Override
    public void execute() {
        System.out.println("ComplexSpiServiceImpl execute.");
    }
}

