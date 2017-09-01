/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tDD;

/**
 *
 * @author mihai
 */
public class Triunghi extends TwoDimensions implements Definibila {
    private String definitie = super.getDefinition() + "having three sides and three angles.";
    
    @Override
    public String getDefinition() {
        return definitie;
    }
}
