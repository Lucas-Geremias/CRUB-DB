package com.provadb.jpa;

import com.provadb.ProvadbApplication;
import com.provadb.domain.Dono;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

public class AlteracaoDonoMain {
    public static void main(String[] args){
        ApplicationContext applicationContext = new SpringApplicationBuilder(ProvadbApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        CadastroDono cadastroDono = applicationContext.getBean(CadastroDono.class);

        Dono dono1 = new Dono();
        dono1.setId(1L);
        dono1.setNome("luan");
        dono1.getCpf("111111111");

        cadastroDono.salvar(dono1);
    }
}
