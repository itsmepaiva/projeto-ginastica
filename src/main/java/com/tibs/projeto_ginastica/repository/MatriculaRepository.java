package com.tibs.projeto_ginastica.repository;

import com.tibs.projeto_ginastica.entity.Matricula;
import jakarta.servlet.annotation.WebFilter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MatriculaRepository extends JpaRepository<Matricula, Long> {

    //List<Matricula> findByAlunoBairro(String Bairro);

    @Query("FROM Matricula m WHERE m.aluno.bairro = :bairro")
    List<Matricula> findAlunosMatriculadosBairro(String bairro);

}
