/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysexercise2;

import java.util.Scanner;

/**
 *
 * @author anaclaudiaproenca
 */
public class ArraysExercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name? ");
        
        String userName = sc.nextLine();
        char[] nameArray = userName.toCharArray();
        
        for (int i = nameArray.length-1 ; i>=0; i--) {
            System.out.println(nameArray[i]);
        }
    }
}
