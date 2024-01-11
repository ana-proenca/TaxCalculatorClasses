/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.score;

/**
 *
 * @author anaclaudiaproenca
 */
public class Score {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("The highScore is " + highScore);
//      calculateScore(true, 800, 5, 100);
        
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        
        System.out.println("The next highScore is " + 
                calculateScore(gameOver, score, levelCompleted, bonus));
//      calculateScore(true, 10000, 8, 200);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }
}
