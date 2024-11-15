package ar.edu.utn.frba.dds.ejercicio_01;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter

@Table(name="ejercicio")
public class Ejercicio {

    @Id
    @GeneratedValue
    private Integer id;

    @Column (name = "nombre")
    private String nombre;

    @Column (name="detalle")
    private String detalle;

    @ManyToMany(mappedBy = "ejercicio")
    private List<DiaDeEntrenamiento> diaDeEntrenamiento;
}
