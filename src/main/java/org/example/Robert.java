package org.example;

public class Robert implements Customer {
    @Override
    public void update(String message) {
        System.out.println("Robert RECEPTION : " + message);
    }
}