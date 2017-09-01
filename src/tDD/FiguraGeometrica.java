/*
 * Implements the root of Definibila
 */
package tDD;

/**
 *
 * @author mihai
 */
public class FiguraGeometrica implements Definibila {
    
    private String definitie = "Geometric Figure ";
    
    @Override
    public String getDefinition() {
       return definitie;
    }
    
}
