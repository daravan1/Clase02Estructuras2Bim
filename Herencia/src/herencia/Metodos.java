/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;
import java.util.Scanner;
/**
 *
 * @author SALA H
 */
    
public class Metodos {

    Estudiante head;
    Scanner entrada;

    public Metodos() {
        this.head = null;
        this.entrada = new Scanner(System.in);
    }

    public int menu() {
        System.out.println("1. Insertar");
        System.out.println("2. Eliminar");
        System.out.println("3. Reporte varones");
        System.out.println("4. Reporte damas");
        System.out.println("5. Listar");
        System.out.println("6. Salir");

        return entrada.nextInt();

    }

    public boolean listaVacia() {

        return (head == null);
    }

    public Estudiante leerDatos() {
        int id;
        String nombre;
        char sexo;
        float[] calif = new float[3];
        System.out.println("Ingresar id");
        id = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingresar sus nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingresar Sexo");
        sexo = entrada.nextLine().charAt(0);
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la calificacion " + i + ": ");
            calif[i] = entrada.nextFloat();
        }
        Estudiante nuevo = new Estudiante(id, nombre, sexo, calif, head);

        return nuevo;

    }

    public void insertar() {
        Estudiante nuevo = leerDatos();

        if (listaVacia()) {
            head = nuevo;
        } else if (nuevo.id < head.id) {
            nuevo.sig = head;
            head = nuevo;
        } else {

            Estudiante actual = head;
            while ((actual.sig != null) && (nuevo.id > actual.sig.id)) 
                actual = actual.sig;
            nuevo.sig = actual.sig;
            actual.sig = nuevo;

            

        }

    }
    
    public void listar(){
        if (listaVacia()) {
            System.out.println("No existen elementos");
        }else{
            Estudiante actual = head;
            while(actual != null){
                System.out.println("Id: " + actual.id + "\nNombre: " + actual.nombre + "\n");
                actual = actual.sig;
            }
        }
    }
    public void reporte(char x){
        Estudiante actual = head;
        while(actual != null){
            if (actual.sexo == x) {
                if (actual.getPromedio() >= 7) {
                    System.out.println("Estudiante " + actual.id + " " + actual.nombre + " esta aprobado");
                }else{
                    System.out.println("Estudiante " + actual.id + " " + actual.nombre + " esta reprobado");
                }
            }
            actual = actual.sig;
        }
    }
    public void eliminar(){
        int _id;
        System.out.println("Id del estudiante a eliminar");
        _id = entrada.nextInt();
        if (listaVacia()){
            System.out.println("No hay nada que eliminar, lista vacia");
        }else{
            if (_id == head.id) {
                head = head.sig;
            }else{
                Estudiante actual = head;
                while((actual.sig != null) && (actual.sig.id != _id)){
                    actual = actual.sig; 
                }
                if (actual.sig == null) {
                    System.out.println("No existe");
                }else{
                    actual.sig = actual.sig.sig;
                }
            }
        }
    }
}