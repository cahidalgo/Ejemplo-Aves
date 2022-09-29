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
    private TipoVuelo tipoVuelo;

    public TipoSonido getTipoSonido() {
        return tipoSonido;
    }

    public void setTipoSonido(TipoSonido tipoSonido) {
        this.tipoSonido = tipoSonido;
    }

    public TipoVuelo getTipoVuelo() {
        return tipoVuelo;
    }

    public void setTipoVuelo(TipoVuelo tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }

    /**
     *
     */
    public void realizaVuelo() {
        tipoVuelo.vuelo();
    }

    public void realizaSonido() {
        tipoSonido.makeSound();
    }
}
