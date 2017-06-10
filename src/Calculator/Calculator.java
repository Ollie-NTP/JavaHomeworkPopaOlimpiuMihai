/*
 *Acesta este un Simplu Calculator / Trebuie tratat ca atere. (Part. II)
 *This is a Simple Computer / Should be treated as such. (Part. II)
 */
package Calculator;

import java.util.*;
import java.util.Scanner;

/**
 * @author Popa Olimpiu Mihai
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduceti doua numere: ");
        Scanner value = new Scanner(System.in);
        int numar1,numar2;
        numar1 = value.nextInt();
        numar2 = value.nextInt();
        int raspuns;
        System.out.println("1 pentru Adunare, 2 pentru Scadere, 3 pentru Inmultire si 4 pentru Impartire:");
        int alege;
        
        alege = value.nextInt();
        switch (alege){
        case 1:
            System.out.println(add(numar1,numar2));
            break;
        case 2:
            System.out.println(sub(numar1,numar2));
            break;      
        case 3:
            System.out.println(mult(numar1,numar2));
            break;
        case 4:
            System.out.println(div(numar1,numar2));
            break;
            default:
                System.out.println("Defect! :D");
        }
    }
    public static int add(int x, int y)
    {
        int rezultat = x + y;
        return rezultat;
    }
    public static int sub(int x, int y)
    {
        int rezultat = x-y;
        return rezultat;
    }
    public static int mult(int x, int y)
    {
        int rezultat = x*y;
        return rezultat;
    }
    public static int div(int x, int y)
    {
        int rezultat = x/y;
        return rezultat;
    }  
}

