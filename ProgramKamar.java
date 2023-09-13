package operator.flowchart;

import java.util.Scanner;
public class ProgramKamar {
    public static void main(String[] args) {
        Scanner Input = new Scanner (System.in);
        
        String nama,kamar;
        int malam,Harga;
        
        System.out.println("======SELAMAT DATANG=====");
        System.out.println("Masukan Nama:");
        nama = Input.nextLine();
        System.out.println("Masukan Kamar:");
        kamar = Input.nextLine();
        System.out.println("Masukan jumlah permalam:");
        malam = Input.nextInt();
        
        
        switch (kamar){
        case "Levana" : 
            Harga = 450000 * malam;
        System.out.println("total bayar"+"Rp"+Harga);
        break;
        case "Merapi":
            Harga = 750000 * malam;
            System.out.println("total bayar"+"Rp"+Harga);
            break;
        case "Sativa" :
            Harga = 900000*malam;
            System.out.println("total bayar"+"Rp"+Harga);
            break;
        default :
            System.out.println("salah input kamar");
    }
        System.out.println("====TERIMA KASIH====");   
        
    }
}
