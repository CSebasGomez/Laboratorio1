/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.Scanner;
import java.lang.Thread;
/**
 *
 * @author Sebastian
 */
public class SeleccionarPizza {
    private int id;

    public SeleccionarPizza(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    private void DisplayCook(){
        for (int i=0;i<100;i++){
            System.out.println(i+1+ "%!");
        }
    }
    
    void SeleccionPizza(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Bienvenido a PizzaBase!");
        System.out.println("Por favor seleccione su tipo de pizza");
        int a=0;
        int pizza=0;
        int bebida=0;
        do{System.out.println("1) Do-It-Yourself");
            System.out.println("2) Prefab");
            a= teclado.nextInt();
        }while((a!=1)&&(a!=2));
        boolean [] Toppings= new boolean[4];
        if(a==1){
            int b=0;
            int c;
            
            do{
                System.out.println("Do-It-Yourself");
                System.out.println("Por favor, Seleccione los toppings que desea");
                System.out.println("1) Champiñones");
                System.out.println("2) Piña");
                System.out.println("3) Tomate");
                System.out.println("4) Espinaca");
                System.out.println("5) Listo");
                c=teclado.nextInt();
                if((c<5)&&(c>0)){
                    Toppings[c-1]=true;
                }
                else if( c==5){
                    b=5;
                }
            }while(b!=5);
        }
        else{
            do{    
                System.out.println("Prefab");
                System.out.println("Por favor, Seleccione la pizza que desea");
                System.out.println("1) Tomate con Champiñones");
                System.out.println("2) 7 Quesos");
                System.out.println("3) Alfredo Delux");
                System.out.println("4) Tropical");
                pizza=teclado.nextInt();
            }while((pizza<1)||(pizza>4));
        }
        int masa;
        do{
            System.out.println("Seleccione su base");
            System.out.println("1)Deep crust");
            System.out.println("2)Crispy");
            masa=teclado.nextInt();
        }while((masa!=1)&&(masa!=2));
        int size;
        do{
            System.out.println("Seleccione su tamaño");
            System.out.println("1)6 inch");
            System.out.println("2)9 inch");
            System.out.println("3)12 inch");
            size=teclado.nextInt();
        }while((size!=1)&&(size!=2)&&(size!=3));
        int z;
        do{
            System.out.println("Desea alguna bebida?");
            System.out.println("1)Si");
            System.out.println("2)No gracias");
            z=teclado.nextInt();
        }while((z!=1)&&(z!=2));
        int sizebebida=0;
        if(z==1){
            
            do{   
                System.out.println("Que gaseosa desea?");
                System.out.println("1) Big Cola");
                System.out.println("2) Limonada");
                System.out.println("3) Limonada de cereza");
                System.out.println("4) Limonada de Hierbabuena");
                bebida=teclado.nextInt();
            }while((bebida<1)||(bebida>4));
            do{
                System.out.println("Que tamaño de gaseosa desea?");
                System.out.println("1) Grande");
                System.out.println("2) Pequeña");
                sizebebida=teclado.nextInt();
            }while((sizebebida!=1)&&(sizebebida!=2));
        }
        int confirmar;
        System.out.println("Para confirmar el pedido oprima 1,  si desea cancelarlo oprima 0");
        if(a==1){
            System.out.println("Do-It-Yourself");
            if (Toppings[0]){
                System.out.println("-Champiñones");
            }
            if (Toppings[1]){
                System.out.println("-Piña");
            }
            if (Toppings[1]){
                System.out.println("-Tomate");
            }
            if (Toppings[1]){
                System.out.println("-Espinaca");
            }                   
        }
        else{
            System.out.println("Prefab");
            if(pizza==1){
                System.out.println("-Tomate con Champiñones");
            }
            if(pizza==2){
                System.out.println("-7 Quesos");
            }
            if(pizza==3){
                System.out.println("-Alfredo Delux");
            }
            if(pizza==4){
                System.out.println("-Tropical");
            }
        }
        if(masa==1){
            System.out.println("-Deep crust");
        }
        if(masa==2){
            System.out.println("-Crispy");
        }
        if(size==1){
            System.out.println("6 inch");
        }
        if(size==2){
            System.out.println("9 inch");
        }
        if(size==3){
            System.out.println("12 inch");
        }
        if(z==1){
            System.out.println("Gaseosa");
            if(bebida==1){
                System.out.println("-Big Cola");
            }
            if(bebida==2){
                System.out.println("-Limonada");
            }
            if(bebida==3){
                System.out.println("-Limonada de cereza");
            }
            if(bebida==4){
                System.out.println("-Limonada de Hierbabuena");
            }
            if(sizebebida==1){
                System.out.println("-Grande");
            }
            if(sizebebida==2){
                System.out.println("-Pequeña");
            }    
        }
        confirmar=teclado.nextInt();
        if(confirmar ==0){
            SeleccionPizza();
        }
        else{
            DisplayCook();
        }
        
    }
}

