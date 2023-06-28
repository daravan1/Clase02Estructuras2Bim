/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolesEnlazados;

/**
 *
 * @author SALA H
 */
public class NodoA extends Persona {

    float promedio;
    NodoA izq;
    NodoA der;

    public NodoA(String nombre, int id, char sexo, float promedio) {
        super(nombre, id, sexo);
        
        this.promedio = promedio;
        this.izq = null;
        this.der = null;
    }
}
