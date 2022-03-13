package com.GreatLearning.Lab1;
import  java.util.Random ;

public class CredentialService {
    public void generatePassword(Employee e) {
        //length of Password between 6 and 12
        Random ran = new Random();
        int len= ran.nextInt(7) + 6;
        String password="";
        //Adding Capital
        password = password.concat(String.valueOf((char)(ran.nextInt(26)+65))) ;
        //Adding Special Character
        /** 1 -> 33 to 47
         *  2  -> 91 to 96
         *  3 -> 58 to 64
         */
        int randrang = ran.nextInt(3)+1;
        switch (randrang){
            case 1:{
                password = password.concat(String.valueOf((char)(ran.nextInt(15)+33))) ;
                break;
            }
            case 2:{
                password = password.concat(String.valueOf((char)(ran.nextInt(6)+91))) ;
                break;
            }
            default :{
                password = password.concat(String.valueOf((char)(ran.nextInt(7)+58))) ;

            }
        }
        //Add number
            password = password.concat(String.valueOf((char)(ran.nextInt(10)+48))) ;
        //Add small letters for rest of the length
        while(password.length()<=len){
            password = password.concat(String.valueOf((char)(ran.nextInt(26)+97)));

        }
        e.password = password;
    }

    public void generateEmailAddress(Employee e) {
            e.email= e.firstName+e.lastName+"@"+e.department+"."+e.companyName+".com";
    }

    public void showCredentials(Employee e) {
        System.out.println("Dear "+e.firstName+" your generated credentials are as follows:");
        System.out.println("Email:"+ e.email);
        System.out.println("Email:"+ e.password);
    }
}