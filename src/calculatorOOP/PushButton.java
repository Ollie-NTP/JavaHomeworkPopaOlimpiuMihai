package calculatorOOP;

import java.util.Scanner;

public class PushButton {
    
    private char symbol;
    private String ac;

    public PushButton(char symbol){
        this.symbol = symbol;
    }
    
    public PushButton(String ac){
        this.ac = ac;
    }
    
    
    public char getSymbol() {
        return symbol;
    }
    
    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
}
