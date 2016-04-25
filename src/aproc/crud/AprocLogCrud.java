
package aproc.crud;
import aproc.map.*;
import aproc.util.*;
import com.dao.DAOServices;
import com.dao.QueryParameter;
import com.logger.L;
import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import oracle.sql.CLOB;


public class AprocLogCrud implements java.io.Serializable{
    
    public final static L log = new L(AprocLogCrud.class);
    /// METODO QUE DEVUELVE UNA LISTA DE TODOS LOS USUARIOS
    public static ArrayList<Uztuser> listUsuarios() {
        ArrayList<Uztuser> listUsuarios = null;
        DAOServices ds = new DAOServices(AprocLogHibernateUtil.
                getSessionFactory().getCurrentSession());
        List parameList = new ArrayList();
        List<Uztuser> list = ds.customQuery(parameList, Uztuser.class);
        try {
            if (!list.isEmpty()) {
                listUsuarios = (ArrayList<Uztuser>) list;
            }
        } catch (Exception ex) {
            log.level.info("ERROR  LIST USUARIOS : " + ex.toString());
        }
        return listUsuarios;
    }
    //////////////////////////////////////////////////////////
    
    /// BUSQUEDA DE USUARIOS POR ID
    public static Uztuser findUsuarioByIdUsuario(String uztuserId) {
        Uztuser listUsuario = null;
        DAOServices ds = new DAOServices(AprocLogHibernateUtil.
                getSessionFactory().getCurrentSession());
        QueryParameter query_1 = new QueryParameter(QueryParameter.$TYPE_WHERE);
        ///////
        query_1.setColumnName("uztuserId");
        query_1.setWhereClause("=");
        query_1.setValue(uztuserId);
        
        List parameList = new ArrayList();
        parameList.add(query_1);
        List<Uztuser> list = ds.customQuery(parameList, Uztuser.class);
        try {
            if (!list.isEmpty()) {
                listUsuario = (Uztuser) list.get(0);
            }
        } catch (Exception ex) {
            log.level.info("ERROR  LISTUSUARIO : " + ex.toString());
        }
        return listUsuario;
    }
    
    
    /////BUSQUEDA DE USUARIOS POR ESTADO
    public static ArrayList<Uztuser> listUsuariosByEstado(Character uztuserEstado) {
        ArrayList<Uztuser> listUsuarios = null;
        DAOServices ds = new DAOServices(AprocLogHibernateUtil.
                getSessionFactory().getCurrentSession());
        QueryParameter query_1 = new QueryParameter(QueryParameter.$TYPE_WHERE);
        query_1.setColumnName("uztuserEstado");
        query_1.setWhereClause("=");
        query_1.setValue(uztuserEstado);
        List parameList = new ArrayList();
        parameList.add(query_1);
        List<Uztuser> list = ds.customQuery(parameList, Uztuser.class);
        try {
            if (!list.isEmpty()) {
                listUsuarios = (ArrayList<Uztuser>) list;
            }
        } catch (Exception ex) {
            log.level.info("ERROR LISTA USUARIOS POR ESTADO: " + ex.toString());
        }
        return listUsuarios;
    }
    /////////////////////////////////////////////////////////////////////////
    //BUSQUEDA DE USUARIOS POR EL CARGO 
     public static ArrayList<Uztuser> listUsuariosByCargo(String uztuserCargo) {
        ArrayList<Uztuser> listUsuarios = null;
        DAOServices ds = new DAOServices(AprocLogHibernateUtil.
                getSessionFactory().getCurrentSession());
        QueryParameter query_1 = new QueryParameter(QueryParameter.$TYPE_WHERE);
        query_1.setColumnName("uztuserCargo");
        query_1.setWhereClause("=");
        query_1.setValue(uztuserCargo);
        List parameList = new ArrayList();
        parameList.add(query_1);
        List<Uztuser> list = ds.customQuery(parameList, Uztuser.class);
        try {
            if (!list.isEmpty()) {
                listUsuarios = (ArrayList<Uztuser>) list;
            }
        } catch (Exception ex) {
            log.level.info("ERROR LISTA USUARIOS POR CARGO: " + ex.toString());
        }
        return listUsuarios;
    }
    /////////////////////////////////////////////////////////////////////////
    //BUSQUEDA DE USUARIOS POR EL CAMPUS 
     public static ArrayList<Uztuser> listUsuariosByCampus(String uztuserCampus) {
        ArrayList<Uztuser> listUsuarios = null;
        DAOServices ds = new DAOServices(AprocLogHibernateUtil.
                getSessionFactory().getCurrentSession());
        QueryParameter query_1 = new QueryParameter(QueryParameter.$TYPE_WHERE);
        query_1.setColumnName("uztuserCampus");
        query_1.setWhereClause("=");
        query_1.setValue(uztuserCampus);
        List parameList = new ArrayList();
        parameList.add(query_1);
        List<Uztuser> list = ds.customQuery(parameList, Uztuser.class);
        try {
            if (!list.isEmpty()) {
                listUsuarios = (ArrayList<Uztuser>) list;
            }
        } catch (Exception ex) {
            log.level.info("ERROR LISTA USUARIOS POR CAMPUS: " + ex.toString());
        }
        return listUsuarios;
    }
     
     
     
