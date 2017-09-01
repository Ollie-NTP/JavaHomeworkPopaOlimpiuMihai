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
public class Patrat extends Patrulater implements Definibila {
    
    private String definitie = super.getDefinition() + "with four straight sides. "
        + "In this case with four equal straight sides and four right angles.";
    
    @Override
    public String getDefinition() {
       return definitie;
    }
}
