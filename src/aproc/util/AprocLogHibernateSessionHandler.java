/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aproc.util;

import com.logger.L;
import org.hibernate.SessionFactory;

/**
 *
 * @author Ivan
 */
public class AprocLogHibernateSessionHandler {
    
    private SessionFactory AprocLogSession;
    private final static L log = new L(AprocLogHibernateSessionHandler.class);

    public AprocLogHibernateSessionHandler() {

        AprocLogSession = AprocLogHibernateUtil.getSessionFactory();

        try {
            AprocLogSession.getCurrentSession().beginTransaction();

        } catch (Exception e) {
            log.level.error("Error en la sesion de Hibernate", e);
        }
    }

    public void close() {
        try {
            AprocLogSession.getCurrentSession().getTransaction().commit();
        } catch (Exception e) {
            if (AprocLogSession.getCurrentSession().getTransaction().isActive()) {
                log.level.error("Trying to rollback database transaction after exception. Módulo RapidLoans_Users.", e);
                AprocLogSession.getCurrentSession().getTransaction().rollback();
            }
            log.level.error("Error al cerrar la sesion de Hibernate", e);
        } finally {
            AprocLogSession.getCurrentSession().close();
        }

    }
    
}
