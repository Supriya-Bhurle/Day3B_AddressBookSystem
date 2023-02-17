package com.bridgelabz.addressbooksystem;

import static com.bridgelabz.addressbooksystem.AddressBook.multipleAddressBook;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to the Address book System project: ");
        AddressBook addressBook = new AddressBook();
        System.out.println("--------------------------Address Book-------------------------");
        multipleAddressBook(addressBook);
    }
}

