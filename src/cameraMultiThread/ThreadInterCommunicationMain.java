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
public class ThreadInterCommunicationMain {

    public static void main(String args[]) {

        System.out.println("[Scena I]");
        System.out.println("---------------------------------------------");
        // Personaj personaj pe care se va apela metoda de așteptare și notificare
        Personaj personaj = new Personaj();
        Femeia femeia = new Femeia(personaj);
        Barbatul barbat = new Barbatul(personaj);
        Trabucul tigara = new Trabucul(personaj);
        Televizor tv = new Televizor(personaj);

        // Femeia threads which will wait for completion of book
        Thread FemeiaThread = new Thread(femeia, "Femeia");
        Thread BarbatulThread = new Thread(barbat, "Barbatul");
        Thread TrabuculThread = new Thread(tigara, "Trabuc Cubanez");
        Thread TvThread = new Thread(tv, "Televizor");

        FemeiaThread.start();
        BarbatulThread.start();
        TrabuculThread.start();
        TvThread.start();

        // Asigura că toate personajele au început să astepte...sunt in actiune!
        try {
            Thread.sleep(3000);
            System.out.println("| State -> Femeie " + FemeiaThread.getState() + "\n"
                    + "| State -> Barbat " + BarbatulThread.getState() + "\n"
                    + "| State -> Trabuc " + TrabuculThread.getState() + "\n"
                    + "| State -> Tv " + TvThread.getState());
            System.out.println("---------------------------------------------");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        // Mesaj de notificator care va notifica o dată terminarea actiunilor
        Notificator notif = new Notificator(personaj);
        notif.start();

        try {
            Thread.sleep(3000);
            System.out.println("---------------------------------------------");
            System.out.println("| State -> Femeie " + FemeiaThread.getState() + "\n"
                    + "| State -> Barbat " + BarbatulThread.getState() + "\n"
                    + "| State -> Trabuc " + TrabuculThread.getState() + "\n"
                    + "| State -> Tv " + TvThread.getState());
            System.out.println("---------------------------------------------");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

    }

}
