package com.tibs.projeto_ginastica.service;

import com.tibs.projeto_ginastica.entity.AvaliacaoFisica;
import com.tibs.projeto_ginastica.entity.form.AvaliacaoFisicaForm;
import com.tibs.projeto_ginastica.entity.form.AvaliacaoFisicaUpdateForm;

import java.util.List;

public interface IAvaliacaoFisicaService {
    AvaliacaoFisica create(AvaliacaoFisicaForm form);

    AvaliacaoFisica get(Long id);

    List<AvaliacaoFisica> getAll();

    AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate);

    void delete(Long id);
}
