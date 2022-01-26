package com.bridgelabz.testjunit;

public class UserRegistrationRegexPattern {

    public static void main(String[] args) {

        UserRegistration userEntry = new UserRegistration();

        System.out.println(userEntry.validateFirstName());
        System.out.println(userEntry.validateLastName());
        System.out.println(userEntry.validateMailID());
        System.out.println(userEntry.validateMobileNumber());
        System.out.println(userEntry.validatePassword());
    }
}