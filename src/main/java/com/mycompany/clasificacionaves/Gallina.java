/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasificacionaves;

/**
 *
 * @author Carlos
 */
public class Gallina extends Ave implements Volar{
    @Override
    public void makeSound(){
        System.out.println("Grasna");
    }
    public void vuelo(){
        System.out.println("vuela con alas");
    }
}
