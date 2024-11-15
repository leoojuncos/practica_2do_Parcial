package ar.edu.utn.frba.dds.ejercicio_03;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "productos")
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn (name = "tipo_producto")

@Getter
@Setter
public abstract class Producto {

  @Id
  @GeneratedValue
  private Integer id;

  @Column (name = "nombre")
  private String nombre;

  @ManyToOne
  @JoinColumn(name = "marca_id", referencedColumnName = "id")
  private Marca marca;

  @ManyToMany(mappedBy = "productos")
  private List<Combo> combos;

  public Producto() {

  }

  public Double precio() {

      return 0.0;
  }

  public Integer stock() {

      return 0;
  }
}
