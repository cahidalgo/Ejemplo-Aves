/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasificacionaves;

/**
 *
 * @author Carlos
 */
public class Gallina extends Ave {
    public static final Logger logger=LoggerFactory.getLogger(Gallina.class);
    
    public Gallina(){
        logger.debug("instanciando una gallina");
        this.setTipoSonido(new Grasnido());
        this.setTipoVuelo(new VueloConAlas());
    }
}
