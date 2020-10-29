package com.provadb.animal;

import com.provadb.ProvadbApplication;
import com.provadb.domain.Animal;
import com.provadb.domain.Dono;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

public class AlteracaoAnimalMain {
    public static void main(String[] args){
        ApplicationContext applicationContext = new SpringApplicationBuilder(ProvadbApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        CadastroAnimal cadastroAnimal = applicationContext.getBean(CadastroAnimal.class);

        Animal raca1 = new Animal();
        raca1.setId(1L);
        raca1.setNome("Ralf");
        raca1.getRaca("vira-lata");

        cadastroAnimal.salvar(raca1);
    }
}
