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

/**
 *
 * @author Sebastian
 */
public class Solucion { 
    public void SolucionarLaberinto(Escenario x,int w,int t){
        City Cali=x.getCiudad();
        Robot z = new Robot(Cali,w,t,Direction.EAST,0);
        while((z.countThingsInBackpack()==0)){
            z.turnLeft();
            if(z.frontIsClear()){
                z.move();
                if(z.canPickThing()){
                    z.pickThing();
                }
            }
            else{
                for(int i=0;i<3;i++){
                    z.turnLeft();
                }
                if(z.frontIsClear()){
                        z.move();
                        if(z.canPickThing()){
                        z.pickThing();
                }
                }
                else{
                    for(int i=0;i<3;i++){
                    z.turnLeft();
                    }
                }
            } 
        }
    }
    
    
    
}
