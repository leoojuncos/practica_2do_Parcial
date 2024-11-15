package ar.edu.utn.frba.dds.ejercicio_03;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "combo")
public class Combo extends Producto{

  @Id
  private Long id;

  @Getter
  @OneToMany (mappedBy =  "combo")
  private List<Producto> productos;

  @Column (name = "precio_total", nullable = false)
  private Double precioTotal;

  public Combo() {
      this.productos = new ArrayList<Producto>();
      this.precio();
  }

  public void agregarProducto(Producto producto){
    this.productos.add(producto);
  }

  public Double precio(){
    this.precioTotal = this.productos.stream()
                                     .mapToDouble(p-> p.precio()).sum();
    return this.precioTotal;
  }
}
