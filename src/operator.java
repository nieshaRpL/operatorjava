/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Neisha
 */
public class operator {
    public static void main(String[] args) {
        //inialisasi sebagai stok
        int appel=6, anggur=7 ;
        double harga_appel, harga_anggur ;
        harga_appel = 3000.5 ;
        harga_anggur = 5000.3 ;
        double total, bayar ;
        
        /* operator penugasan (pengurang yang menambahi stok)*/
        appel+=1 ;
        anggur+= 3 ;
        /* operator aritmatika (total barang tersedia)*/
        total=appel+anggur;
        
        System.out.println("jumlah barang yang tersedia ="+appel+ "+" +anggur+ "=" +total);
             
          bayar= (total*harga_appel)+(total*harga_anggur);
          //total aset yang dimiliki
          System.out.println("total aset yang dimiliki = Rp" +bayar
          );
         
        
    }
   
  } 
