/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mobil;

/**
 *
 * @author Lenovo
 */
public class Main {
 public static void main (String [] args){
        System.out.println("sedan");

        Sedan h = new Sedan();
        h.tampilkan();

        System.out.println("\nminibus");

        Minibus t = new Minibus();
        t.tampilkan();

        System.out.println("\nBus");
        
        Bus z = new Bus();
        z.tampilkan();
 }
}