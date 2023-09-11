/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operator;

/**
 *
 * @author Neisha
 */

import java.util.Scanner;
public class CategoriNilai {
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
         
         System.out.println("masukan nama");
         String nama = input.nextLine();
         
         System.out.println("masukan nilai");
         double nilai= input.nextDouble();
         
         if( nilai <=96 && nilai >=100){
             System.out.println("sangat baik");
             System.out.println(" A+");
       } 
         else if (nilai <=91 && nilai >=95){
        System.out.println(" sangat baik");
        System.out.println("A-");
        
     }else if (nilai >=86 && nilai >=90){
                System.out.println("baik");
                System.out.println("b+");
                }
     else if (nilai >=81 && nilai >=85){
             System.out.println("baik");
             System.out.println("B");
    }else if (nilai >=75 && nilai >=80){
             System.out.println("baik");
             System.out.println("b-");
    }else if (nilai >=70 && nilai >=74){
             System.out.println("cukup");
             System.out.println("c+");
    }else if (nilai >=65 && nilai>=69){
             System.out.println("cukup");
             System.out.println("c");
    }else if (nilai >=60 && nilai >=64){
             System.out.println("cukup");
             System.out.println("c-");
    }else if (nilai >= 55 && nilai >=59){
             System.out.println("kurang");
             System.out.println("D+");
    }else if (nilai >=0 && nilai >=54){
             System.out.println("kurang");
             System.out.println("D");
    }
         
    }
         
    }
