/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol2_3;

import java.util.Scanner;

/**
 *
 * @author vmontestovar
 */
public class Bol2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("teclee el numero de billetes de 100 que tenga");
        int billetes1=teclado.nextInt();
        System.out.println("teclee el numero de billetes de 20 que tenga");
        int billetes2=teclado.nextInt();
        System.out.println("teclee el numero de billetes de 5 que tenga");
        int billetes3=teclado.nextInt();
        System.out.println("teclee el numero de monedas de 1 que tenga");
        int monedas1=teclado.nextInt();
        int dinero=100*billetes1+20*billetes2+5*billetes3+1*monedas1;
        System.out.println("usted tiene "+dinero+" euros");
        
        // TODO code application logic here
    }
    
}
