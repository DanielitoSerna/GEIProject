/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.polijic.geiproject.entities;

import java.util.Objects;

/**
 *
 * @author daserna
 */
public class Metano {
    
    private Double resultado;
    private Double poblacion;

    public Metano() {
    }

    public Metano(Double resultado, Double poblacion) {
        this.resultado = resultado;
        this.poblacion = poblacion;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }

    public Double getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(Double poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Metano other = (Metano) obj;
        if (!Objects.equals(this.resultado, other.resultado)) {
            return false;
        }
        if (!Objects.equals(this.poblacion, other.poblacion)) {
            return false;
        }
        return true;
    }
    
    
}
