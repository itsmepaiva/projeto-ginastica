package com.tibs.projeto_ginastica.service;

import com.tibs.projeto_ginastica.entity.*;
import com.tibs.projeto_ginastica.entity.form.AlunoForm;
import com.tibs.projeto_ginastica.entity.form.AlunoUpdateForm;

import java.util.List;

public interface IAlunoService {
    Aluno create(AlunoForm form);

    Aluno get(Long id);

    List<Aluno> getAll(String dataDeNascimento);

    Aluno update(Long id, AlunoUpdateForm formUpdate);

    void delete(Long id);

    List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);
}
