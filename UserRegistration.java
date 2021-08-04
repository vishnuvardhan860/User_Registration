package com.userregistration;

import java.util.Scanner;

public class UserRegistration {
    //user details
    private static final String NamePattern = "^[A-Z][a-zA-Z]{2,}$";
    Scanner scanner = new Scanner(System.in);
    public void FirstnameValidator()
    {
        //user firstname
        System.out.println("Enter First Name");
        String input = scanner.next();
        if (input.matches(NamePattern)) {
            System.out.println("first name was sucessfully added");
        }
        else {
            System.out.println("*Invalid First name try again*");
            FirstnameValidator();
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to user registration");
        UserLastName user = new UserLastName();
        user.FirstnameValidator();
    }


}