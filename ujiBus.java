
package classobjek.latihan;

public class ujiBus {
    public static void main(String[] args) {
        busjava busMini=new busjava(10);
        busMini.cetak();
        
        busMini.pluspenumpang(3);
        busMini.cetak();
        
        busMini.pluspenumpang(1);
        busMini.cetak();
        
        busMini.pluspenumpang(1);
        busMini.cetak();

    }
}
