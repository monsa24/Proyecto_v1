package com.proyecto.domain;



import lombok.Data;
import java.io.Serializable;
import jakarta.persistence.*;


//TAGS vamos a recopilar datos con DATA y vamos a tener un entidad
@Data
@Entity
@Table(name = "perrito")
public class Perrito implements Serializable {

    //esto siguiente nos permite poder modiciar el ID y poder enviar toda la info y poder tranformarla o almacenarla en BD (editar, enviar, modificarlo, eliminarlo)
    private static final long serialVersionUID = 1L;

    //Es para poder hacer el autoincremento en la base de datos del idNumero
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_numero")

    private Long idNumero;
    private String rutaImagen;
    private String nombre;
    private String descripcion;
    private boolean adopcion;

    public Perrito() {
    }

    public Perrito(String nombre, String descripcion, boolean adopcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.adopcion = adopcion;
    }
    
    
    
    
    
    

}
