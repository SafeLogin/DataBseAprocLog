

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
    /////////////////////////////////////////////////
    //LISTA DE USUARIOS POR EL CARGO
    public static ArrayList<Uztuser> GetUsuariosByCargo(String uztuserCargo) {
        ArrayList<Uztuser> objUsuario = null;
        AprocLogHibernateSessionHandler hss = new AprocLogHibernateSessionHandler();
        Exception delegateException = null;
        try {
            if (uztuserCargo != null) {
                objUsuario = AprocLogCrud.listUsuariosByCargo(uztuserCargo);
            }

        } catch (Exception ex) {
            log.level.error("ERROR EN BUSQUEDA DE USUARIO POR CASO : ");
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

        /////////////////////////////////////////////////
    //LISTA DE USUARIOS POR EL CAMPUS
    public static ArrayList<Uztuser> GetUsuariosByCampus(String uztuserCampus) {
        ArrayList<Uztuser> objUsuario = null;
        AprocLogHibernateSessionHandler hss = new AprocLogHibernateSessionHandler();
        Exception delegateException = null;
        try {
            if (uztuserCampus != null) {
                objUsuario = AprocLogCrud.listUsuariosByCampus(uztuserCampus);
            }

        } catch (Exception ex) {
            log.level.error("ERROR EN BUSQUEDA DE USUARIO POR CAMPUS : ");
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
    //////////////////////////
    ///LISTA DE ROLES POR ESTADO
    public static ArrayList<Uztrol> GetRolesByEstado(Character uztrolEstado) {
        ArrayList<Uztrol> objRol = null;
        AprocLogHibernateSessionHandler hss = new AprocLogHibernateSessionHandler();
        Exception delegateException = null;
        try {
            if (uztrolEstado != null) {
                objRol = AprocLogCrud.listRolesByEstado(uztrolEstado);
            }

        } catch (Exception ex) {
            log.level.error("ERROR EN BUSQUEDA DE ROLES POR ESTADO : ");
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
        return objRol;
    }
    ////////////////////by: Elvis Sarchi
    ///TODA LA LISTA DE ROLES
    public static ArrayList<Uztrol> ListRoles() {
        ArrayList<Uztrol> listRoles = null;
        AprocLogHibernateSessionHandler hss = new AprocLogHibernateSessionHandler();
        Exception delegateException = null;
        try {
            listRoles = AprocLogCrud.listRoles();
        } catch (Exception ex) {
            log.level.error("ERROR EN LISTROLES : ");
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
        return listRoles;
    }
    //////////////////
    ///LISTA DE ROLES POR ID DE ROL
    public static Uztrol GetRolById(BigDecimal uztrolId) {
        Uztrol objRol = null;
        AprocLogHibernateSessionHandler hss = new AprocLogHibernateSessionHandler();
        Exception delegateException = null;
        try {
            if (uztrolId != null) {
                objRol = AprocLogCrud.findRolByIdRol(uztrolId);
            }

        } catch (Exception ex) {
            log.level.error("ERROR EN BUSQUEDA DEL ROL POR ID : ");
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
        return objRol;
    }
    
    ///////////SISTEMAS/////////////
    ///////////////////////////////////////
    /////////LISTA DE SISTEMAS
    public static ArrayList<Uztsist> ListSistemas() {
        ArrayList<Uztsist> listSistemas = null;
        AprocLogHibernateSessionHandler hss = new AprocLogHibernateSessionHandler();
        Exception delegateException = null;
        try {
            listSistemas = AprocLogCrud.listSistemas();
        } catch (Exception ex) {
            log.level.error("ERROR EN LIST SISTEMAS : ");
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
        return listSistemas;
    }
    
    //////////////////////////////////////////////////
    /////SISTEMA POR ID
    public static Uztsist GetSistemaById(BigDecimal uztsistId) {
        Uztsist objSistema = null;
        AprocLogHibernateSessionHandler hss = new AprocLogHibernateSessionHandler();
        Exception delegateException = null;
        try {
            if (uztsistId != null) {
                objSistema = AprocLogCrud.findSistemaByIdSistema(uztsistId);
            }

        } catch (Exception ex) {
            log.level.error("ERROR EN BUSQUEDA DEL SISTEMA POR ID : ");
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
        return objSistema;
    }
}
