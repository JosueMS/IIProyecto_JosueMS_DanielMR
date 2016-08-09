/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//paquetes
package buscaminas1;
//Importes
import javax.swing.JOptionPane; 
/**
 **
 ** @author Josue Muñoz Solis & Daniel Murillo Rodriguez
 ** @date  
 **/
// Clase juego del juego
public class Juego {
   private final Tablero tablero; // Sentencia final de tablero
    boolean fin = false; // Sentencia boolean fin igualada a false
    boolean victoria = false; // Sentencia boolean victoria igualada a false
    int turno=0; // Sentencia interger turn igualada a 0
     /**
     *
     * 
     */
    // Metodo juego
    public Juego(){
        tablero = new Tablero(); // Intancia de la clase tablero
        Jugar (tablero); // Sentencia jugar que ejecuta tablero
    }
    /**
     *
     * @param bomba
     */
    // Metodo public Jugar que ejecuta los turnos del juego
    public void Jugar (Tablero bomba){
        do{ // Sentencia bucle do 
            turno++; // Sentencia turn incremental
            System.out.println("Turno "+turno); // Sentencia que imprime el turno, que llama al turn incremental
            bomba.mostrar();
// Sentencia que muestra el tablero
            fin = bomba.setPosition(); // Sentencia fin igualada a mina.setPosition
            if(!fin){ // Sentencia de bucle
                bomba.AbrirVecinos();
                fin = bomba.ganar();
            }
        }while(!fin); // Sentencia de bucle while
        if(bomba.ganar()){ // Sentencia de bucle que incluye mina.ganar
            System.out.println("Felicitaciones! Has Ganado"); // Sentencia que imprime este mensaje
            JOptionPane.showMessageDialog(null,"Felicitaciones! Has Ganado"); // Sentencia que imprime este mensaje
            bomba.mostrar(); 
        } else {
            System.out.println("Boomm, pisastes una mina, has perdido!!"); // Sentencia que imprime este mensaje
            JOptionPane.showMessageDialog(null,"Boomm, pisastes una mina, has perdido!!"); // Sentencia que imprime este mensaje
            bomba.mostrar();
        } // Cierre del else   
    }  
} // Cierre del metodo public void Play
