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
// Class Game del juego
public class Juego {
   private final Tablero tablero; // Sentencia final de Board
    boolean fin = false; // Sentencia boolean fin igualada a false
    boolean victoria = false; // Sentencia boolean victoria igualada a false
    int turno=0; // Sentencia interger turn igualada a 0
     /**
     *
     * 
     */
    // Metodo Game del juego
    public Juego(){
        tablero = new Tablero(); // Intancia de la clase Board
        Play(tablero); // Sentencia play que ejecuta board
    }
    /**
     *
     * @param Tablero
     */
    // Metodo public Play que ejecuta los turnos del juego
    public void Play(Tablero piti){
        do{ // Sentencia bucle do 
            turno++; // Sentencia turn incremental
            System.out.println("Turno "+turno); // Sentencia que imprime el turno, que llama al turn incremental
            piti.mostar();

