package com.mendes;

public class Main {

    public static void main(String[] args) {

        Thread.currentThread().setName("My name is main metod");
        System.out.println("Main method is starting... Thread: " + Thread.currentThread().getName());

        EmployeeThread employeeThread = new EmployeeThread();
        employeeThread.setName("My name is EmployeeThread");
        employeeThread.start();

        EmployeeRunnable employeeRunnable = new EmployeeRunnable();
        Thread thread = new Thread(employeeRunnable);
        thread.setName("My name is EmployeeRunnable");
        thread.start();

        //create with inner class
        new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("My name is inner class");
                try {
                    System.out.println("Inner class is starting... Thread: " + Thread.currentThread().getName());
                    for (int i = 1; i <= 5; i++) {
                        Thread.sleep(1000);
                        System.out.println("wait 5 second for inner class..." + i);
                    }
                    System.out.println("Inner class finished. Thread: " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        //create new thread
        new Thread() {
            public void run() {
                Thread.currentThread().setName("My name is new thread");
                try {
                    System.out.println("New Thread is starting... Thread: " + Thread.currentThread().getName());
                    for (int i = 1; i <= 5; i++) {
                        Thread.sleep(1000);
                        System.out.println("wait 5 second for new thread..." + i);
                    }
                    System.out.println("New Thread finished. Thread: " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();

        System.out.println("Main method finished. Thread: " + Thread.currentThread().getName());
    }
}
