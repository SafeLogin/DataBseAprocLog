

package aproc.crud;
import com.logger.L;
import java.math.BigDecimal;
import java.util.ArrayList;
import aproc.map.*;
import aproc.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.sql.SQLException;
import oracle.sql.CLOB;
public class AprocLogMethods implements java.io.Serializable{
    
     private final static L log = new L(AprocLogMethods.class);

    static {
        AprocLogHibernateUtil.init();
    }
    
    public String Prueba(){
    return "HOLA QUE HACE";
    
    }
            

    public  ArrayList<Uztuser> ListUsuarios() {
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
    
    public  Uztuser GetUsuariosById(String uztuserId) {
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
    public  ArrayList<Uztuser> GetUsuariosByEstado(Character uztuserEstado) {
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
    public  ArrayList<Uztuser> GetUsuariosByCargo(String uztuserCargo) {
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
    public  ArrayList<Uztuser> GetUsuariosByCampus(String uztuserCampus) {
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
    public  ArrayList<Uztrol> GetRolesByEstado(Character uztrolEstado) {
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
    public  ArrayList<Uztrol> ListRoles() {
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
    public  Uztrol GetRolById(BigDecimal uztrolId) {
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
    public  ArrayList<Uztsist> ListSistemas() {
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
    public  Uztsist GetSistemaById(BigDecimal uztsistId) {
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
    
    //////////////////////////////////////////////////////
    ///LISTA DE SISTEMAS POR ESTADO
    public  ArrayList<Uztsist> GetSistemasByEstado(Character uztsistEstado) {
        ArrayList<Uztsist> objSistemas = null;
        AprocLogHibernateSessionHandler hss = new AprocLogHibernateSessionHandler();
        Exception delegateException = null;
        try {
            if (uztsistEstado != null) {
                objSistemas = AprocLogCrud.listSistemasByEstado(uztsistEstado);
            }

        } catch (Exception ex) {
            log.level.error("ERROR EN BUSQUEDA DE SISTEMAS POR ESTADO : ");
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
        return objSistemas;
    }
    
///////Lista de sistemas por ruta
    public  ArrayList<Uztsist> GetSistemasByRuta(String uztsistRuta) {
        ArrayList<Uztsist> objSistemas = null;
        AprocLogHibernateSessionHandler hss = new AprocLogHibernateSessionHandler();
        Exception delegateException = null;
        try {
            if (stringToClob(uztsistRuta) != null) {
                objSistemas = AprocLogCrud.listSistemasByRuta(uztsistRuta);
            }

        } catch (Exception ex) {
            log.level.error("ERROR EN BUSQUEDA DE SISTEMAS POR RUTA : ");
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
        return objSistemas;
    }
     ///////////PROCEDIMIENTOS/////////////
    ///////////////////////////////////////
    /////////LISTA DE PROCEDIMIENTOS
     public  ArrayList<Uztproc> ListProcedimientos() {
        ArrayList<Uztproc> listProcedimientos = null;
        AprocLogHibernateSessionHandler hss = new AprocLogHibernateSessionHandler();
        Exception delegateException = null;
        try {
            listProcedimientos = AprocLogCrud.listProcedimientos();
        } catch (Exception ex) {
            log.level.error("ERROR EN LIST PROCEDIMIENTOS : ");
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
        return listProcedimientos;
    }

    private  Object stringToClob(String uztsistRuta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    ///////////////////
     public  Boolean InsertarUsuario(Uztuser usu) {
        Boolean exito = false;
        AprocLogHibernateSessionHandler hss = new AprocLogHibernateSessionHandler();
        Exception delegateException = null;
        try {
            if (usu != null) {
                exito = AprocLogCrud.insertUsuario(usu);
            }
        } catch (Exception ex) {
            log.level.error("ERROR EN insertar usuario : ");
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
        return exito;
    }
}
