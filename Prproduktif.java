
package tugas;
import java.util.Scanner;
public class Prproduktif {
    public static void main(String[] args) {
       Scanner input =new Scanner (System.in);
        
       int harga,jumlah,total=0;
       String barang;
       char yt;
       
       do{
           System.out.println(" 1. sabun cuci\n 2. Minyak Goreng\n 3. telur\n 4. beras\n 5.Gula");
           System.out.println("Masukan barang yang ingin di pilih:");
           barang = input.nextLine();
           
           switch (barang){
               case "1":
                   harga =15000;
                   total=total+harga;
                   break;
               case "2":
                   harga = 40000;
                   total = total+harga;
                   break;
               case"3":
                   harga = 25000;
                   total=total+harga;
                   break;
               case "4":
                   harga = 13500;
                   total=total+harga;
                   break;
               case"5":
                   harga = 12500;
                   total= total+harga;
                   break;
                 default:
                    System.out.println("Barang tidak valid.");
                    continue;                        
           }
           System.out.println(" Mau lanjut:(Y/T)");
            yt = input.next().charAt(0);
            if (yt == 'Y') {
            } else if (yt == 'T') {
                break;
            } else {
                System.out.println("SYSTEM ERROR");
                return;
       }
       }while(true);
        
    
          System.out.println("harga total:"+total);
      }
} 
       

       
            
       
 

