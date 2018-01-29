package co.Anonimus;
/**
 * @author PopaOlimpiuMihai
 */

public class HelloWorldAnonymousClasses {
    // Inner interface HelloWorld
    interface HelloWorld {
        public void greet();
        public void greetSomeone(String someone);
    }
 // Method sayHello prints
    public void sayHello() {
 // Local class EnglishGreetings implemented in the method sayHello()
    class EnglishGreeting implements HelloWorld {
        String name = "world";
        
        @Override
        public void greet() {
            greetSomeone("world");
        }
        
        @Override
        public void greetSomeone(String someone) {
            name = someone;
            System.out.println("Hello " + name);
        }
    } // end of EnglishGreeting local class
// create an EnglishGreeting object/instance
    HelloWorld englishGreeting = new EnglishGreeting();
     
// inner class French language
 
    class FrenchGreeting implements HelloWorld {
        String name = "tout le monde";
        
        @Override
        public void greet() {
            greetSomeone("tout le monde");
            }

        @Override
        public void greetSomeone(String someone) {
            name = someone;
            System.out.println("Salut " + name);
        }    
    }
    
    HelloWorld frenchGreeting = new FrenchGreeting(); // end of inner class
  
// inner class French language      
        
// create an anonimous class for Spanish language
     HelloWorld spanishGreeting = new HelloWorld() {
       String name = "mundo"; 
       
       @Override
        public void greet() {
            greetSomeone("mundo");
        }
         
        @Override
        public void greetSomeone(String someone) {
            name = someone;
            System.out.println("Hola, " + name);
        } // end of inner class
    };
     
// inner class Spanish language    
    englishGreeting.greet();
    frenchGreeting.greetSomeone("Fred");
    spanishGreeting.greet();
 }
    
 // main method
    
public static void main(String[] args) {
        HelloWorldAnonymousClasses myApp = new HelloWorldAnonymousClasses();
        myApp.sayHello();
    }
}
