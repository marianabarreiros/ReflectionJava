/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import abstractclass.Animal;
import java.lang.reflect.Field;
import concreteclasses.Goat;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 *
 * @author qt
 */
public class RunApp {
    public static void main(String[] args) throws ClassNotFoundException {
//        DESCOBRIR O NOME DE TODOS OS CAMPOS
        Object person = new Goat();
        Field[] field = person.getClass().getDeclaredFields();
        for(Field f: field){
            System.out.println(f.getName());
        }
        
//        PEGANDO O NOME DA CLASSE
        Object goat = new Goat();
        Class<?> clazz = goat.getClass();
//        pegando só o nome da classe
        System.out.println(clazz.getSimpleName());
//        pegando só o nome com o pacote na qual está inserida
        System.out.println(clazz.getName());
        
//        PEGANDO OS MODIFCADORES
        Class<?> goatClass = Class.forName("concreteclasses.Goat");
        int goatMod = goatClass.getModifiers();
        System.out.println(Modifier.isPublic(goatMod));
        System.out.println(Modifier.is);
       
        
        
    }
    
}
