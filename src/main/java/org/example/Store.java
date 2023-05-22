package org.example;

public interface Store {
    void subscribe(Customer customer);

    void unsubscribe(Customer customer);

    void notifyCustomer(String message);
}
