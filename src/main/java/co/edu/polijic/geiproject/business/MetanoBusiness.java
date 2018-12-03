/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.polijic.geiproject.business;

import co.edu.polijic.geiproject.entities.Metano;
import java.util.List;

/**
 *
 * @author daserna
 */
public class MetanoBusiness {
 
    private static List<Metano> metanos;

    public static List<Metano> getMetanos() {
        return metanos;
    }

    public static void setMetanos(List<Metano> metanos) {
        MetanoBusiness.metanos = metanos;
    }
    
    
}
