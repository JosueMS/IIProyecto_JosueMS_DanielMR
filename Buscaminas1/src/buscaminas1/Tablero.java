/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//paquetes
package buscaminas1;
//Importes
import java.util.Random;
import java.util.Scanner;
/**
 **
 ** @author Josue Muñoz Solis & Daniel Murillo Rodriguez
 ** @date 
 **/
public class Tablero {
    private final int[][] bomba; // Sentencia final int con un valor
    private final char[][] pizarra; // Sentencia final char con un valor
    private int Linea, Columna; // Sentencia int con dos valores
    Random random = new Random(); // Sentencia Random
    Scanner entrada = new Scanner(System.in); // Sentencia Scanner
    /**
     *
     *
     */
    // Metodo public tablero
    public Tablero() {
        bomba = new int[10][10];
        pizarra = new char[10][10];
        startMines();
        randomMines();
        fillTips();
        startBoard();
    }
}
