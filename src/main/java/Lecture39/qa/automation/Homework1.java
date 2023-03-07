package Lecture39.qa.automation;

import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {

        //Ask user to write his first name
        System.out.println("Please enter your first name!");

        //Take user First name
        Scanner userNameFirst = new Scanner(System.in);

        String userFirstName = userNameFirst.next();

        //Ask user to write his last name
        System.out.println("Please enter your last name!");

        //Take user Last name
        Scanner userNameLast = new Scanner(System.in);

        String userLastName = userNameLast.next();


        //Ask user to write his favourite hobby
        System.out.println("So...,Dear " + userFirstName + " " +
                userLastName + ", what is your favourite hobby?");

        //Take user hobby

        Scanner hobby = new Scanner(System.in);
        String userHobby =  hobby.nextLine();


        System.out.println("Thanks for sharing with me!");
        System.out.println("I will save in my database that...");
        System.out.println("... " + userFirstName + " " + userLastName +
                " favourite hobby is " + userHobby + "!");
    }
}

