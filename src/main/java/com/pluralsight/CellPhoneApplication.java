package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone phone = new CellPhone();

//        System.out.println("What is the serial number?");
//        phone.setSerialNumber(scanner.nextLine());
//
//        System.out.println(" What model is the phone?");
//        phone.setModel(scanner.nextLine());
//
//        System.out.println("Who is the carrier?");
//        phone.setCarrier(scanner.nextLine());
//
//        System.out.println("What is the phone number?");
//        phone.setPhoneNumber(scanner.nextLine());
//
//        System.out.println("Who is the owner of the phone?");
//        phone.setOwner(scanner.nextLine());

        scanner.close();

        CellPhone myPhone = new CellPhone("1234", "iPhone", "Tmobile", "773-122-1111", "ME" );
        CellPhone otherPhone = new CellPhone("1234", "iPhone", "Tmobile", "773-022-0099", "other" );

        display(myPhone);
        display(otherPhone);

        System.out.println(myPhone.dial(phone.getPhoneNumber()));
        System.out.println(myPhone.dial(otherPhone));

    }

    public static void display(CellPhone phone) {
        System.out.println(phone.getPhoneNumber());
    }
}

