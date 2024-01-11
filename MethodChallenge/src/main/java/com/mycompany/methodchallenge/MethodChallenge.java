/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.methodchallenge;

/**
 *
 * @author anaclaudiaproenca
 */
public class MethodChallenge {

    public static void main(String[] args) {
        
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);
        
        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Bob", highScorePosition);
        
        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Mark", highScorePosition);
        
        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Rob", highScorePosition);
        
        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("Nick", highScorePosition);
    }
    
    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score list");
    }
    
    public static int calculateHighScorePosition(int playerScore) {
        
        int position = 4;
        if (playerScore >= 1000){
            position =  1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        } 
        
        return position;
    } 
}