     /////ROLES
     ////////////////////////
     //BUSQUEDA DE ROL POR ESTADO

      public static ArrayList<Uztrol> listRolesByEstado(Character uztrolEstado) {
        ArrayList<Uztrol> listRoles = null;
        DAOServices ds = new DAOServices(AprocLogHibernateUtil.
                getSessionFactory().getCurrentSession());
        QueryParameter query_1 = new QueryParameter(QueryParameter.$TYPE_WHERE);
        query_1.setColumnName("uztrolEstado");
        query_1.setWhereClause("=");
        query_1.setValue(uztrolEstado);
        List parameList = new ArrayList();
        parameList.add(query_1);
        List<Uztrol> list = ds.customQuery(parameList, Uztrol.class);
        try {
            if (!list.isEmpty()) {
                listRoles = (ArrayList<Uztrol>) list;
            }
        } catch (Exception ex) {
            log.level.info("ERROR LISTA ROLES POR ESTADO: " + ex.toString());
        }
        return listRoles;
    }
      /////////by: Elvis Sarchi
      ///BUSQUEDA QUE DEVUELVE TODOS LOS ROLES
      public static ArrayList<Uztrol> listRoles() {
        ArrayList<Uztrol> listRoles = null;
        DAOServices ds = new DAOServices(AprocLogHibernateUtil.
                getSessionFactory().getCurrentSession());
        List parameList = new ArrayList();
        List<Uztrol> list = ds.customQuery(parameList, Uztrol.class);
        try {
            if (!list.isEmpty()) {
                listRoles = (ArrayList<Uztrol>) list;
            }
        } catch (Exception ex) {
            log.level.info("ERROR  LIST ROLES : " + ex.toString());
        }
        return listRoles;
    }
      ///////////////
      ///BUSQUEDA DE ROL POR ID
      public static Uztrol findRolByIdRol(BigDecimal uztrolId) {
        Uztrol listRol = null;
        DAOServices ds = new DAOServices(AprocLogHibernateUtil.
                getSessionFactory().getCurrentSession());
        QueryParameter query_1 = new QueryParameter(QueryParameter.$TYPE_WHERE);
        ///////
        query_1.setColumnName("uztrolId");
        query_1.setWhereClause("=");
        query_1.setValue(uztrolId);
        
        List parameList = new ArrayList();
        parameList.add(query_1);
        List<Uztrol> list = ds.customQuery(parameList, Uztrol.class);
        try {
            if (!list.isEmpty()) {
                listRol = (Uztrol) list.get(0);
            }
        } catch (Exception ex) {
            log.level.info("ERROR  LIST ROL : " + ex.toString());
        }
        return listRol;
    }
      
      //////SISTEMAS///////////////////////
      //////////////////////////////////////////////
      ////BUSQUEDA QUE DEVUELVE TODOS LOS SISTEMAS
      public static ArrayList<Uztsist> listSistemas() {
        ArrayList<Uztsist> listSistemas = null;
        DAOServices ds = new DAOServices(AprocLogHibernateUtil.
                getSessionFactory().getCurrentSession());
        List parameList = new ArrayList();
        List<Uztsist> list = ds.customQuery(parameList, Uztsist.class);
        try {
            if (!list.isEmpty()) {
                listSistemas = (ArrayList<Uztsist>) list;
            }
        } catch (Exception ex) {
            log.level.info("ERROR  LIST SISTEMAS : " + ex.toString());
        }
        return listSistemas;
    }
      
