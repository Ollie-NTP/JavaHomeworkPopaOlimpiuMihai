/*
 * OOP Computer !
 */
package com.CalculatorOOP;

/**
 *
 * @author Popa Olimpiu - Mihai
 */
public class Screen {
    String result = "0";
    float n1,n2;
    Button operator;
    
    public void displayResult(){
        System.out.print("**********************************\n");
        System.out.print("*Display* |");
        System.out.print(result);
        System.out.print("\n");
        System.out.print("**********************************\n");
    }
    
    public void compute(){
        
        switch (operator.getOP()){
            case '+':
                result = String.valueOf(n1 + n2);
                break;
            case '-':
                result = String.valueOf(n1 - n2);
                break;
            case '/':
                result = String.valueOf(n1 / n2 );
                break;
            case '*':
                result = String.valueOf(n1 * n2);
                break;
            default:
                System.out.print("");
                break;    
        }          
    }
  
    public void show(){
        System.out.print("**********************************\n");
        System.out.print("*Display* ");
        System.out.print(n1 + " " 
                + operator.getOP() + " " + n2 + " " 
                + "= " + result);
        System.out.print("\n");
        System.out.print("**********************************\n");
    }
    
    public void setN1(float n1){
        this.n1 = n1;
    }
    
    public void setN2(float n2){
        this.n2 = n2;
    }
    
    public boolean op(Button operator){   
        
         switch (operator.getOP()){
            case '+':
            case '-':
            case '/':
            case '*':
                this.operator = operator;
                return true;
            default:
                System.out.println("The operator is not valid!");
                return false;
        }
    }     
}
