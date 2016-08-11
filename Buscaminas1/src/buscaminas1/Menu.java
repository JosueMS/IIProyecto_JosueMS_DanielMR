/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//paquetes
package buscaminas1;
//Importes
import buscaminas1.Juego;
import javax.swing.JOptionPane;
/**
 **
 ** @author Josue Muñoz Solis & Daniel Murillo Rodriguez
 ** @date  2016-08-10 miercoles
 **/
public class Menu extends Object{
    int opcion;
    int x;
    /**
     *
     * @param opcion
     * @param x
     * 
     */
    // Contructor lleno
    public Menu(int opcion, int x) { 
        this.opcion = opcion;
        this.x = x;
    }
    //Constructor vacio
    /**
     *
     */
    // Metodo public Menu
    public Menu() {}
    /**
     ** 
     **/
    // Metodo de menu que llama a las clases
    public void menuBuscaminas(){
        do{
        try{
        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite una opcion"+"\n 1 > Jugar"+"\n 2 > Salir")); 
        }catch(Exception opcion){
        }
        switch(opcion){//Menu de Seleccion
        //Caso 1
        case 1:{
        opcion=1;
        System.out.println("Espere");
        buscaminas1.Juego juego = new buscaminas1.Juego();
        break;
        }//Cierre del caso 1
        //Caso 2
        case 2:{
        opcion=2;
        System.out.println("Salio");
        System.exit(0);
        break;
        }
        default:{//Valor por Defecto:
        System.out.println("Esto no existe o no es el numero de las opciones");
        break;//Quiebre
        }//Cierre del caso default
        }//Cierre del switch        
        }while(opcion<=1||opcion>=3);
        }//Cierre del Metodo
}