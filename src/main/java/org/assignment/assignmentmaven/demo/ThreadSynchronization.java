package org.assignment.assignmentmaven.demo;

import org.assignment.assignmentmaven.service.ThreadService;

public class ThreadSynchronization {
    public static void main(String[] args) {
        ThreadService service = new ThreadService();
        try {
            service.runThreads();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
