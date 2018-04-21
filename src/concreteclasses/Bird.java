/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concreteclasses;

import abstractclass.Animal;

/**
 *
 * @author Win-7
 */
public class Bird extends Animal{
    private boolean walks;
    private String name;

    public void setWalks(boolean walks) {
        this.walks = walks;
    }
 
    public Bird(String name, boolean walks) {
        this.name = name;
        setWalks(walks);
    }
 
    public Bird(String name) {
        this.name = name;
    }
 
    public boolean walks() {
        return walks;
    }

    @Override
    protected String getSound() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String eats() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
