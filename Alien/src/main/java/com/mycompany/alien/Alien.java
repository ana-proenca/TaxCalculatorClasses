/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.alien;

/**
 *
 * @author anaclaudiaproenca
 */
public class Alien {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!!");
        } else {
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 80");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true.");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is an error");
        }

        int ageOfClient = 20;
        String ageText = ageOfClient >= 18 ? "Over Eighteen" : "Still a kid";
        System.out.println("Our client is " + ageText);

        String makeOfCar = "Volkswagen";
        boolean isDomestic = (makeOfCar != "Volkswagen");

        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }
        
        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);
        
        
        
        double num1 = 20.00d;
        double num2 = 80.00d;
        System.out.println(num1 + num2);
        double total = (double)((num1 + num2) * 100.00d);
        double remainder = (double)(total % 40.00d);
        System.out.println(remainder);
        boolean isZero = (remainder == 0.00);
        System.out.println(isZero);
        
        if (!isZero) {
            System.out.println("Got some remainder");
        }
    }
}
