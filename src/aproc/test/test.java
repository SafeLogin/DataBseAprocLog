/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aproc.test;

import aproc.crud.AprocLogCrud;
import aproc.crud.AprocLogMethods;
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
        // TODO code application logic here
        
       ArrayList<Uztuser> usuario = AprocLogMethods.ListUsuarios();
       System.out.print(usuario);
        
    }
    
}
