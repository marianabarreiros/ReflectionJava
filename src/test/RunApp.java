/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import abstractclass.Animal;
import java.lang.reflect.Field;
import concreteclasses.Goat;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
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
        Class<?> eatingClass = Class.forName("interfaces.Eating");
        Class<?> animalClass = Class.forName("abstractclass.Animal");
        int goatMod = goatClass.getModifiers();
        int eatingMod = eatingClass.getModifiers();
        int animalMod = eatingClass.getModifiers();
        System.out.println(Modifier.isPublic(goatMod));
        System.out.println(Modifier.isPublic(eatingMod));
        System.out.println(Modifier.isPublic(animalMod));
        System.out.println(Modifier.isAbstract(animalMod));
       
//        PEGANDO OS PACOTES
        Object goat2 = new Goat();
        Class<?> clazz2 = goat.getClass();
        Package pck = clazz2.getPackage();
        System.out.println(pck.getName());
        
//        PEGANDO OS SUPERCLASSE
        System.out.println(clazz2.getSuperclass().getSimpleName());
        
//        PEGANDO OS CONSTRUTORES
        Constructor<?>[] constructors = clazz2.getConstructors();
        for(Constructor c : constructors){
            System.out.println(c.getName());
        }
        
        Method[] methods = clazz2.getDeclaredMethods();
        for(Method m : methods){
            System.out.println(m.getName());
        }
    }
    
}
