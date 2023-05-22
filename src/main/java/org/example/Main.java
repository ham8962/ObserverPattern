package org.example;

public class Main {
    public static void main(String[] args) {
        PhoneStore store = new PhoneStore();
        Tim tim = new Tim();
        Robert robert = new Robert();

        store.subscribe(tim);
        store.subscribe(robert);

        store.newPhone();

        store.unsubscribe(robert);
        store.newPhone();
    }
}