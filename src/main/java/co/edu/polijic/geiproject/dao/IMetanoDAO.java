/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.polijic.geiproject.dao;

import co.edu.polijic.geiproject.entities.Metano;
import java.util.List;

/**
 *
 * @author daserna
 */
public interface IMetanoDAO {
    
    public void guardar(Metano metano);
    public List<Metano> listar();
}
