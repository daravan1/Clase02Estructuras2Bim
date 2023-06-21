/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas;

/**
 *
 * @author SALA H
 */
public class Nodo {

    int dato;
    Nodo sig;

    public Nodo(int d) {
        this.dato = d;
        Nodo sig;
    }

    public void establecerDato(int dato) {
        this.dato = dato;
    }

    public void establecerSig(Nodo sig) {
        this.sig = sig;
    }

    public int obtenerDato() {
        return dato;
    }

    public Nodo obtenerSig() {
        return sig;

    }
}
