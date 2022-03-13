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

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First name: ");
        String fName = sc.next();
        System.out.println("Enter Last name: ");
        String lName = sc.next();
        Employee e1 = new Employee(fName,lName);

        System.out.println("Please enter the department from following:");
        System.out.println("1.Technical");
        System.out.println("2.Admin");
        System.out.println("3.Human Resource");
        System.out.println("4.Legal");

        int dept = sc.nextInt();
        switch (dept){
            case 1:
                e1.setDepartment("tech");
                break;
            case 2:
                e1.setDepartment("admin");
                break;
            case 3:
                e1.setDepartment("hr");
                break;
            case 4:
                e1.setDepartment("legal");
                break;
            default:
                System.out.println("Wrong Input");
        }
        /*e1.generateEmailAddress(e1);
        e1.generatePassword(e1);
        e1.showCredentials(e1);*/
        e1.generateEmailAddress();
        e1.generatePassword();
        e1.showCredentials();



    }
}


