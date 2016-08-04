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
 ** @date  
 **/
public class Menu extends Object{
    int opcion;
    int q;
    /**
     *
     * @param opcion
     * @param q
     * 
     */
    // Contructor lleno
    public Menu(int opcion, int q) { 
        this.opcion = opcion;
        this.q = q;
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
        buscaminas1.Juego juegi = new buscaminas1.Juego();
        break;