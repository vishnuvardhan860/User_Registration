package com.userregistration;

import java.util.Scanner;

public class UserLastName {
    private static final String NamePattern = "^[A-Z][a-zA-Z]{2,}$";
    Scanner scanner = new Scanner(System.in);
    public void FirstnameValidator()
    {
        //Enter FirstName
        System.out.println("Enter First Name");
        String input = scanner.next();
        if (input.matches(NamePattern)) {
            System.out.println("first name was sucessfully added");
        }
        else {
            System.out.println("*Invalid First nametry again*");
            FirstnameValidator();
        }
    }
    public void LastnameValidator() {
        System.out.println("Enter the last name:");
        String input = scanner.next();
        if (input.matches(NamePattern)) {
            System.out.println("last name sucessfully entered");
        }
        else {
            System.out.println("*Invalid last nametry again*");
            LastnameValidator();
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to user registration");
        //Creating Objects
        UserLastName user = new UserLastName();
        user.FirstnameValidator();
        //getting Lastname Results
        user.LastnameValidator();
    }
}