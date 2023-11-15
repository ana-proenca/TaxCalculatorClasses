/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taxcalculatorclasses;

/**
 *
 * @author anaclaudiaproenca
 */
public class TaxCalculator {
    public double calculatePRSI(double grossIncome) {
        return (grossIncome * 0.04);
    }
    
    public double calculatePAYE(double grossIncome) {
        
        if (grossIncome < 40000) {
            return (grossIncome * 0.20);
        } else {
            return ((40000 * 0.20) + ((grossIncome - 40000)* 0.40));
        }
    }
    
    public double calculateUSC(double grossIncome, double targetUsc, double tax){
        
        if(grossIncome < targetUsc){
            return (grossIncome * tax);
        }
        else{
            return targetUsc * tax;
        }
    }
    
    public double GetTaxUSC(double grossIncome){
        double taxUSC = 0;
        taxUSC += calculateUSC(grossIncome, 12012, 0.005);
        
        grossIncome -= 12012;
        
        taxUSC += calculateUSC(grossIncome, 10908, 0.02);
        
        grossIncome -= 10908;
        
        taxUSC += calculateUSC(grossIncome, 47198, 0.04);
        
        grossIncome -= 47198;
        
        if(grossIncome > 0){
             taxUSC += grossIncome * 0.08; 
        }
        
        return taxUSC;
    }
}
