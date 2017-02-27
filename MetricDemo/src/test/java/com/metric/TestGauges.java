package com.metric;

import com.yammer.metrics.Metrics;
import com.yammer.metrics.core.Gauge;
import com.yammer.metrics.reporting.ConsoleReporter;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/**
 * TODO
 *
 * @author scutshuxue.chenxf
 */
public class TestGauges {
    public static Queue<String> queue = new LinkedList<String>();

    public static void main(String[] args) {
        ConsoleReporter.enable(1, TimeUnit.SECONDS);

        Gauge<Integer> g = Metrics.newGauge(TestGauges.class, "pending-jobs", new Gauge<Integer>() {
            @Override
            public Integer value() {
                return queue.size();
            }
        });
        queue.add("ssss");
        System.out.println("queue.size:" + g.value());



         while (true) {
            try {
                Thread.sleep(10000);
                queue.add("abc");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
         }
    }
}