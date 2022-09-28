/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasificacionaves;

/**
 *
 * @author Andres Gomez
 */
public class Canto implements TipoSonido {
    public static final Logger logger = LoggerFactory.getlogger(Canto.class);
    public void makeSound(){
        logger.debug("estoy cantando");
        System.out.println("estoy cantando");
    }
}
