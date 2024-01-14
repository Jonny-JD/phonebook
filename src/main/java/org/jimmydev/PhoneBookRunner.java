package org.jimmydev;

public class PhoneBookRunner {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Jimmy", "123243141");
        phoneBook.add("Jimmy", "123243142");
        phoneBook.add("Jimmy", "123243143");
        phoneBook.add("Amy", "123243141");
        phoneBook.add("Amy", "12324314214");
        phoneBook.add("Ben", "123243141");

        phoneBook.printSorted();

    }
}
