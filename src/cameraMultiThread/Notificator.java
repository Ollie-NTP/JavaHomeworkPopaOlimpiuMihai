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
public class Notificator extends Thread {

    Personaj persoana;

    public Notificator(Personaj persoana) {
        super();
        this.persoana = persoana;
    }

    @Override
    public void run() {
        synchronized (persoana) {
            System.out.print("\n");
            System.out.println("[Scena II]");
            System.out.println("---------------------------------------------");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            persoana.setModeSleepOrNot(true);
            System.out.print("\n");
            System.out.println("Barbatul arunca o privire asupra TV-ului! ");

            persoana.notifyAll();
            System.out.print("\n");
            System.out.println("---------------------------------------------");
            System.out.println("ATENTIE ! Urmeaza emisiunea ta favorita!");
            System.out.println("---------------------------------------------");

            System.out.print("\n");
            System.out.println("Femeia se trezeste! ");

        }
    }
}
