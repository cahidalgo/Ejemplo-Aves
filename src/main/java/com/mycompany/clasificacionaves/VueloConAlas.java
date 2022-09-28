/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasificacionaves;

/**
 *
 * @author Andres Gomez
 */
public class VueloConAlas implements TipoVuelo {
    public static final Logger logger = LoggerFactory.getlogger(VueloConAlas.class);
    public void vuelo(){
        logger.debug("Esta volando, aleteando");
        System.out.println("Esta volando, aleteando");
    }
}
