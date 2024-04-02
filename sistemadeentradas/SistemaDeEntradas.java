/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemadeentradas;
import java.util.Scanner;
/**
 *
 * @author alfre
 */
public class SistemaDeEntradas {
    
    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Integer contador;
        Scanner scannerString;
        String opcionSeleccionada;
        //Creacion de asientos en arrays
        String zonaVip[] = new String[8];
        String zonaPalco[] = new String[8];
        String zonaGeneral[] = new String[8];
        
        createArray(zonaVip);
        createArray(zonaPalco);
        createArray(zonaGeneral);
        
        
        
        //Menu principal
        for(contador = 0;contador < 100; contador ++){
            System.out.println("\nBienvenido :), selecciona una opción:\n 1) Comprar Entrada\n 2) Salir");
            scannerString = new Scanner(System.in);
            opcionSeleccionada = scannerString.next();
            switch (opcionSeleccionada) {
                case "1":
                    System.out.println("Haz seleccionado comprar entradas");
                    //Menu de compra
                    subMenuShipping(zonaVip, zonaPalco, zonaGeneral, scannerString);
                    break;
                case "2":
                    System.out.println("Hasta luego :)");
                    contador = 101;
                    break;
                default:
                    System.out.println("Debes seleccionar una opción disponible:(!!\n");
                    
            }
        }
        
    }
    
    static void createArray(String[] zona) {
        Integer contador;
        for(contador = 0;contador <= 7;contador++){
            zona[contador] = Integer.toString(contador + 1);
        }
    }
    
    static void printArray(String[] zona) {
        Integer contador;
        for(contador = 0; contador < zona.length; contador++){
            System.out.print(zona[contador]+ " ");
        }
        System.out.println("");
    }
    
    //Submenu para compra de asientos
    static void subMenuShipping(String[] zonaVip,String[] zonaPalco, String[] zonaGeneral, Scanner scannerString) {
        Boolean continueShipping = true;
        String zoneSelected;
        
        do {            
            System.out.println("Estas son las zonas disponibles:\n"
                    + "1 => Zona VIP\n"
                    + "2 => Zona Palco\n"
                    + "3 => Zona General\n");
            System.out.println("Selecciona tu zona");
            zoneSelected = scannerString.next();
            System.out.println("");
            
            if(zoneSelected.equals("1")){
                System.out.println("Asientos disponibles en VIP");
                printArray(zonaVip);
                shippingSeat(zonaVip, scannerString);
            }
            else if(zoneSelected.equals("2")){
                System.out.println("Asientos disponibles en PALCO");
                printArray(zonaPalco);
                shippingSeat(zonaPalco, scannerString);
            }
            else if(zoneSelected.equals("3")){
                System.out.println("Asientos disponibles en GENERAL");
                printArray(zonaGeneral);
                shippingSeat(zonaGeneral, scannerString);
            }
            else{
                System.out.println("ingresa una opción disponible :(");
            }
            
        } while (continueShipping);
    }
    
    //Función para realizar la selección de asiento
    public static Boolean shippingSeat(String[] zona, Scanner scannerString) {
        Boolean continueShipping = true;
        String seatSelected;
        System.out.println("Selecciona tu asiento");
        seatSelected = scannerString.next();
        
        //Profe por temas de tiempo no pude completar este ejercicio, saludos :(
        return continueShipping;
    }
}
