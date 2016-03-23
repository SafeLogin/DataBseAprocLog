

package aproc.crud;
import com.logger.L;
import java.math.BigDecimal;
import java.util.ArrayList;
import aproc.map.*;
import aproc.util.*;
public class AprocLogMethods {
    
     private final static L log = new L(AprocLogMethods.class);

    static {
        AprocLogHibernateUtil.init();
    }

    public static ArrayList<Uztuser> ListUsuarios() {
        ArrayList<Uztuser> listUsuario = null;
        AprocLogHibernateSessionHandler hss = new AprocLogHibernateSessionHandler();
        Exception delegateException = null;
        try {
            listUsuario = AprocLogCrud.listUsuarios();
        } catch (Exception ex) {
            log.level.error("ERROR EN LISTUSUARIOS : ");
            delegateException = ex;
        } finally {
            hss.close();
            if (delegateException != null) {
                try {
                    throw delegateException;
                } catch (Exception ex) {
                    log.level.info("delageException " + ex.toString());
                }
            }
        }
        return listUsuario;
    }
    
    //////////////////////
    
    public static Uztuser GetUsuariosById(String uztuserId) {
        Uztuser objUsuario = null;
        AprocLogHibernateSessionHandler hss = new AprocLogHibernateSessionHandler();
        Exception delegateException = null;
        try {
            if (uztuserId != null) {
                objUsuario = AprocLogCrud.findUsuarioByIdUsuario(uztuserId);
            }

        } catch (Exception ex) {
            log.level.error("ERROR EN BUSQUEDA DE USUARIO POR ID : ");
            delegateException = ex;
        } finally {
            hss.close();
            if (delegateException != null) {
                try {
                    throw delegateException;
                } catch (Exception ex) {
                    log.level.info("delageException " + ex.toString());
                }
            }
        }
        return objUsuario;
    }
    
    ////////////////////////
    public static ArrayList<Uztuser> GetUsuariosByEstado(Character uztuserEstado) {
        ArrayList<Uztuser> objUsuario = null;
        AprocLogHibernateSessionHandler hss = new AprocLogHibernateSessionHandler();
        Exception delegateException = null;
        try {
            if (uztuserEstado != null) {
                objUsuario = AprocLogCrud.listUsuariosByEstado(uztuserEstado);
            }

        } catch (Exception ex) {
            log.level.error("ERROR EN BUSQUEDA DE USUARIO POR ID : ");
            delegateException = ex;
        } finally {
            hss.close();
            if (delegateException != null) {
                try {
                    throw delegateException;
                } catch (Exception ex) {
                    log.level.info("delageException " + ex.toString());
                }
            }
        }
        return objUsuario;
    }
    
    
}
