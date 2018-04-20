/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass;

import interfaces.Eating;

/**
 *
 * @author qt
 */
public abstract class Animal implements Eating {

    public static String CATEGORY = "domestic";
    private String name;

    protected abstract String getSound();
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
