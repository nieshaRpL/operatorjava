
import static java.time.Clock.system;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Neisha
 */
public class inputmakanan {
    public static void main(String[] args) {
        System.out.println(" menumakanan");
        System.out.println("1. sotoayam (15000)");
        System.out.println("2. rawondaging (17000");
        System.out.println("3. meigoreng (5000)");
        
        
        int soto,rawon,mei,tahu,sate;
        soto = 15000;
        rawon= 17000;
        mei = 5000;
       
        
        int jumlahbeli,totalsoto,totalrawon,totalmei,totalsemua,bayar,kembali ;
        Scanner input = new Scanner(System.in) ;
        System.out.println("beli soto berapa?");
        jumlahbeli= input.nextInt ();
        totalsoto = jumlahbeli*soto ;
        System.out.println("beli rawon berapa?");
        jumlahbeli = input.nextInt ();
        totalrawon = jumlahbeli*rawon ;
        System.out.println("beli mie berapa?");
        jumlahbeli = input.nextInt () ;
        totalmei = jumlahbeli*mei ;
        totalsemua = totalsoto+totalrawon+totalmei ;
        System.out.println("totalpembelian :"+totalsemua);
        System.out.println("berapa uang anda? ");
        bayar = input .nextInt();
        kembali = bayar-totalsemua;
        System.out.println("Jumlah Kembalian: " + kembali);
    }
}
        
        
//    }
      
