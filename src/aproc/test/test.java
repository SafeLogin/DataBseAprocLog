/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aproc.test;

import aproc.crud.AprocLogCrud;
import aproc.crud.AprocLogMethods;
import aproc.map.Uztrol;
import aproc.map.Uztuser;
import java.util.ArrayList;

/**
 *
 * @author Ivan
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //**************USUARIOS************************************//
        
       //ArrayList<Uztuser> usuario = AprocLogMethods.ListUsuarios();
      // System.out.println(usuario);
        //Uztuser usuario=AprocLogMethods.GetUsuariosById("L00037548");
        //ArrayList<Uztuser> usuario = AprocLogMethods.GetUsuariosByEstado('A');
        //ArrayList<Uztuser> usuario = AprocLogMethods.GetUsuariosByCargo("Especialista Técnico");
       //ArrayList<Uztuser> usuario = AprocLogMethods.GetUsuariosByCampus("03");        
       // System.out.println(usuario);
        
        
          //**************ROLES************************************//
        
        ArrayList<Uztrol> rolesEstado = AprocLogMethods.GetRolesByEstado('D');
        System.out.println(rolesEstado);
        
        //**************ROLES USUARIO************************************//
    }
    
}
