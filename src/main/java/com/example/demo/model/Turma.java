package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.List;


@Entity
@Data
public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nome_curso")
    String nomeCurso;

    @Column(name="data_ini")
    Date dataInicio;

    @Column(name="data_fim")
    Date dataTermino;

    @OneToMany
    @JoinColumn(name = "id_turma")
    private List<Matricula> matriculas;

}
