package com.mendes;

/**
 * Created by mendesmustafa on 14.01.2021.
 */

public class EmployeeThread extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("EmployeeThread is starting... Thread: " + Thread.currentThread().getName());
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(1000);
                System.out.println("wait 5 second for employeethread..." + i);
            }
            System.out.println("EmployeeThread finished. Thread: " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}