package com.provadb.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {
    public String get(){
        return "CRUB BANCO DE DADOS";
    }
}
