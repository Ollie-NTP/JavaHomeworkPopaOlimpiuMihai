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
    public class Order {
        private BaseCarFactory factory;
        private int n;  
        private int sum;
                
        public Order(BaseCarFactory factory, int n) {
            this.factory = factory;
            this.n = n;
        }
    
        protected BaseCarFactory getFactory(){
            return factory;
        }
        
        protected int getNumberCars(){
            return n;
        }
        
        protected int getNumberCarsSold(int m){
            if (n > m){ 
                sum = n-m; 
            }
                return sum; 
        } 
    } 
