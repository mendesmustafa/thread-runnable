package com.mendes;

/**
 * Created by mendesmustafa on 14.01.2021.
 */

public class EmployeeRunnable implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("EmployeeRunnable is starting... Thread: " + Thread.currentThread().getName());
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(1000);
                System.out.println("wait 5 second for employeerunnable... " + i);
            }
            System.out.println("EmployeeRunnable finished. Thread: " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}