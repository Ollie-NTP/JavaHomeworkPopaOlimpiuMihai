/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.Car.HomeWork;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mihai
 */
public class Car implements Saleable, Rentable{
 /**
 @enum enumeration of accepted car colors
 */
    public enum Color { WHITE, RED, YELLOW, GREEN, GRAY, BLACK };
 /**
 Internal hidden fields / attributes
 */
    private Color color;
    private String name;
    private short speed;
    private short price;
    private short priceRent;
 /**
 Constructors
 */
    public Car(){
        name = "Default car name";
        speed = 90;
    }
    public Car(String carName, short carSpeed, Color carColor){
        name = carName;
        speed = carSpeed;
        color = carColor;
    }
 /*get-ers and set-ers*/
    public String getName(){
        return(name);
    }
    public Color getColor(){
        return(color);
    }
    public short getSpeed(){
        return(speed);
    }
    public void setName(String newName){
    name = newName;
    }
    
    public void setColor(Color newColor){
        color = newColor;
    }
    public void setSpeed(short newSpeed){
        speed = newSpeed;
    }
    
    public void setPrice(short priceCar){
        if( priceCar > price){
              price = priceCar;
        }
        else if( priceCar < price){    
              decresePrice(priceCar);
        }
    }
    
    public void decresePrice(short priceCar){
          if( priceCar < price){
              price = priceCar;
        }
        else if( priceCar < price){    
             setPrice(priceCar);
        }
    }
    
    public void setPriceForRent(short priceRentCar){
        priceRent = priceRentCar;
    }
 /**
 The method increase actual speed of Car until final speed specified.
 * @param newSpeed is new speed
 */
    public void increaseSpeed(short newSpeed){
         if(newSpeed > speed){
          speed = newSpeed;
         }
    else if (newSpeed < speed){
          decreaseSpeed(newSpeed);
         }
    }
 /**
 The method decrease actual speed of Car until final speed specified.
 * @param newSpeed is new speed
 */
    public void decreaseSpeed(short newSpeed){
        if(newSpeed < speed){
        speed = newSpeed;
        }
    else if (newSpeed < speed){
        increaseSpeed(newSpeed);
        }
     }
 /**
 Abstract method defined in Saleable interface implemented by class car
 * is implemented here.
 * @override Saleable.getSalePrice() method
 */
 @Override
    public int getSalePrice(){
        return(price);
    }
 /**
 Abstract method defined in Rentable interface implemented by class car
 * is implemented here.
 * @override Rentable.getDailyRentPrice() method
 */
 @Override
    public int getDailyRentPrice(){
       return(priceRent);
    }
    
    public static void main(String[] args){
 
        short speedm = 120;
        short price = 5000;
        short speedTruck = 90;
        short priceTruck = 8000;
        short priceRentCar = 100;
        short priceRentTruck = 559;
        
        // First Factoy ! Mercedes, I want 5 cars !
        System.out.println("*************************************************");
        
        Car C = new Car("Mercedes",speedm,Color.BLACK);
            C.setPrice(price);
            C.setPriceForRent(priceRentCar);
            
        System.out.println("Mercedes C Classe -> GetSalePrice is : " 
            + C.getSalePrice() + "$ !\nMercedes C Classe -> GetDailyRentPrice " 
            + C.getDailyRentPrice() + "$ !");
            
        BaseCarFactory MercedesFactoryClass  = new BaseCarFactory(C, "|Mercedes|");
        
        List<BaseCarFactory> factories =  new ArrayList<>();
            factories.add(MercedesFactoryClass);
            
        Order comandType = new Order(MercedesFactoryClass, 5);
        
        List<Order> comenzi =  new ArrayList<>();
            comenzi.add(comandType);
            
        Retailer retailerGuy = new Retailer(factories);
        
        int costTotal = retailerGuy.placeOrder(comenzi);
        System.out.println("*************************************************");
        System.out.println("Total cost production for " 
                + comandType.getNumberCars()  
                + " cars is : " + costTotal + "$");
        System.out.println("Existent stock is: " + comandType.getNumberCarsAvailabe(2));
        System.out.println("*************************************************");
        System.out.println("\n");
        System.out.println("*************************************************");
        
        //Second Truck
        Car evo = new Car("Man",speedTruck,Color.RED);
            evo.setPrice(priceTruck);
            evo.setPriceForRent(priceRentTruck);
            
        System.out.println("Man Evo -> GetSalePrice is : " 
                + evo.getSalePrice() + "$ !\nMan Evo -> GetDailyRentPrice " 
                + evo.getDailyRentPrice() + "$ !");
        
        BaseCarFactory ManFactory = new BaseCarFactory(evo, "|Man|");
        
        List<BaseCarFactory> factories1 =  new ArrayList<>();
            factories1.add(ManFactory);
            Order comandType1 = new Order(ManFactory, 10);
            comenzi.add(comandType1);
            Retailer retailerGuy1 = new Retailer(factories1);
        
        int costTotal1 = retailerGuy1.placeOrder(comenzi);
        System.out.println("*************************************************");
        System.out.println("Total cost production for " 
                + comandType1.getNumberCars()  
                + " cars is : " + costTotal1 + "$");
        System.out.println("Existent stock is: " + comandType1.getNumberCarsAvailabe(8));
        System.out.println("*************************************************");
       
            
        
        // I used the Interface Saleable for unique price, for some objects !
        
   }
}
   
    

