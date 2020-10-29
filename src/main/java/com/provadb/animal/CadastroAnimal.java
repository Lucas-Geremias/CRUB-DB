package com.provadb.animal;

import com.provadb.domain.Animal;
import com.provadb.domain.Dono;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class CadastroAnimal {

    @PersistenceContext
    private EntityManager manager;

    public List<Animal> listar(){

        return manager.createQuery("from Animal", Animal.class).getResultList();
    }

    public Animal buscar (Long id ){

        return manager.find(Animal.class, id);
    }
    @Transactional
    public Animal salvar(Animal animal){

        return manager.merge(animal);
    }

    @Transactional
    public void remover(Animal animal){
        animal = buscar(animal.getId());
        manager.remove(animal);
    }
}
