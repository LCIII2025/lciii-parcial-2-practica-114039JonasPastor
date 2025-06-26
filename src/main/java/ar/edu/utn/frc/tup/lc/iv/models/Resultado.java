package ar.edu.utn.frc.tup.lc.iv.models;

import jakarta.persistence.*;

@Entity
@Table(name = "resultados")
public class Resultado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orden;
    private String nombre;
    private int votos;
    private double porcentaje;
}
