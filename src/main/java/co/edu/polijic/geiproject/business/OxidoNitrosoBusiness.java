/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.polijic.geiproject.business;

import co.edu.polijic.geiproject.entities.OxidoNitroso;
import java.util.List;

/**
 *
 * @author daserna
 */
public class OxidoNitrosoBusiness {
    
    private static List<OxidoNitroso> oxidoNitrosos;

    public static List<OxidoNitroso> getOxidoNitrosos() {
        return oxidoNitrosos;
    }

    public static void setOxidoNitrosos(List<OxidoNitroso> oxidoNitrosos) {
        OxidoNitrosoBusiness.oxidoNitrosos = oxidoNitrosos;
    }
    
    
}
