/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolesEnlazados;

/**
 *
 * @author SALA H
 */
public class Ejecutor {
    //Arreglar print de inOrden y reporte
    public static void main(String[] args) {
        int op, num;
        
        MetodosCombinados obj = new MetodosCombinados();
       
        do {
            
            op = obj.menu();
            switch (op){
            
                case 1 -> obj.insertarLista();
                case 2 -> obj.recorrerLista();
                case 3 -> obj.crearArboles();
                case 4 -> obj.inOrden(obj.raizM);
                case 5 -> obj.inOrden(obj.raizH);
                case 6 -> obj.reporte(obj.raizM);
                case 8 -> obj.reporte(obj.raizH);
                
                
            
            }
        } while (op!= 0);
    }
}
