/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taxcalculatorclasses;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author anaclaudiaproenca
 */
public class TaxCalculatorClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            Scanner sc = new Scanner(new FileReader("test/income.txt"));
            do  {
                Income incomeClass = new Income();
                double nextIncome = sc.nextDouble();
                incomeClass.setIncome(nextIncome);
                System.out.println(incomeClass.getIncome());
            } while (sc.hasNextDouble());
            
        } catch (IOException e) {
            System.out.println(e);
        }
        
    }
    
}
