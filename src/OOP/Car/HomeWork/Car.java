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
 /**
 Constructors
 */
    public Car(){
        name = "Default car name";
        speed = 90;
    }
    public Car(String carName, short carSpeed, Color carColor, short priceCar){
        name = carName;
        speed = carSpeed;
        color = carColor;
        price = priceCar;
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
        price = priceCar;
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
       return(250);
    }
    
    public static void main(String[] args){
        short speedm = 120;
        short price = 5000;
        short speedTruck = 90;
        short priceTruck = 8000;
        //First Car Object with her price !
        Car mica = new Car("Mercedes",speedm,Color.BLACK, price);
        mica.setPrice(price);
        System.out.println("Car MICA = > getSalePrice is : " + mica.getSalePrice());
        //Second Car Object with her price !
        Car mare = new Car("Man",speedTruck,Color.RED, priceTruck);
        mare.setPrice(priceTruck);
        System.out.println("Car TRUCK = > getSalePrice is : " + mare.getSalePrice());
        // I used the Interface Saleable for unique price, for some objects !
   }
}
   
    

