/*
 * Operating calc.
 */
package calculatorOOP;

public class User {
   
    private static Calculator calculator = new Calculator();
    
    public static Calculator getCalculator(){
        return calculator;
    }
    
    public static void setCalculator(Calculator calculator){
        User.calculator = calculator;
    }
    public static void main(String[] args) {
        while(true){
          calculator.pushButtons();
          System.err.println("-------------------------------------------");
        }
    }
}
