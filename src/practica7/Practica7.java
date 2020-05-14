/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica7;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Adan Sanchez
 */
public class Practica7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList lista = new ArrayList<>(Arrays.asList("A","B","C","D","E","F"));
        lista.forEach(elemento -> {
            System.out.println("Valor de la lista  " + elemento);
            if (elemento.equals("D")){
            System.out.println("Se encontro la cadena");
            }
        });
        
        lista.add("G");
        lista.add("H");
        System.out.println("\n\n se muestra otra forma de recorrer la litsa");
        for (String contenido : lista){
            System.out.println("Valor de lista " + contenido);
        }
        
        lista.add("I");
        lista.add("J");
        lista.add("K");
        String variable = "L";
        lista.add(variable);
        System.out.println("\n\n se muestra otra forma de recorrer la litsa");
        lista.stream().forEach((contiene) -> {
            mensaje((String) contiene);
        
        });
    }
    
    public static void mensaje(String valor){
    System.out.println("contiene " + valor);
    }
}
