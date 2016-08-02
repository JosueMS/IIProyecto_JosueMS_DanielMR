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
   private final Tablero cuadrado; // Sentencia final de Board
    boolean fin = false; // Sentencia boolean fin igualada a false
    boolean victoria = false; // Sentencia boolean victoria igualada a false
    int turno=0; // Sentencia interger turn igualada a 0
