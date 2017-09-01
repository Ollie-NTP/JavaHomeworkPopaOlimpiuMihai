/*
 * Main, Create more shapes and display the definitions.
 */
package tDD;

/**
 *
 * @author mihai
 */
public class DisplayShapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Triunghi corp = new Triunghi();
       System.out.println("Definition of Triangle: " + corp.getDefinition());
       Patrat sqr = new Patrat();
       System.out.println("Definition of Square: " + sqr.getDefinition());
               
    }
    
}
