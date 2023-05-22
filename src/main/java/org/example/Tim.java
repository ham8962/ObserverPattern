package org.example;

public class Tim implements Customer {
    @Override
    public void update(String message) {
        System.out.println("Tim RECEPTION : " + message);
    }
}
