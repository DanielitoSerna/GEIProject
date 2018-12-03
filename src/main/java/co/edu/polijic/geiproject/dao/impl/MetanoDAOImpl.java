/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.polijic.geiproject.dao.impl;

import co.edu.polijic.geiproject.business.MetanoBusiness;
import co.edu.polijic.geiproject.dao.IMetanoDAO;
import co.edu.polijic.geiproject.entities.Metano;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daserna
 */
public class MetanoDAOImpl implements IMetanoDAO{

    @Override
    public void guardar(Metano metano) {
        List<Metano> lista = MetanoBusiness.getMetanos();
        if (lista == null){
            lista = new ArrayList<>();
            lista.add(metano);
            MetanoBusiness.setMetanos(lista);
        } else {
            lista.add(metano);
            MetanoBusiness.setMetanos(lista);
        }
    }

    @Override
    public List<Metano> listar() {
        return MetanoBusiness.getMetanos();
    }
    
}
