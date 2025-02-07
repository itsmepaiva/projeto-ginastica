package com.tibs.projeto_ginastica.service.impl;

import com.tibs.projeto_ginastica.entity.Aluno;
import com.tibs.projeto_ginastica.entity.Matricula;
import com.tibs.projeto_ginastica.entity.form.MatriculaForm;
import com.tibs.projeto_ginastica.repository.AlunoRepository;
import com.tibs.projeto_ginastica.repository.MatriculaRepository;
import com.tibs.projeto_ginastica.service.IMatriculaService;
import org.hibernate.type.descriptor.java.ObjectArrayJavaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
    public List<Matricula> getAll(String bairro) {
        if(bairro == null){
            return matriculaRepository.findAll();
        }else{
            return matriculaRepository.findAlunosMatriculadosBairro(bairro);
        }

    }

    @Override
    public void delete(Long id) {

    }
}
