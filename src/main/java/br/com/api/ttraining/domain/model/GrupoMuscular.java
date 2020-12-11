package br.com.api.ttraining.domain.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class GrupoMuscular {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "grupoMuscular")
    private List<Exercicio> exercicios = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "treino_id")
    private Treino treino;

}
