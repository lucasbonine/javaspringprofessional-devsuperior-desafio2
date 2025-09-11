package com.devsuperior.desafio2.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Entity
@Table(name = "tb_atividade")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Atividade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String descricao;

    private Double preco;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @OneToMany(mappedBy = "atividade")
    private List<Bloco> blocos = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "tb_participantes_atividades",
        joinColumns = @JoinColumn(name = "atividade_id"),
        inverseJoinColumns = @JoinColumn(name = "participante_id"))
    private Set<Participante> participantes = new HashSet<>();

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Atividade atividade)) return false;

        return Objects.equals(id, atividade.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    //helpers
    public void addParticipante(Participante p) {
        participantes.add(p);
        p.getAtividades().add(this);
    }

    public void removeParticipante(Participante p) {
        participantes.remove(p);
        p.getAtividades().remove(this);
    }
}
