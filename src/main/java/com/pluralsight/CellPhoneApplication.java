package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone phone = new CellPhone();

        System.out.println("What is the serial number?");
        phone.setSerialNumber(scanner.nextLine());

        System.out.println(" What model is the phone?");
        phone.setModel(scanner.nextLine());

        System.out.println("Who is the carrier?");
        phone.setCarrier(scanner.nextLine());

        System.out.println("What is the phone number?");
        phone.setPhoneNumber(scanner.nextLine());

        System.out.println("Who is the owner of the phone?");
        phone.setOwner(scanner.nextLine());

        CellPhone phone1 = new CellPhone();

        System.out.println("What is the serial number?");
        phone1.setSerialNumber(scanner.nextLine());

        System.out.println(" What model is the phone?");
        phone1.setModel(scanner.nextLine());

        System.out.println("Who is the carrier?");
        phone1.setCarrier(scanner.nextLine());

        System.out.println("What is the phone number?");
        phone1.setPhoneNumber(scanner.nextLine());

        System.out.println("Who is the owner of the phone?");
        phone1.setOwner(scanner.nextLine());

        scanner.close();

        display(phone);

        System.out.println(phone1.dial(phone.getPhoneNumber()));

    }

    public static void display(CellPhone phone) {
        System.out.println(phone.getPhoneNumber());
    }
}
