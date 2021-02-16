package javaRepeat.Lesson3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class TestClass3 {
    public static void main(String[] args) throws InterruptedException {
        int poolSize = 15;
        ExecutorService executorService = Executors.newFixedThreadPool(poolSize);
        Object lockObject = new Object();
        AtomicInteger counter = new AtomicInteger(0);
        executorService.submit(new PingPong(lockObject, "Ping", counter));
        executorService.submit(new PingPong(lockObject, "Pong", counter));

        Counter poolCounter = new Counter();
        for (int i = 0; i < poolSize; i++) {
            executorService.execute(() -> {
                for (int j = 0; j < 100; j++) {
                    poolCounter.increment();
                }
            });
        }

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.HOURS);
        System.out.println(poolCounter.get());
    }
}
