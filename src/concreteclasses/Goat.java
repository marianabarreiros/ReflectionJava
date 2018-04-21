/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concreteclasses;

import abstractclass.Animal;
import interfaces.Locomotion;

/**
 *
 * @author qt
 */
public class Goat extends Animal implements Locomotion {
    private String um;
    private String dois;
    
    public Goat(){
 
    }
    
    @Override
    protected String getSound() {
        return "bleat";
    }
 
    @Override
    public String getLocomotion() {
        return "walks";
    }
 
    @Override
    public String eats() {
        return "grass";
    }
 
    // constructor omitted
}
