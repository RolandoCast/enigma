/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.Interface.Iperfil;

import dto.Alumno;
import dto.Perfil;
import exception.BusinessException;
import java.util.List;
/**
 *
 * @author JorgeLuna
 */
public interface IPerfilDAO {
    public List<Perfil> listaDatosPerfil() throws BusinessException;
     public void modificarPerfil(Perfil per) throws BusinessException;
          public List<Alumno> alumnosInscritos() throws BusinessException;
          public void insertarAlumnos(Alumno alu) throws  BusinessException;

}
