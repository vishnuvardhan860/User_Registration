package com.userregistration;

import java.util.Scanner;

public class MobileFormat {
    private static final String NamePattern = "^[A-Z][a-zA-Z]{2,}$";
    private static final String EmailPattern = "^[0-9a-zA-Z]+([.\\-+]?[a-zA-Z0-9]+)?\\@[0-9a-zA-Z]+.[a-zA-Z]{2,4}(.[a-zA-Z]{2,})*$";
    private static final String PhonenumberPattern = "^([\\+]?91)?[6-9]{1}[0-9]{9}$";
    Scanner scanner = new Scanner(System.in);

    public void FirstnameValidator() {
        System.out.println("Enter First Name");
        String input = scanner.next();
        if (input.matches(NamePattern)) {
            System.out.println("first name sucessfully entered");
        } else {
            System.out.println("*Invalid First nametry again*");
            FirstnameValidator();
        }
    }
        public void PhoneNumberValidator() {
            System.out.println("Enter the phone Number:");
            String input = scanner.next();
            if (input.matches(PhonenumberPattern)) {
                System.out.println("phone number sucessfully entered");
            }
            else {
                System.out.println("*Invalid phone numbertry again*");
                PhoneNumberValidator();
            }
        }
        public static void main(String[] args) {
            System.out.println("Welcome to user registration");
            MobileFormat mv = new MobileFormat();
            mv.FirstnameValidator();
            mv.PhoneNumberValidator();
    }
}