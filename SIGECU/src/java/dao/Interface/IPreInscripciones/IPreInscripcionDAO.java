/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.Interface.IPreInscripciones;

import dto.Evento;
import dto.identiPreIns;
import dto.preInscripcion;
import exception.BusinessException;
import java.util.List;

/**
 *
 * @author Anel
 */
public interface IPreInscripcionDAO {
    public List<identiPreIns> consultaPreIns() throws BusinessException;
    public boolean nuevaPreInscripcion(preInscripcion preIn) throws BusinessException;
    
}