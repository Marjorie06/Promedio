/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parciales;

import java.util.Scanner;

/**
 *
 * @author IDC
 */
public class Parciales {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
 
         double parcial1, parcial2, examenCalificacion = 0, total;

         do {
             System.out.print("Ingrese la nota del Primer parcial del 0 al 10: ");
             parcial1 = sc.nextDouble();
         } while (parcial1 < 0 || parcial1 > 10);
 
         do {
             System.out.print("Ingrese la nota del Segundo parcial del 0 al 10: ");
             parcial2 = sc.nextDouble();
         } while (parcial2 < 0 || parcial2 > 10);
 
         total = parcial1 + parcial2;
 
         if (parcial1 >= 6 && parcial2 >= 6 && total >= 14) {
             System.out.println("Aprobaste directamente con un total de " + total);
         } else {
             System.out.println("No alcanzaste los requisitos minimos,debes rendir el examen de suspenso.");
 
             do {
                 System.out.print("Ingrese la nota del examen de Suspenso del 0 al 10: ");
                 examenCalificacion = sc.nextDouble();
             } while (examenCalificacion < 0 || examenCalificacion > 10);
 
             total += examenCalificacion;
 
             if (total > 20) {
                 total = 20;
             }
 
             if (total >= 14) {
                 System.out.println("Aprobaste con el examen de Suspenso, la nota final es: " + total);
             } else {
                 System.out.println(" Reprobaste, Tu nota final es: " + total);
             }
         }
 
         sc.close();
     }
 }
   

   





//operadores logicos o