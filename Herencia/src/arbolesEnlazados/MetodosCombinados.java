/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolesEnlazados;

import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class MetodosCombinados {

    NodoL head;
    NodoA raizM, raizH;
    Scanner entrada;

    public MetodosCombinados() {
        this.head = null;
        this.raizM = null;
        this.raizH = null;
        this.entrada = new Scanner(System.in);
    }

    public int menu() {
        System.out.println("Insertar                        [1]");
        System.out.println("Recorrer lista                  [2]");
        System.out.println("Crear arboles                   [3]");
        System.out.println("Presentar arbol mujeres         [4]");
        System.out.println("Presentar arbol hombres         [5]");
        System.out.println("Reporte Mujeres                 [6]");
        System.out.println("Reporte Hombres                 [7]");
        System.out.println("Salir                           [0]");
        return entrada.nextInt();
    }

    public boolean listaVacia() {

        return (head == null);
    }

    public boolean arbolVacio(NodoA actual) {

        return (actual == null);
    }

    public NodoL leerEstudiante() {
        int id;
        String nombre;
        char sexo;
        float[] calif = new float[3];
        NodoL nuevo;
        System.out.println("Ingresar id");
        id = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingresar sus nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingresar Sexo (Mujer = m Hombre = h)");
        sexo = entrada.nextLine().charAt(0);
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la calificacion " + (i+1) + ": ");
            calif[i] = entrada.nextFloat();
        }
        nuevo = new NodoL(nombre, id, sexo, calif);
        return nuevo;
    }

    public void insertarLista() {
        NodoL nuevo = leerEstudiante();
        nuevo.sig = head;
        head = nuevo;
    }

    public void recorrerLista() {
        NodoL actual = head;
        while (actual != null) {
            System.out.print(actual.id + ": " + actual.nombre + "-> ");
            actual = actual.sig;
        }
        System.out.println(" ");
    }

    public NodoA insertar(NodoA actual, NodoA nuevo) {
        if (arbolVacio(actual)) {
            return nuevo;
        } else if (nuevo.id > actual.id) {
            actual.der = insertar(actual.der, nuevo);
        } else {
            actual.izq = insertar(actual.izq, nuevo);
        }
        return actual;
    }

    public void crearArboles() {
        NodoL actual = head;
        NodoA nuevo;
        while (actual != null) {
            nuevo = new NodoA(actual.nombre, actual.id, actual.sexo, actual.getPromedio());
            if (nuevo.sexo == 'm') {
                raizM = insertar(raizM, nuevo);
            } else {
                raizH = insertar(raizH, nuevo);
            }
            actual = actual.sig;
        }
    }
    
    public void inOrden(NodoA actual) {
        if (actual != null) {
            inOrden(actual.izq);
            System.out.print(actual.id + ": " + actual.nombre + "-> ");
            inOrden(actual.der);
        }
        System.out.println(" ");
    }

    public void reporte(NodoA actual) {
        if (actual != null) {
            reporte(actual.izq);
            if (actual.promedio >= 7) {
                System.out.println(actual.id + ": " + actual.nombre + " esta Aprobado");
            } else {
                System.out.println(actual.id + ": " + actual.nombre + " esta Reprobado");
            }
            reporte(actual.der);
        }
    }

}
