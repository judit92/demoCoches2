package com.example;

import javax.persistence.*;

/**
 * Created by professor on 11/07/2016.
 */
@Entity
public class Coche
{

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   private String marca;
   private String modelo;
   private Integer año;
   private Integer precio;
   private String matricula;
   @ManyToOne // para decir que coche puede pertenecer a una persona
   private Persona propietario;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", precio=" + precio +
                ", matricula='" + matricula + '\'' +
                ", propietario='" + propietario + '\'' +
                '}';
    }
}
