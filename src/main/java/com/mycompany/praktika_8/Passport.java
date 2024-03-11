package com.mycompany.praktika_8;

public class Passport {
    private int passportNumber;
    private String fullName;
    private String position;
    private boolean accessAllowed;

    public Passport(int passportNumber, String fullName, String position, boolean accessAllowed) {
        this.passportNumber = passportNumber;
        this.fullName = fullName;
        this.position = position;
        this.accessAllowed = accessAllowed;
    }

    public int getPassportNumber() {
        return passportNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public boolean isAccessAllowed() {
        return accessAllowed;
    }

    public void setAccessAllowed(boolean accessAllowed) {
        this.accessAllowed = accessAllowed;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "passportNumber=" + passportNumber +
                ", fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", accessAllowed=" + accessAllowed +
                '}';
    }
}