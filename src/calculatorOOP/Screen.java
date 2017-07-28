package calculatorOOP;

public class Screen {
    
    private String ecran = "0";

    public String getEcran() {
        return ecran;
    }

    public void setEcran(String ecran) {
        this.ecran = ecran;
      // System.err.println(ecran);
    }
    
    public void clearScreen() {
        ecran = "0";
    }
}
