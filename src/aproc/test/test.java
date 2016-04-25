/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aproc.test;

import aproc.crud.AprocLogCrud;
import aproc.crud.AprocLogMethods;
import aproc.map.Uztproc;
import aproc.map.Uztrol;
import aproc.map.Uztsist;
import aproc.map.Uztuser;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.sql.Clob;
import java.sql.SQLException;

/**
 *
 * @author Ivan
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        //Clob a= null;
        //**************USUARIOS************************************//
        
       //ArrayList<Uztuser> usuario = AprocLogMethods.ListUsuarios();
      // System.out.println(usuario);
        //Uztuser usuario=AprocLogMethods.GetUsuariosById("L00037548");
        //ArrayList<Uztuser> usuario = AprocLogMethods.GetUsuariosByEstado('A');
        //ArrayList<Uztuser> usuario = AprocLogMethods.GetUsuariosByCargo("Especialista Técnico");
       //ArrayList<Uztuser> usuario = AprocLogMethods.GetUsuariosByCampus("03");        
       // System.out.println(usuario);
        
        
          //**************ROLES************************************//
        
     //   ArrayList<Uztrol> roles = AprocLogMethods.ListRoles();
       // System.out.println(roles);
      //  Uztrol roles= AprocLogMethods.GetRolById(new BigDecimal(7));
        //System.out.println(roles);
        
        //**************ROLES USUARIO************************************//
        
        
         //**************SISTEMAS************************************//
        
//        ArrayList<Uztsist> sistemas = AprocLogMethods.ListSistemas();
//        System.out.println(sistemas);
//          Uztsist sistemas = AprocLogMethods.GetSistemaById(new BigDecimal(2));
//           System.out.println(sistemas);
//         ArrayList<Uztsist> sistemas = AprocLogMethods.GetSistemasByEstado('A');
//         System.out.println(sistemas);
        
        //**************SISTEMAS************************************//
        
//        ArrayList<Uztsist> sistemas = AprocLogMethods.GetSistemasByEstado('A');
//        System.out.println(sistemas);
        
        //**************PROCEDIMIENTOS************************************//
        
//        ArrayList<Uztproc> procedi = AprocLogMethods.ListProcedimientos();
//        System.out.println(procedi);
        
//        System.out.println(AprocLogMethods.Prueba());
        
        //**************PROCEDIMIENTOS************************************//
        
        AprocLogMethods met= new AprocLogMethods();
        ArrayList<Uztuser> usuarios = met.ListUsuarios();
        System.out.println(usuarios.get(0).getUztuserNombres());
        Uztuser usuario = new Uztuser();
        BigDecimal num;
        num = BigDecimal.valueOf(11113);
        
        usuario.setUztuserPidm(num);
        usuario.setUztuserId("L00347715");
        usuario.setUztuserCargo("Estudiante");
        usuario.setUztuserEstado('A');
        usuario.setUztuserNombres("Elvis Sarchi");
        usuario.setUztuserCampus("01");
        System.out.println(met.InsertarUsuario(usuario));
        System.out.println("");
        
    }
    
}
