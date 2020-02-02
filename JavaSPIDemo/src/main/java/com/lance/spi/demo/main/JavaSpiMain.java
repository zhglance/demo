package com.lance.spi.demo.main;

import com.lance.spi.demo.iservice.SpiService;
import sun.misc.Service;

import java.util.Iterator;
import java.util.ServiceLoader;

public class JavaSpiMain {


    public static void main(String[] args) {


        System.out.println("----------- Service.providers --------------");

        Iterator<SpiService> providers = Service.providers(SpiService.class);


        while(providers.hasNext()) {
            SpiService spiService = providers.next();
            spiService.execute();
        }
        System.out.println("------------ ServiceLoader.load ----------------");


        ServiceLoader<SpiService> load = ServiceLoader.load(SpiService.class);
        Iterator<SpiService> iterator = load.iterator();
        while(iterator.hasNext()) {
            SpiService spiService = iterator.next();
            spiService.execute();
        }



    }
}
