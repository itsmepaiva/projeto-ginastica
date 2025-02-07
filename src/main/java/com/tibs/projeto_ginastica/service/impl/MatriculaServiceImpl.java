package com.tibs.projeto_ginastica.service.impl;

import com.tibs.projeto_ginastica.entity.Aluno;
import com.tibs.projeto_ginastica.entity.Matricula;
import com.tibs.projeto_ginastica.entity.form.MatriculaForm;
import com.tibs.projeto_ginastica.repository.AlunoRepository;
import com.tibs.projeto_ginastica.repository.MatriculaRepository;
import com.tibs.projeto_ginastica.service.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MatriculaServiceImpl implements IMatriculaService {
    @Autowired
    private MatriculaRepository matriculaRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public Matricula create(MatriculaForm form) {
        Matricula matricula = new Matricula();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

        matricula.setAluno(aluno);

        return matriculaRepository.save(matricula);
    }

    @Override
    public Matricula get(Long id) {
        return matriculaRepository.findById(id).get();
    }

    @Override
    public List<Matricula> getAll() {
        return matriculaRepository.findAll();
    }

    @Override
    public void delete(Long id) {

    }
}
