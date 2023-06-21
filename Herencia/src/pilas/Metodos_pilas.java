/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas;

import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class Metodos_pilas {
    
    Nodo head;
    Nodo cima;
    Scanner entrada;
    
    public Metodos_pilas(){
        this.head = null;
        this.cima = null;
        this.entrada = new Scanner(System.in);
    }
    
    public int menu(){
        System.out.println("Operaciones con pilas");
        System.out.println("--------------------");
        System.out.println("Push    [1]");
        System.out.println("Pop [2]");
        System.out.println("Presentar pila      [3]");
        System.out.println("Salir       [0]");       
        return entrada.nextInt();
    }
    
    public boolean listaVacia(){
        return (head == null);
    }
    
    public void push(){
        int num;
        System.out.println("Ingrese el elemento a ingresar:");
        num = entrada.nextInt();
        Nodo nuevo = new Nodo(num);
        if (listaVacia()) {
            head = cima = nuevo;
        }else{
            cima.sig = nuevo;
            cima = cima.sig;
        }
    }
    
    public void pop(){
        if (listaVacia()) {
            System.out.println("Pila vacia");
        }else{
             System.out.println(cima.dato);
            if (head == cima) {
               head = cima = null;
            }else{
                Nodo actual = head;
                while(actual.sig.sig != null){
                    actual = actual.sig;
                }
                
                cima = actual;
                cima.sig = null;
            }
        }
    }
    
    public void presentar(){
        Nodo actual = head;
        while(actual != null){
            System.out.println(actual.dato + " ->");
            actual = actual.sig;
        }
        System.out.println(" null");
    }
}
