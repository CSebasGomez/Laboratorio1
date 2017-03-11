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
 */
public class Escenario {
    
    private City ciudad;
    
    
    
    public Escenario(){
        this.ciudad = new City();
    }

    public City getCiudad() {
        return ciudad;
    }
    
    
    public void Laberinto(){
        
        //pared izquierda
        Wall blocO1 = new Wall(ciudad, /* Y */1, /* X*/1, Direction.WEST);
        Wall blocO2 = new Wall(ciudad, /* Y */2, /* X*/1, Direction.WEST);
        Wall blocO3 = new Wall(ciudad, /* Y */3, /* X*/1, Direction.WEST);
        Wall blocO4 = new Wall(ciudad, /* Y */4, /* X*/1, Direction.WEST);
        Wall blocO5 = new Wall(ciudad, /* Y */5, /* X*/1, Direction.WEST);
        Wall blocO6 = new Wall(ciudad, /* Y */6, /* X*/1, Direction.WEST);
        Wall blocO7 = new Wall(ciudad, /* Y */7, /* X*/1, Direction.WEST);
    
        //pared abajo
        Wall blocO8 = new Wall(ciudad, /* Y */7, /* X*/1, Direction.SOUTH);
        Wall blocO9 = new Wall(ciudad, /* Y */7, /* X*/2, Direction.SOUTH);
        Wall bloc1O = new Wall(ciudad, /* Y */7, /* X*/3, Direction.SOUTH);
        Wall bloc11 = new Wall(ciudad, /* Y */7, /* X*/4, Direction.SOUTH);
        Wall bloc12 = new Wall(ciudad, /* Y */7, /* X*/5, Direction.SOUTH);
        Wall bloc13 = new Wall(ciudad, /* Y */7, /* X*/6, Direction.SOUTH);
        Wall bloc14 = new Wall(ciudad, /* Y */7, /* X*/7, Direction.SOUTH);
        //Wall bloc15 = new Wall(ciudad, /* Y */7, /* X*/8, Direction.SOUTH);
        
        //PARED DERECHA
        Wall bloc16 = new Wall(ciudad, /* Y */1, /* X*/7, Direction.EAST);
        Wall bloc17 = new Wall(ciudad, /* Y */2, /* X*/7, Direction.EAST);
        Wall bloc18 = new Wall(ciudad, /* Y */3, /* X*/7, Direction.EAST);
        Wall bloc19 = new Wall(ciudad, /* Y */4, /* X*/7, Direction.EAST);
        Wall bloc20 = new Wall(ciudad, /* Y */5, /* X*/7, Direction.EAST);
        Wall bloc21 = new Wall(ciudad, /* Y */6, /* X*/7, Direction.EAST);
        Wall bloc22 = new Wall(ciudad, /* Y */7, /* X*/7, Direction.EAST);
        
        //PARED ARRIBA
        Wall bloc23 = new Wall(ciudad, /* Y */1, /* X*/1, Direction.NORTH);
        Wall bloc24 = new Wall(ciudad, /* Y */1, /* X*/2, Direction.NORTH);
        Wall bloc25 = new Wall(ciudad, /* Y */1, /* X*/3, Direction.NORTH);
        Wall bloc26 = new Wall(ciudad, /* Y */1, /* X*/4, Direction.NORTH);
        Wall bloc27 = new Wall(ciudad, /* Y */1, /* X*/5, Direction.NORTH);
        Wall bloc28 = new Wall(ciudad, /* Y */1, /* X*/6, Direction.NORTH);
        //Wall bloc29 = new Wall(ciudad, /* Y */1, /* X*/7, Direction.NORTH);
        //Wall bloc30 = new Wall(ciudad, /* Y */1, /* X*/8, Direction.NORTH);
        
        
        //LABERINTO
        
        Wall bloc32 = new Wall(ciudad, /* Y */7, /* X*/1, Direction.NORTH);
        Wall bloc33 = new Wall(ciudad, /* Y */7, /* X*/2, Direction.NORTH);
        Wall bloc34 = new Wall(ciudad, /* Y */7, /* X*/3, Direction.NORTH);
        
        Wall bloc35 = new Wall(ciudad, /* Y */7, /* X*/5, Direction.NORTH);
        Wall bloc36 = new Wall(ciudad, /* Y */7, /* X*/6, Direction.NORTH);
        
        Wall bloc37 = new Wall(ciudad, /* Y */6, /* X*/2, Direction.NORTH);
        Wall bloc38 = new Wall(ciudad, /* Y */6, /* X*/3, Direction.NORTH);
        
        Wall bloc39 = new Wall(ciudad, /* Y */6, /* X*/5, Direction.NORTH);
        Wall bloc40 = new Wall(ciudad, /* Y */6, /* X*/6, Direction.NORTH);
        
        Wall bloc41 = new Wall(ciudad, /* Y */6, /* X*/6, Direction.EAST);
        Wall bloc42 = new Wall(ciudad, /* Y */5, /* X*/6, Direction.NORTH);
        Wall bloc43 = new Wall(ciudad, /* Y */5, /* X*/7, Direction.NORTH);
        
        Wall bloc44 = new Wall(ciudad, /* Y */5, /* X*/4, Direction.EAST);
        Wall bloc45 = new Wall(ciudad, /* Y */4, /* X*/4, Direction.EAST);
        
        Wall bloc46 = new Wall(ciudad, /* Y */5, /* X*/4, Direction.WEST);
        Wall bloc47 = new Wall(ciudad, /* Y */4, /* X*/4, Direction.WEST);
        
        Wall bloc48 = new Wall(ciudad, /* Y */5, /* X*/1, Direction.EAST);
        Wall bloc49 = new Wall(ciudad, /* Y */4, /* X*/1, Direction.EAST);
        Wall bloc50 = new Wall(ciudad, /* Y */3, /* X*/1, Direction.EAST);
        Wall bloc51 = new Wall(ciudad, /* Y */2, /* X*/1, Direction.EAST);
        Wall bloc52 = new Wall(ciudad, /* Y */2, /* X*/2, Direction.NORTH);
        Wall bloc53 = new Wall(ciudad, /* Y */2, /* X*/3, Direction.NORTH);
        Wall bloc54 = new Wall(ciudad, /* Y */2, /* X*/4, Direction.NORTH);
        Wall bloc55 = new Wall(ciudad, /* Y */2, /* X*/6, Direction.NORTH);
        Wall bloc56 = new Wall(ciudad, /* Y */2, /* X*/7, Direction.NORTH);
        
        Wall bloc57 = new Wall(ciudad, /* Y */2, /* X*/6, Direction.EAST);
        Wall bloc58 = new Wall(ciudad, /* Y */3, /* X*/6, Direction.NORTH);
        Wall bloc59 = new Wall(ciudad, /* Y */3, /* X*/5, Direction.NORTH);
        Wall bloc60 = new Wall(ciudad, /* Y */3, /* X*/4, Direction.NORTH);
        Wall bloc61 = new Wall(ciudad, /* Y */3, /* X*/4, Direction.WEST);
        Wall bloc62 = new Wall(ciudad, /* Y */4, /* X*/5, Direction.NORTH);
        Wall bloc63 = new Wall(ciudad, /* Y */4, /* X*/6, Direction.NORTH);
        Wall bloc64 = new Wall(ciudad, /* Y */4, /* X*/7, Direction.NORTH);
        
        Wall bloc65 = new Wall(ciudad, /* Y */3, /* X*/2, Direction.NORTH);
        
        Wall bloc67 = new Wall(ciudad, /* Y */3, /* X*/2, Direction.EAST);
        Wall bloc68 = new Wall(ciudad, /* Y */4, /* X*/2, Direction.EAST);
        Thing termino=new Thing (ciudad,0,7);
        
}
    
}
