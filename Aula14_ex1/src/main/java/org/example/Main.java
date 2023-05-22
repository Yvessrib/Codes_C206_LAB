package org.example;

public class Main {
    public static void main(String[] args) {

        /*
        ThreadContadora t1 = new ThreadContadora("Thread 1");
        ThreadContadora t2 = new ThreadContadora("Thread 2");
        ThreadContadora t3 = new ThreadContadora("Thread 3");

        Thread tc1 = new Thread(t1);
        Thread tc2 = new Thread(t2);
        Thread tc3 = new Thread(t3);

        tc1.start();
        tc2.start();
        tc3.start();
         */

        ThreadContadora to1 = new ThreadContadora("Judith",3000);
        ThreadContadora to2 = new ThreadContadora("Yves",1000);

        to1.start();
        to2.start();
    }
}