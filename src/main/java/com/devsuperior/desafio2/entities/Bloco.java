package com.devsuperior.desafio2.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tb_bloco")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bloco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Instant inicio;

    private Instant fim;

    @ManyToOne
    @JoinColumn(name = "atividade_id")
    private Atividade atividade;

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Bloco bloco)) return false;

        return Objects.equals(id, bloco.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
