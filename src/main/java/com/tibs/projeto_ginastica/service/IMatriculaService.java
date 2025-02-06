package com.tibs.projeto_ginastica.service;

import com.tibs.projeto_ginastica.entity.Matricula;
import com.tibs.projeto_ginastica.entity.form.MatriculaForm;

import java.util.List;

public interface IMatriculaService {
    Matricula create(MatriculaForm form);

    Matricula get(Long id);

    List<Matricula> getAll();

    void delete(Long id);
}
