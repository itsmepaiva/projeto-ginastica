package com.tibs.projeto_ginastica.controller;

import com.tibs.projeto_ginastica.entity.AvaliacaoFisica;
import com.tibs.projeto_ginastica.entity.form.AvaliacaoFisicaForm;
import com.tibs.projeto_ginastica.service.impl.IAvaliacaoFisicaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {
    @Autowired
    private IAvaliacaoFisicaServiceImpl service;

    @PostMapping
    public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaForm form){
        return service.create(form);
    }
}
