package com.mycompany.praktika_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PassportList passportList = new PassportList();
        try (Scanner scanner = new Scanner(System.in)) {
            passportList.addPassport(new Passport(101, "Alice Smith", "Manager", true));
            passportList.addPassport(new Passport(102, "Bob Brown", "Engineer", false));
            passportList.addPassport(new Passport(103, "Charlie Davis", "Developer", true));
            passportList.addPassport(new Passport(104, "David Wilson", "Designer", false));
            passportList.addPassport(new Passport(105, "Eve Johnson", "Analyst", true));
            
            passportList.printPassportsSortedByFullName();
            passportList.printPassportsSortedByNumber();
            
            System.out.println("Enter the details of the new passport to add:");
            System.out.print("Passport Number: ");
            int passportNumber = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Full Name: ");
            String fullName = scanner.nextLine();
            System.out.print("Position: ");
            String position = scanner.nextLine();
            System.out.print("Access Allowed (true/false): ");
            boolean accessAllowed = scanner.nextBoolean();
            
            passportList.addPassport(new Passport(passportNumber, fullName, position, accessAllowed));
            
            passportList.printPassportsSortedByFullName();
            passportList.printPassportsSortedByNumber();
        }
    }
}