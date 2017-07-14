/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.Car.HomeWork;

import java.util.List;



/**
 *
 * @author mihai
 */
public class Retailer {
    
    private List<BaseCarFactory> factories;

    public Retailer(List<BaseCarFactory> factories) {
        this.factories = factories;
    }
    
    public int placeOrder(List<Order> order){
        int sum = 0;
        for (Order Today : order) {
            int idx = factories.indexOf(Today.getFactory());
            
            if (idx != -1) {
                sum += factories.get(idx).getPrice(Today.getNumberCars());
                System.out.println("Cars : Ordering "
                        + Today.getNumberCars() 
                        + " Cars from " 
                        + factories.get(idx).getFactoryName() + " Factory ! " );
            }
        }
        return sum;
    }
}
