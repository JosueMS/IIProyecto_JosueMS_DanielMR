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
        iniciarBomba();
        randomBomba();
        llenarCampos();
        iniciarTablero();
    }
     /**
     *
     * @return count 
     */
    // Metodo boolean win
    public boolean ganar() {
        int count = 0;
        for (int linea = 1; linea < 9; linea++) {
            for (int columna = 1; columna < 9; columna++) {
                if (pizarra[linea][columna] == '_') {
                    count++;
                } // Cierre del bucle if
            } // Cierre del bucle for #2
        } // Cierre del bucle for #1
        return count == 10;
    }// Cierre del metodo boolean
    

 /**
     *
     *
     */
    // Metodo public void openNeigbors
    public void AbrirVecinos() {
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                if ((bomba[Linea + i][Columna + j] != -1) && (Linea != 0 && Linea != 9 && Columna != 0 && Columna != 9)) {
                    pizarra[Linea + i][Columna + j] = Character.forDigit(bomba[Linea + i][Columna + j], 10);
                } // Cierre del bucle if
            } // Cierre del bucle for #2
        } // Cierre del bucle for #1

    } // Cierre del metodo void openNeighbors
    
    /**
     *
     * @param Linea
     * @param Columna
     * @return mines
     */
    //Metodo public int getPosition
    public int getPosicion(int Linea, int Columna) {
        return bomba[Linea][Columna];
    }

    
    public boolean setPosition(){
            do{
                System.out.print("\n Filas: "); 
                Linea = entrada.nextInt();
                System.out.print("Columnas: "); 
                Columna = entrada.nextInt();
                if( (pizarra[Linea][Columna] != '_') && ((Linea < 9 && Linea > 0) && (Columna < 9 && Columna > 0)))
                    System.out.println("El campo que se muestran");
                
                if( Linea < 1 || Linea > 8 || Columna < 1 || Columna > 8)
                    System.out.println("Elegir un número entre 1 y 8");
                
            }while((Linea < 1 || Linea > 8 || Columna < 1 || Columna > 8) || (pizarra[Linea][Columna] != '_') );
            
            if(getPosicion(Linea, Columna)== -1)
                return true;
            else
                return false;
    }
    