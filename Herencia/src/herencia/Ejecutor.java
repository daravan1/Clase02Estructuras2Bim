/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

/**
 *
 * @author SALA H
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Metodos obj = new Metodos();
        int op;
        do {
            op = obj.menu();
            switch (op) {
                case 1 -> obj.insertar();
                case 2 -> obj.eliminar();
                case 3 -> obj.reporte('h');
                case 4 -> obj.reporte('m');
                case 5 -> obj.listar();
            }
        } while (true);
    }
}
  
    

