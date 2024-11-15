package ar.edu.utn.frba.dds.ejercicio_03;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.print.attribute.standard.MediaSize;

@Getter
@Setter
@Entity
@Table(name = "packaging")
public class Packaging extends Decorado{

  @Id
  private Long id;

  @Column (name = "descripcion")
  private String descripcion;

  @Column (name = "precio", nullable = false)
  private Double precio;

  //* ----------------- CONSTRUCTORS ----------------- *//

  public Packaging() {
  }

  public Packaging(Double precio) {
      this.precio = precio;
  }

  //* ----------------- METHODS ----------------- *//

  public Double precio() {
    return this.producto.precio() + this.precio;
  }

}
