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
     * @return bomba
     */
    //Metodo public int getPosition
    public int getPosicion(int Linea, int Columna) {
        return bomba[Linea][Columna];
    }
    /**
     *
     * @return true, false
     */
    public boolean setPosition(){
            do{// Metodo bucle do
                System.out.print("\n Filas: "); // Sentencia que imprime este mensaje
                Linea = entrada.nextInt(); // Sentencia que ingresa un numero entero
                System.out.print("Columnas: "); // Sentencia que imprime este mensaje
                Columna = entrada.nextInt(); // Sentencia qye ingresa un numero entero
                if( (pizarra[Linea][Columna] != '_') && ((Linea < 9 && Linea > 0) && (Columna < 9 && Columna > 0)))// bucle if que evalua lo que esta dentro
                    System.out.println("El campo que se muestran");// Sentencia que imprime este mensaje
                 if( Linea < 1 || Linea > 8 || Columna < 1 || Columna > 8) // bucle if que valua tamano de las lienas y columnas
                    System.out.println("Elegir un número entre 1 y 8"); // Sentencia que imprime los numeros de la filas y columnas
                }while((Linea < 1 || Linea > 8 || Columna < 1 || Columna > 8) || (pizarra[Linea][Columna] != '_') );// Bucle while
                return getPosicion(Linea, Columna)== -1; // Sentencia que retorna getPosicion
    } // Cierre del metodo boolean
    /**
     *
     * 
     */
    // Metodo public void mostrar
    public void mostrar (){
        System.out.println("\n     Filas");  // Sentencia que imprime este mensaje
        for(int Linea = 8 ; Linea > 0 ; Linea--){ // Bucle for que evalua lo que esta dentro de los parentesis
            System.out.print("       "+Linea + " "); // Sentencia que imprime este mensaje
            for(int Columna = 1 ; Columna < 9 ; Columna++){ // Bucle for que evalua lo que esta dentro de los parentesis
                    System.out.print("   "+ pizarra[Linea][Columna]);// Sentencia que imprime este mensaje
            }
                System.out.println(); // Sentencia que imrpime al vacio
        }
        System.out.println("\n            1   2   3   4   5   6   7   8"); //Sentencia que imprime este mensaje
        System.out.println("                      Columnas"); // Sentencia que imprime este mensaje
    }
     /**
     *
     *
     */
    // Metodo private void llenarCampos
    private void llenarCampos(){
        for(int linea=1 ; linea < 9 ; linea++)
            for(int columna=1 ; columna < 9 ; columna++){
                
                    for(int i=-1 ; i<=1 ; i++)
                        for(int j=-1 ; j<=1 ; j++)
                            if(bomba[linea][columna] != -1)
                                if(bomba[linea+i][columna+j] == -1)
                                    bomba[linea][columna]++;
            } // Cierre del bucle for
    } // Cierre del metodo llenarCampos
    /**
     *
     */
    // Metodo public void mostrarBomba
    public void mostrarBomba(){
        for(int i=1 ; i < 9; i++)
            for(int j=1 ; j < 9 ; j++)
                if(bomba[i][j] == -1)
                    pizarra[i][j]='*';
        mostrar();
    } // Cierre del metodo public void mostrarBomba
  /**
     *
     */
    // Metodo public void iniciarTablero
private void iniciarTablero(){
        for(int i=1 ; i<bomba.length ; i++) 
            for(int j=1 ; j<bomba.length ; j++)
                pizarra[i][j]= '_';
    } // Cierre private void iniciarTablero
    /**
     *
     */
    // Metodo public void iniciarBomba
    private void iniciarBomba(){
        for (int[] bomba1 : bomba) {
            for (int j = 0; j<bomba.length; j++) {
                bomba1[j] = 0;
            } // Cierre del bucle for
        }
    } // Cierre private void randomBomba
    /**
     *
     */
    // Metodo public void randomBomba
    private void randomBomba(){
        boolean raffled; // boolean llamada raffled
        int Linea, Columna;
        for(int i=0 ; i<10 ; i++){
            do{ // Bucle do 
                Linea = random.nextInt(8) + 1;
                Columna = random.nextInt(8) + 1;
            raffled = bomba[Linea][Columna] == -1;
            }while(raffled);
            bomba[Linea][Columna] = -1;
        } // Cierre del bucle for
    } // Cierre del metodo private randomBomba
} // Cierre del metodo public Tablero 