

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
    
    
}
