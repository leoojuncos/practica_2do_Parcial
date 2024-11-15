package ar.edu.utn.frba.dds.ejercicio_01;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Getter
@Setter

@Table(name = "diaEntrenamiento")
public class DiaDeEntrenamiento {

  @Id
  @GeneratedValue
  private Integer id;

  @ManyToOne
  @JoinColumn(name = "rutina_id", referencedColumnName = "id")
  private Rutina rutina;

  @ManyToMany
  @JoinTable(
          name = "diaEntrenamiento_ejercicio",
          joinColumns = @JoinColumn(name = "diaEntrenamiento_id"),
          inverseJoinColumns = @JoinColumn(name = "ejercicio_id")
  )
  private List<Ejercicio> ejercicios;

  @Column(name = "duracion")
  private Integer numero; // representa el orden en la duracion de la rutina.

  @OneToOne
  @JoinColumn(name = "diaEntrenamiento_id")
  private DiaDeEntrenamiento siguienteDia;

  public DiaDeEntrenamiento() {
    this.ejercicios = new ArrayList<>();
  }
  public void agregarEjercicio(Ejercicio ejercicio) {
    this.ejercicios.add(ejercicio);
  }
}
