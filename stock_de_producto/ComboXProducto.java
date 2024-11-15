package ar.edu.utn.frba.dds.ejercicio_03;

import javax.persistence.*;

@Entity
@Table (name = "combo_productos")
public class ComboXProducto {

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "combo_id", referencedColumnName = "id")
    private Combo combo;

    @ManyToOne
    @JoinColumn(name = "producto_id", referencedColumnName = "id")
    private Producto producto;
}
