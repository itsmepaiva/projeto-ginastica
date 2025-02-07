package com.tibs.projeto_ginastica.service.impl;

import com.tibs.projeto_ginastica.entity.Aluno;
import com.tibs.projeto_ginastica.entity.AvaliacaoFisica;
import com.tibs.projeto_ginastica.entity.form.AlunoForm;
import com.tibs.projeto_ginastica.entity.form.AlunoUpdateForm;
import com.tibs.projeto_ginastica.infra.utils.JavaTimeUtils;
import com.tibs.projeto_ginastica.repository.AlunoRepository;
import com.tibs.projeto_ginastica.service.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AlunoServiceImpl implements IAlunoService {
    @Autowired
    private AlunoRepository repository;


    @Override
    public Aluno create(AlunoForm form) {
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setDataDeNascimento(form.getDataDeNascimento());
        return repository.save(aluno);
    }

    @Override
    public Aluno get(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Aluno> getAll(String dataDeNascimento) {
       if(dataDeNascimento == null){
           return repository.findAll();
       }else {
           LocalDate localDate = LocalDate.parse(dataDeNascimento, JavaTimeUtils.LOCAL_DATE_FORMATTER);
           return repository.findByDataDeNascimento(localDate);
       }
    }

    @Override
    public Aluno update(Long id, AlunoUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {
        Aluno aluno = repository.findById(id).get();
        return aluno.getAvaliacoes();

    }
}
