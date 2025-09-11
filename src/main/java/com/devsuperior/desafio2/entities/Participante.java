package com.devsuperior.desafio2.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "tb_participante")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Participante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    @ManyToMany(mappedBy = "participantes")
    private Set<Atividade> atividades = new HashSet<>();

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Participante that)) return false;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}