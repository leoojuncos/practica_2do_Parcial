package ar.edu.utn.frba.dds.ejercicio_01;

import jdk.jfr.StackTrace;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter

@Table(name="diaEntrenamiento_ejercicio")
public class DiaDeEntramientoEjercicio {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "diaEntrenamiento_id", referencedColumnName = "id")
    private DiaDeEntrenamiento diaEntrenamiento;

    @ManyToOne
    @JoinColumn(name = "ejercicio_id", referencedColumnName = "id")
    private Ejercicio ejercicio;
}
