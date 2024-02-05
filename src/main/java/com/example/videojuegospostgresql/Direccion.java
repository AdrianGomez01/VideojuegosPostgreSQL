package com.example.videojuegospostgresql;

import jakarta.persistence.Embeddable;

@Embeddable
public class Direccion {
    private String calle;
    private String numero;
    private String cp;

    public Direccion() {
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

}
