package com.provadb.jpa;

import com.provadb.ProvadbApplication;
import com.provadb.domain.Dono;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

public class InclusaoDonoMain {
    public static void main(String[] args){
        ApplicationContext applicationContext = new SpringApplicationBuilder(ProvadbApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        CadastroDono cadastroDono = applicationContext.getBean(CadastroDono.class);

       Dono dono1 = new Dono();
       dono1.setNome("lucas");
       dono1.getCpf("111221211");

       cadastroDono.salvar(dono1);
    }
}
