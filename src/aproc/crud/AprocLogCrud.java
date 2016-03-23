
package aproc.crud;
import aproc.map.*;
import aproc.util.*;
import com.dao.DAOServices;
import com.dao.QueryParameter;
import com.logger.L;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleTypes;
import oracle.sql.NUMBER;
import org.hibernate.HibernateException;
import org.hibernate.jdbc.ReturningWork;

public class AprocLogCrud {
    
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
    
    
    
}
