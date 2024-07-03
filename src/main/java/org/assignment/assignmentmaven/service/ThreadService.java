package org.assignment.assignmentmaven.service;

import org.assignment.assignmentmaven.operations.Worker;

public class ThreadService {
    public void runThreads() throws InterruptedException {
        Thread t1 = new Thread(new Worker(), "T1");
        Thread t2 = new Thread(new Worker(), "T2");
        Thread t3 = new Thread(new Worker(), "T3");
        Thread t4 = new Thread(new Worker(), "T4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // Ensuring each thread prints when it finishes
        t1.join();
        System.out.println("T1 has finished");
        t2.join();
        System.out.println("T2 has finished");
        t3.join();
        System.out.println("T3 has finished");
        t4.join();
        System.out.println("T4 has finished");

        // Now start T5 after T1, T2, T3, and T4 have finished
        Thread t5 = new Thread(() -> {
            System.out.println("T5 is running after T1, T2, T3, T4 finished");
        }, "T5");

        t5.start();
        t5.join();
        System.out.println("T5 has finished");
    }
}
