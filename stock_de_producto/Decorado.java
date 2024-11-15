package ar.edu.utn.frba.dds.ejercicio_03;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "decorado")
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
public abstract class Decorado extends Producto{

  @Id
  @GeneratedValue
  private  Long id;
  @Transient
  protected Producto producto;

  public Double precio() {
    return this.producto.precio();
  }


}
