package main.com.jd.controller;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by yangyuan on 9/10/18.
 */
public class ScheduleTest {
    public static void main(String[] args) throws InterruptedException {
        final ScheduledThreadPoolExecutor t = new ScheduledThreadPoolExecutor(3);
        final int seconds = 2;
        t.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello ..");
            }
        }, seconds, TimeUnit.SECONDS)   ;
        TimeUnit.SECONDS.sleep(1000);
    }
}
