package com.provadb.jpa;

import com.provadb.ProvadbApplication;
import com.provadb.domain.Dono;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class ConsultaDonoMain {
    public static void main(String[] args){
        ApplicationContext applicationContext = new SpringApplicationBuilder(ProvadbApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        CadastroDono cadastroDono = applicationContext.getBean(CadastroDono.class);

        List<Dono> donos = cadastroDono.listar();

        for (Dono dono : donos){
            System.out.println(dono.getNome());
        }
    }
}
