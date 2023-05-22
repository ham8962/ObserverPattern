package org.example;

import java.util.ArrayList;

public class PhoneStore implements Store {
    private final ArrayList<Customer> customers = new ArrayList<>();

    public void newPhone() {
        System.out.println("A new model has been stocked");
        notifyCustomer("a new model is in stock");
    }

    @Override
    public void subscribe(Customer customer) {
        customers.add(customer);
    }

    @Override
    public void unsubscribe(Customer customer) {
        customers.remove(customer);
    }

    @Override
    public void notifyCustomer(String message) {
        for (Customer customer : customers) {
            customer.update(message);
        }
    }


}
