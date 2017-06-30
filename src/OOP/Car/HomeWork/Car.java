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
        //First Car Object with her price !
        Car mica = new Car("Mercedes",speedm,Color.BLACK);
        mica.setPrice(price);
        //The price has been modify.
        //mica.setPrice(priceTruck);
        mica.setPriceForRent(priceRentCar);
        System.out.println("Masina mica - GetSalePrice is : " + mica.getSalePrice() + "$ ! and GetDailyRentPrice " + mica.getDailyRentPrice() + "$ !");
        //Second Car Object with her price !
        Car mare = new Car("Man",speedTruck,Color.RED);
        mare.setPrice(priceTruck);
        mare.setPriceForRent(priceRentTruck);
        System.out.println("Camion imens - GetSalePrice is : " + mare.getSalePrice() + "$ ! and GetDailyRentPrice " + mare.getDailyRentPrice() + "$ !");
        // I used the Interface Saleable for unique price, for some objects !
   }
}
   
    

