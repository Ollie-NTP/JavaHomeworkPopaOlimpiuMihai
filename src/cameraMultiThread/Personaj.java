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
public class Personaj {

    String name;
    boolean isSleeping;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSleeping() {
        return isSleeping;
    }

    public void setModeSleepOrNot(boolean isSleeping) {
        this.isSleeping = isSleeping;
    }

}
