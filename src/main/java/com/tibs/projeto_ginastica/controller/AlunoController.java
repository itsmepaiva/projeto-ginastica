package com.tibs.projeto_ginastica.controller;

import com.tibs.projeto_ginastica.entity.Aluno;
import com.tibs.projeto_ginastica.entity.AvaliacaoFisica;
import com.tibs.projeto_ginastica.entity.form.AlunoForm;
import com.tibs.projeto_ginastica.service.impl.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoServiceImpl service;

    @GetMapping
    public List<Aluno> getAll(){
        return service.getAll();
    }

    @PostMapping
    public Aluno create(@RequestBody AlunoForm form){
        return service.create(form);
    }

    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(@PathVariable Long id){
        return service.getAllAvaliacaoFisicaId(id);
    }

}
