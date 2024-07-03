package org.assignment.assignmentmaven.operations;

public class Worker implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
