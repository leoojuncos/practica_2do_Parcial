package ar.edu.utn.frba.dds.ejercicio_03;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "marca")
public class Marca {

    @Id
    private int id;

    @Column(name = "nombre", nullable = false)
    private String nombre;
}
