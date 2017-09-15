/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cameraMultiThread;

/**
 *
 * @author mihai
 */
public class Trabucul implements Runnable {

    Personaj persoana;

    public Trabucul(Personaj persoana) {
        super();
        this.persoana = persoana;

    }

    @Override
    public void run() {
        synchronized (persoana) {

            System.out.println(Thread.currentThread().getName() + " arde in scrumiera ! ");
            System.out.println("---------------------------------------------");
            try {
                persoana.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\n");
            System.out.println(Thread.currentThread().getName() + " este fumat !");
        }
    }

}
