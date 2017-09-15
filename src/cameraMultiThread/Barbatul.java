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
public class Barbatul implements Runnable {

    Personaj persoana;

    public Barbatul(Personaj persoana) {
        super();
        this.persoana = persoana;

    }

    @Override
    public void run() {
        synchronized (persoana) {

            System.out.println(Thread.currentThread().getName() + " da cu aspiratorul !");
            System.out.println("---------------------------------------------");
            try {
                Thread.sleep(500);
                persoana.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\n");
            System.out.println(Thread.currentThread().getName() + " face treaba in continuare cu aspiratorul!");
        }
    }
}
