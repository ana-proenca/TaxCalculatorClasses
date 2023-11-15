/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taxcalculatorclasses;

/**
 *
 * @author anaclaudiaproenca
 */
public class TaxCalculatorClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double grossIncome = 50000;
        TaxCalculator tc = new TaxCalculator();
        double taxPAYE = tc.calculatePAYE(grossIncome);
        double taxPRSI = tc.calculatePRSI(grossIncome);
        double taxUSC = tc.GetTaxUSC(grossIncome);
        
        double tax = taxPAYE + taxPRSI + taxUSC;
       
        System.out.println("Your tax is: " + tax);
    }
    
}
