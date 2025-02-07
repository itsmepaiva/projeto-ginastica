package com.tibs.projeto_ginastica.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {

    private String nome;

    private String cpf;

    private String bairro;

    private LocalDate dataDeNascimento;
}
