/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.speedconverter;

/**
 *
 * @author anaclaudiaproenca
 */
public class SpeedConverter {
    
    // write code here
    public static long toMilesPerHour(double kilometersPerHour)  {
        
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            return Math.round(kilometersPerHour / 1.609);
        }
            
    } // needs to return the rounded value of the calculation
    
    public static void printConversion(double kilometersPerHour) {
        
//        toMilesPerHour(1.5);
//        
//        toMilesPerHour(10.25);
//        
//        toMilesPerHour(-5.6);
//        
//        toMilesPerHour(25.42);
//        
//        toMilesPerHour(75.114);
        
        if (kilometersPerHour <0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
       
    }
}
