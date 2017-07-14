/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.Car.HomeWork;

/**
 *
 * @author mihai
 */
public class BaseCarFactory {
    private Car car;
    private String factoryName;
    
    public BaseCarFactory(Car car, String name) {
        this.car = car;
        this.factoryName = name;
    }
    
    public int getPrice(int n) {
        return n * car.getSalePrice();
    } // N for number of cars.
    
    public String getFactoryName(){
        return factoryName;
    }
}
