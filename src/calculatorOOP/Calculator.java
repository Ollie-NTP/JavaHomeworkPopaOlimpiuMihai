package calculatorOOP;

import java.util.Scanner;

public class Calculator {
    
    private Screen ecran = new Screen();
    
    private PushButton button0 = new PushButton('0');

    private PushButton button1 = new PushButton('1');
    
    private PushButton button2 = new PushButton('2');
    
    private PushButton button3 = new PushButton('3');
    
    private PushButton button4 = new PushButton('4');
    
    private PushButton button5 = new PushButton('5');
    
    private PushButton button6 = new PushButton('6');
    
    private PushButton button7 = new PushButton('7');
    
    private PushButton button8 = new PushButton('9');
    
    private PushButton button9 = new PushButton("AC");
    
    private PushButton button10 = new PushButton('%');
    
    private Processor processor = new Processor();

    public PushButton getButton3() {
        return button3;
    }

    public void setButton3(PushButton button3) {
        this.button3 = button3;
    }

    public PushButton getButton4() {
        return button4;
    }

    public void setButton4(PushButton button4) {
        this.button4 = button4;
    }

    public PushButton getButton5() {
        return button5;
    }

    public void setButton5(PushButton button5) {
        this.button5 = button5;
    }

    public PushButton getButton6() {
        return button6;
    }

    public void setButton6(PushButton button6) {
        this.button6 = button6;
    }

    public PushButton getButton7() {
        return button7;
    }

    public void setButton7(PushButton button7) {
        this.button7 = button7;
    }

    public PushButton getButton8() {
        return button8;
    }

    public void setButton8(PushButton button8) {
        this.button8 = button8;
    }

    public PushButton getButton9() {
        return button9;
    }

    public void setButton9(PushButton button9) {
        this.button9 = button9;
    }

    public PushButton getButton10() {
        return button10;
    }

    public void setButton10(PushButton button10) {
        this.button10 = button10;
    }

    
    public PushButton getButton2() {
        return button2;
    }

    public void setButton2(PushButton button2) {
        this.button2 = button2;
    }

    public PushButton getButton1() {
        return button1;
    }

    public void setButton1(PushButton button1) {
        this.button1 = button1;
    }

    public PushButton getButton0() {
        return button0;
    }

    public void setButton0(PushButton button0) {
        this.button0 = button0;
    }


    public Screen getEcran() {
        return ecran;
    }

    public void setEcran(Screen ecran) {
        this.ecran = ecran;
    }
    
    /**
     *
     */
    public void pushButtons(){
        System.out.print("Please introduce fist number: ");
        Scanner scanner = new Scanner(System.in);
        int operand1 = scanner.nextInt();
        processor.setOperand1(operand1);
        Integer iOperand1 = operand1;
        String s = iOperand1.toString();
        ecran.setEcran(s);
        
        
        System.out.print("Please introduse operator: ");
        Scanner scanner1 = new Scanner(System.in);
        String stringOperator = scanner1.nextLine();
        char operation = stringOperator.charAt(0);
        processor.setOperator(operation);
        ecran.setEcran(stringOperator);
        
        System.out.print("Please introduce second number: ");
        Scanner scanner2 = new Scanner(System.in);
        int operand2 = scanner2.nextInt();
        processor.setOperand2(operand2);
        Integer iOperand2 = operand2;
        String s1 = iOperand2.toString();
        ecran.setEcran(s1);
        
        processor.compute();
        ecran.setEcran(Integer.toString(processor.getResult()));
        System.out.println("Please introduce =  " + processor.getResult());
    }  
}
