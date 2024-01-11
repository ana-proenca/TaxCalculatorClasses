/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayexercise1;

import java.util.Scanner;

/**
 *
 * @author anaclaudiaproenca
 */
public class ArrayExercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number do you want to enter? ");
        
        int size = sc.nextInt();
        int[] userNumbers = new int[size];
        
        System.out.println(userNumbers.length);
    }
    
}
