package ar.edu.utn.frba.dds.ejercicio_03.decorado;

import ar.edu.utn.frba.dds.ejercicio_03.Producto;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity

@Getter
@Setter
public abstract class Decorado extends Producto {

  @ManyToOne
  @JoinColumn(name = "producto_id",referencedColumnName = "id")
  protected Producto producto;

  public Double precio() {
    return this.producto.precio();
  }


}
