package ar.edu.utn.frba.dds.ejercicio_03.decorado;

import ar.edu.utn.frba.dds.ejercicio_03.decorado.Decorado;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("packaging")

@Getter
@Setter
public class Packaging extends Decorado {

  @Column (name = "precio")
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
