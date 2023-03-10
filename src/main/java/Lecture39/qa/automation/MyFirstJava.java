package Lecture39.qa.automation;

import java.util.Scanner;

public class MyFirstJava {
    public static void main(String[] args) {
        // writes the text in the console
        // System.out.println("Hello JAVA");
        System.out.println("Please enter your name!");

        //Scanner is class for reading values from the console
        Scanner scanner = new Scanner(System.in);

        //a string variable that will store the value entered from the user
        String firstName = scanner.next();

        //System.out.println("Your name is: " + firstName);

        System.out.println("Please enter your age!");

        //integer variable that will store the age entered from the user
        int userAge = scanner.nextInt();


        System.out.println("Your name is " + firstName +
                ",\nand you are " + userAge + " years old!");

        /*
        System.out.println("Your name is: " + firstName);
        System.out.println("Your age is: " + userAge);
         */

        if (userAge >= 18){
            System.out.println(firstName + " can buy alcohol legally!");
        }

        if (userAge < 18){
            System.out.println(firstName + " can`t buy alcohol legally!");
        }

        if (userAge >= 65){
            System.out.println(firstName + " is retired.");
        }

    }
}
