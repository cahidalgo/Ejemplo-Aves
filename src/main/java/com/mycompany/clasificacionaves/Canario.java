/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasificacionaves;

/**
 *
 * @author Andres Gomez
 */
public class Canario extends Ave{
    public static final Logger logger = LoggerFactory.getlogger(Canario.class);
    
    public Canario(){
        logger.debug("instanciando un canario");
        tipoSonido=new Canto();
        tipoVuelo=new VueloConAlas();
    }
}
