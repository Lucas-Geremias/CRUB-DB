package com.provadb.animal;

import com.provadb.ProvadbApplication;
import com.provadb.domain.Animal;
import com.provadb.domain.Dono;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

public class InclusaoAnimalMain {
    public static void main(String[] args){
        ApplicationContext applicationContext = new SpringApplicationBuilder(ProvadbApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        CadastroAnimal cadastroAnimal = applicationContext.getBean(CadastroAnimal.class);

       Animal raca1 = new Animal();
       raca1.setNome("lucas");
       raca1.getRaca("111221211");

       cadastroAnimal.salvar(raca1);
    }
}
