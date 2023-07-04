/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolesEnlazados;

/**
 *
 * @author SALA H
 */
public class Estudiante extends Persona {

    private float[] calificaciones;
    Estudiante sig;

    public Estudiante(int id, String nombre, char sexo, float[] calificaciones, Estudiante sig) {
        super(nombre, id, sexo);
        this.calificaciones = calificaciones;
        this.sig = sig;
    }

    public float[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(float[] calificaciones) {
        this.calificaciones = calificaciones;
    }

    public Estudiante getSig() {
        return sig;
    }

    public void setSig(Estudiante sig) {
        this.sig = sig;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}