package com.GreatLearning.Lab1;

import java.util.Scanner;

public class Employee extends CredentialService {
    final String companyName="abc";
    String firstName;
    String lastName;

    public void setDepartment(String department) {
        this.department = department;
    }

    String department;
    String email;
    String password;
    Employee(String firstName, String lastName){
        this.lastName = lastName;
        this.firstName = firstName;
    }


    public void generateEmailAddress() {
        super.generateEmailAddress(this);
    }


    public void generatePassword() {
        super.generatePassword(this);
    }


    public void showCredentials() {
        super.showCredentials(this);
    }

}


