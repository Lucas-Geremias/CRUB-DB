package com.provadb.jpa;

import com.provadb.domain.Dono;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class CadastroDono {

    @PersistenceContext
    private EntityManager manager;

    public List<Dono> listar(){
       return manager.createQuery("from Dono", Dono.class).getResultList();
    }

    public Dono buscar (Long id ){
        return manager.find(Dono.class, id);
    }
    @Transactional
    public Dono salvar(Dono dono){
        return manager.merge(dono);
    }

    public void remover(Dono dono){
        manager.remove(dono);
    }
}
