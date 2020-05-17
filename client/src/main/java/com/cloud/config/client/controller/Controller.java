package com.cloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Value("${bienvenida}")
    private String bienvenida;

    @Value("${despedida.personalizada}")
    private String despedida;

    @GetMapping("/bienvenida")
    public ResponseEntity<String> getBienvenida(){
        return ResponseEntity.ok(bienvenida);
    }

    @GetMapping("/despedida")
    public ResponseEntity<String> getDespedida(){
        return ResponseEntity.ok(despedida);
    }

}
