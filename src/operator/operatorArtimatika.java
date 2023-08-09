/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.operatorArtimatika to edit this template
 */
package operator;

/**
 *
 * @author Neisha
 */
public class operatorArtimatika {
    public static void main(String[] args) {
        
        int bilangan1=13;
        int bilangan2=5;
        
        int hasilpenjumlahan = bilangan1+bilangan2 ;
        int hasilpengurangan = bilangan1-bilangan2 ;
        int hasilperkalian   = bilangan1*bilangan2 ;
        int hasilpembagian   = bilangan1/bilangan2 ;
        int hasilmodulus     = bilangan1%bilangan2 ;
        
//        System.out.println("hasil perjumlahan:"+hasilpenjumlahan);
//        System.out.println("hasil pengurangan:"+hasilpengurangan);
//        System.out.println("hasil perkalian:"+hasilperkalian);
//        System.out.println("hasil pembagian:"+hasilpembagian);
//        System.out.println("hasil modulus:"+hasilmodulus);
        
        double nilaimat = 80.9 ;
        double nilaiproduktif = 99.89;
        double nilaiinformatika= 95.78;
        double nilaipkn = 94.90 ;
        
        double nilairata =
              (nilaimat+nilaiproduktif+nilaiinformatika+nilaipkn) /4;
        
        System.out.println("nilai rata-rata"+nilairata);

    }
  
   }
