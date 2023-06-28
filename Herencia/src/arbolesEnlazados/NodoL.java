/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolesEnlazados;

/**
 *
 * @author SALA H
 */
public class NodoL extends Persona{
    float[] notas;
    NodoL sig;
    
    public NodoL (String nombre,int id ,char sexo, float[] notas){
        super(nombre, id, sexo);
        
        this.notas = notas;
        this.sig = null;
    }
    
    public float getPromedio(){
        float suma = 0;
        for (float i: notas) {
            suma+= i;
        }
        return suma/notas.length;
    }
}
