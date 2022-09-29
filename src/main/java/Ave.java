/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pipel
 */
public abstract class Ave {
   
    TipoSonido tipoSonido;
    TipoVuelo tipoVuelo;
    
    public void realizaVuelo(){
        tipoVuelo.vuelo();
    }
    
    public void realizaSonido(){
        tipoSonido.makeSound();
    }
}
