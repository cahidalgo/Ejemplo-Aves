/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasificacionaves;

import java.lang.System.Logger;

/**
 *
 * @author User
 */
public class Grasnido implements TipoSonido{
    
    public static final Logger logger=LoggerFactory.getLogger(Grasnido.class);
    public void makeSound(){
        logger.debug("grasnando");
        System.out.println("grasnando");
    }
}
