/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.Interface.Perfil;

import dto.Alumno;
import dto.Perfil;
import exception.BusinessException;
import java.util.List;
/**
 *
 * @author Dell
 */
public interface IPerfilService {
     public List<Perfil> listaDatosPerfil() throws BusinessException;
     public void modificarPerfil(Perfil per) throws BusinessException;
                public List<Alumno> alumnosInscritos() throws BusinessException;
                 public void insertarAlumnos(Alumno alu) throws  BusinessException;

}
