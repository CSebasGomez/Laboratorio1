/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.util.Scanner;
/**
 *
 * @author Koonda15
 * @version 1.0
 */
public class main {
    public static void main(String[] args) {
        Escenario Dl = new Escenario();
        Dl.Laberinto();//Se crea el Escenario
        Solucion s= new Solucion();
        s.SolucionarLaberinto (Dl,7, 1);// se le indica a la solucion donde debe
        //aparecer el robot y en que escenario
    }
}
