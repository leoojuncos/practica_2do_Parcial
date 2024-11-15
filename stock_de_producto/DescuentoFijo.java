package ar.edu.utn.frba.dds.ejercicio_03;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter

@Entity
@Table(name = "descuentoFijo")
public class DescuentoFijo extends Decorado {

  @Id
  private Long id;

  @Column (name = "nombre", nullable = false)
  private String nombre;

  @Column (name = "valor", nullable = false)
  private Double valor;

  public Double precio() {
    return this.producto.precio() - this.valor;
  }

  public DescuentoFijo() {

  }
}
