package com.mycompany.praktika_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PassportList {
    private List<Passport> passports = new ArrayList<>();

    public void addPassport(Passport newPassport) {
        passports.removeIf(p -> p.getPassportNumber() == newPassport.getPassportNumber());
        passports.add(newPassport);
    }

    public void printPassportsSortedByFullName() {
        List<Passport> sortedPassports = new ArrayList<>(passports);
        Collections.sort(sortedPassports, Comparator.comparing(Passport::getFullName));
        System.out.println("Passports sorted by full name: ");
        for (Passport passport : sortedPassports) {
            System.out.println(passport);
        }
    }

    public void printPassportsSortedByNumber() {
        List<Passport> sortedPassports = new ArrayList<>(passports);
        sortedPassports.sort(Comparator.comparingInt(Passport::getPassportNumber));
        System.out.println("Passports sorted by number: ");
        for (Passport passport : sortedPassports) {
            System.out.println(passport);
        }
    }
}