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
        Screen screen = new Screen();
        while(true){
          calculator.pushButtons();
          System.err.println("-------------------------------------------");
          screen.clearScreen();
          System.out.println("Value Display: 0");
          System.out.println("-------------------------------------------");
          
        }
    }
}
