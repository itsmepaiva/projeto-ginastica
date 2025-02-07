package com.tibs.projeto_ginastica.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoUpdateForm {

    private String nome;

    private String bairro;

    private LocalDate dataDeNascimento;
}
