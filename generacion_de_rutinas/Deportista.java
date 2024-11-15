package ar.edu.utn.frba.dds.ejercicio_01;

import ar.edu.utn.frba.dds.ejercicio_01.motivaciones.Motivacion;
import ar.edu.utn.frba.dds.ejercicio_01.motivaciones.MotivacionConverter;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter

@Table(name = "deportista")
public class Deportista {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name= "apellido")
    private String apellido;

    @ElementCollection
    @CollectionTable(name = "contacto_deportista", joinColumns = @JoinColumn(name = "deportista_id"))
    @Column(name = "contacto")
    private List<String> contactos;

    @Convert(converter = MotivacionConverter.class)
    @Column(name = "motivacion_principal")
    private Motivacion motivacionPrincipal;

    @Column(name= "pesoInicialKg")
    private Double pesoInicialEnKilos;

    @OneToMany(mappedBy = "deportista")
    private List<Rutina> rutinas;


    public void agregarContacto(String contacto) {
        contactos.add(contacto);
    }

    public Deportista(){
        this.contactos = new ArrayList<>();
    }

}
