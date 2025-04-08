package com.raksmey.threadTutorial.raksmey_thread_tutorial.Threads;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestVirtualThread implements CommandLineRunner {
    Logger logger = LoggerFactory.getLogger(TestVirtualThread.class);

    @Override
    public void run(String... args) throws Exception {
        logger.info(":::TestVirtualThread class started:::");
        logger.info("Thread Name: {}", Thread.currentThread().getName());

        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(" Index: " + i);
            }
        };

        Thread vThread = Thread.ofVirtual().start(runnable);
    }
}
