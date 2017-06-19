/*
 * OOP Computer !
 */
package com.CalculatorOOP;

/**
 *
 * @author Popa Olimpiu - Mihai
 */
public class Button {
    
    private char operator;
    
    public Button(char operator){  
        this.operator = operator;
    }
                        // Hold value operator;
    public char getOP(){
        return operator;
    }
}
