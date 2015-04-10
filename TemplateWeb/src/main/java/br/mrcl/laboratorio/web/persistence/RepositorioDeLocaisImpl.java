package br.mrcl.laboratorio.web.persistence;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.mrcl.laboratorio.web.model.Employee;
import br.mrcl.laboratorio.web.model.Local;


@Repository (value="repositorioDeLocais")
@Transactional
public class RepositorioDeLocaisImpl implements RepositorioDeLocais {

    @Autowired
    private SessionFactory sessionFactory;


    public RepositorioDeLocaisImpl() {
    }
    
    @SuppressWarnings("unchecked")
    public List<Local> recuperaTodosLocais() {
        Session currentSession = sessionFactory.getCurrentSession();
        Criteria criteria = currentSession.createCriteria(Local.class);
        return criteria.list();
    }
    
    public boolean incluiLocal(Local local) {
        try {
            sessionFactory.getCurrentSession().save(local);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
