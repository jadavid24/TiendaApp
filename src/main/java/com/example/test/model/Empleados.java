package com.example.test.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Setter
@Getter
@Table(name = "empleados",  schema = "vex")

public class Empleados {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_empleado")
    private Integer idEmpleado;

    @JsonBackReference
    @ManyToOne()
    @JoinColumn(name = "id_tienda")
    private Tienda tienda;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "cargo")
    private String cargo;

    @Column(name = "salario")
    private Double salario;
}
