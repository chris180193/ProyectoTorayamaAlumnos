/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

/**
 *
 * @author danie
 */
public class Alumno {
    
    int id;
    String nombre;
    String apePaterno;
    String apeMaterno;
    int edad;
    int telefono;
    String curp;
    String gradoCinta;
    String direccion;
    String alta;

    public Alumno() {
    }

    public Alumno(int id, String nombre, String apePaterno, String apeMaterno, int edad, int telefono, String curp, String gradoCinta, String direccion, String alta) {
        this.id = id;
        this.nombre = nombre;
        this.apePaterno = apePaterno;
        this.apeMaterno = apeMaterno;
        this.edad = edad;
        this.telefono = telefono;
        this.curp = curp;
        this.gradoCinta = gradoCinta;
        this.direccion = direccion;
        this.alta = alta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApePaterno() {
        return apePaterno;
    }

    public void setApePaterno(String apePaterno) {
        this.apePaterno = apePaterno;
    }

    public String getApeMaterno() {
        return apeMaterno;
    }

    public void setApeMaterno(String apeMaterno) {
        this.apeMaterno = apeMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getGradoCinta() {
        return gradoCinta;
    }

    public void setGradoCinta(String gradoCinta) {
        this.gradoCinta = gradoCinta;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getAlta() {
        return alta;
    }

    public void setAlta(String alta) {
        this.alta = alta;
    }

    
    
}