      ////////////////////////////////////////////////
      /////BUQUEDA DE SISTEMAS POR ID
      public static Uztsist findSistemaByIdSistema(BigDecimal uztsistId) {
        Uztsist listSistema = null;
        DAOServices ds = new DAOServices(AprocLogHibernateUtil.
                getSessionFactory().getCurrentSession());
        QueryParameter query_1 = new QueryParameter(QueryParameter.$TYPE_WHERE);
        ///////
        query_1.setColumnName("uztsistId");
        query_1.setWhereClause("=");
        query_1.setValue(uztsistId);
        
        List parameList = new ArrayList();
        parameList.add(query_1);
        List<Uztsist> list = ds.customQuery(parameList, Uztsist.class);
        try {
            if (!list.isEmpty()) {
                listSistema = (Uztsist) list.get(0);
            }
        } catch (Exception ex) {
            log.level.info("ERROR  LIST SISTEMAS : " + ex.toString());
        }
        return listSistema;
    }
    //////////////////////////////////////////////////////////////////////
      //////////BUSQUEDA DE SISTEMAS POR ESTADO
      public static ArrayList<Uztsist> listSistemasByEstado(Character uztsistEstado) {
        ArrayList<Uztsist> listSistemas = null;
        DAOServices ds = new DAOServices(AprocLogHibernateUtil.
                getSessionFactory().getCurrentSession());
        QueryParameter query_1 = new QueryParameter(QueryParameter.$TYPE_WHERE);
        query_1.setColumnName("uztsistEstado");
        query_1.setWhereClause("=");
        query_1.setValue(uztsistEstado);
        List parameList = new ArrayList();
        parameList.add(query_1);
        List<Uztsist> list = ds.customQuery(parameList, Uztsist.class);
        try {
            if (!list.isEmpty()) {
                listSistemas = (ArrayList<Uztsist>) list;
            }
        } catch (Exception ex) {
            log.level.info("ERROR LISTA SISTEMAS POR ESTADO: " + ex.toString());
        }
        return listSistemas;
    }
      
      public static String CLOBToStringaaa(CLOB cl) throws IOException, SQLException 
        {
        if (cl == null)
        return "";
        StringBuffer strOut = new StringBuffer();
        String aux;
        BufferedReader br = new BufferedReader(cl.getCharacterStream());
        while ((aux=br.readLine()) != null)
        {
        strOut.append(aux);
        }
        return strOut.toString();
        }
      
      
private static java.sql.Clob stringToClob(String source)
{
    try
    {
        return new javax.sql.rowset.serial.SerialClob(source.toCharArray());
    }
    catch (Exception e)
    {
        //log("Could not convert string to a CLOB",e);
        return null;
    }
}

//////////////////////////////////////
      /// BUSQUEDA DE SISTEMAS POR RUTA
      public static ArrayList<Uztsist> listSistemasByRuta(String uztsistRuta) {
          java.sql.Clob clob=stringToClob(uztsistRuta);
        ArrayList<Uztsist> listSistemas = null;
        DAOServices ds = new DAOServices(AprocLogHibernateUtil.
                getSessionFactory().getCurrentSession());
        QueryParameter query_1 = new QueryParameter(QueryParameter.$TYPE_WHERE);
        query_1.setColumnName("uztsistRuta");
        query_1.setWhereClause("=");
        query_1.setValue(clob);
        List parameList = new ArrayList();
        parameList.add(query_1);
        List<Uztsist> list = ds.customQuery(parameList, Uztsist.class);
        try {
            if (!list.isEmpty()) {
                listSistemas = (ArrayList<Uztsist>) list;
            }
        } catch (Exception ex) {
            log.level.info("ERROR LISTA SISTEMAS POR RUTA: " + ex.toString());
        }
        return listSistemas;
    }
      
      //////PROCEDIMIENTOS///////////////////////
      //////////////////////////////////////////////
      ////BUSQUEDA QUE DEVUELVE TODOS LOS PROCEDIMIENTOS
       public static ArrayList<Uztproc> listProcedimientos() {
        ArrayList<Uztproc> listProcedimientos = null;
        DAOServices ds = new DAOServices(AprocLogHibernateUtil.
                getSessionFactory().getCurrentSession());
        List parameList = new ArrayList();
        List<Uztproc> list = ds.customQuery(parameList, Uztproc.class);
        try {
            if (!list.isEmpty()) {
                listProcedimientos = (ArrayList<Uztproc>) list;
            }
        } catch (Exception ex) {
            log.level.info("ERROR  LIST PROCEDIMIENTOS : " + ex.toString());
        }
        return listProcedimientos;
    }
       ///////////////////////////////////////////////
         public static Boolean insertUsuario(Uztuser usu) {
        Boolean exito = false;
        DAOServices ds = new DAOServices(AprocLogHibernateUtil.
                getSessionFactory().getCurrentSession());
        if (usu != null) {
            ds.save(usu);
            exito = true;
        }
        return exito;
    }
         //////////////////////////
         
       
       
}
