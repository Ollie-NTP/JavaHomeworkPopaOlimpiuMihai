/*
 * OOP Computer !
 */
package com.CalculatorOOP;

import java.util.Scanner;
/**
 *
 * @author Popa Olimpiu - Mihai
 */
public class RunPocketCalculator {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int n1,n2;
        Button operator;
        Scanner value = new Scanner(System.in);
        Screen scr = new Screen();
        
        //Value 0;
        scr.displayResult();
        
        while(true){
            
            //First Value
            System.out.print("Introduce first  number: ");
            n1 = value.nextInt();
        
                //Verify operator, if this it's an operator or another caracter
                do{
                System.out.print("Introduce the  operator: ");
                operator = new Button(value.next().charAt(0));
                } while (false == scr.op(operator));
        
            //Second Value
            System.out.print("Introduce second number: ");
            n2 = value.nextInt();
        
        scr.setN1(n1);
        scr.setN2(n2);
      
        scr.op(operator);
        scr.compute();
        
        scr.show();
        }
    } 
}
