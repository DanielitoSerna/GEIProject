/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.polijic.geiproject.dao.impl;

import co.edu.polijic.geiproject.business.OxidoNitrosoBusiness;
import co.edu.polijic.geiproject.dao.IOxidoNitrosoDAO;
import co.edu.polijic.geiproject.entities.OxidoNitroso;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daserna
 */
public class OxidoNitrosoDAOImpl implements IOxidoNitrosoDAO{

    @Override
    public void guardar(OxidoNitroso oxidoNitroso) {
        List<OxidoNitroso> lista = OxidoNitrosoBusiness.getOxidoNitrosos();
        
        if (lista == null) {
            lista = new ArrayList<>();
            lista.add(oxidoNitroso);
            OxidoNitrosoBusiness.setOxidoNitrosos(lista);
        } else {
            lista.add(oxidoNitroso);
            OxidoNitrosoBusiness.setOxidoNitrosos(lista);
        }
    }

    @Override
    public List<OxidoNitroso> listar() {
        return OxidoNitrosoBusiness.getOxidoNitrosos();
    }
    
}
