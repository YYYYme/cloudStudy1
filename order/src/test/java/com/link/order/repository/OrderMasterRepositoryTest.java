package com.link.order.repository;

import com.link.order.OrderApplicationTests;
import org.junit.Test;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

import static org.junit.Assert.*;
@Component
public class OrderMasterRepositoryTest extends OrderApplicationTests {
    @Test
    public void testSaveBankAcctDaily() {
        Runnable task = () -> {
            // 构造测试数据

        };
        // 模拟一个账号同时5条请求
        int threadNums = 5;
        final CountDownLatch startGate = new CountDownLatch(1);
        for (int i = 0; i < threadNums; i++) {
            Thread t = new Thread(() -> {
                try {
                    startGate.await();
                    System.out.println("第条线程执行");
                    task.run();
                } catch (InterruptedException ie) {
                }
            });
            t.start();
            System.out.println("第"+i+"条线程开始" );
        }

        startGate.countDown();
    }
}