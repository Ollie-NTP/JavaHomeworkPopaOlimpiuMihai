package calculatorOOP;

public class Processor {
    
    private int operand1;
    private int operand2;
    private char operator;
    
    private int result = 0;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
    
    public int getOperand1() {
        return operand1;
    }

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public int getOperand2() {
        return operand2;
    }
    
    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }
    
    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }
    
    public void compute(){
          switch (operator){
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '/':
                result = operand1 / operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '%':
                result = operand1/100 * operand2;
            default:
                System.out.print("");
                break;    
        }          
        
    }

}
