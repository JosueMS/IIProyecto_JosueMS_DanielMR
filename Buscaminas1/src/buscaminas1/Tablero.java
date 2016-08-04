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
        iniciabomas();
        randombombas();
        campos();
        iniciartablero();
    }
     /**
     *
     * @return count 
     */
    // Metodo boolean win
    public boolean ganar() {
        int count = 0;
        for (int line = 1; line < 9; line++) {
            for (int column = 1; column < 9; column++) {
                if (pizarra[line][column] == '_') {
                    count++;
                } // Cierre del bucle if
            } // Cierre del bucle for #2
        } // Cierre del bucle for #1
        return count == 10;
    } // Cierre del metodo boolean
    