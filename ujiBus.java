
package classobjek.latihan;

public class ujiBus {
    public static void main(String[] args) {
        latihan1 busMini = new latihan1();
        
       busMini.penumpang=5;
       busMini.maxpenumpang=5;
       busMini.cetak();
       
       busMini.penumpang=busMini.penumpang+5;
       busMini.cetak();
       
       busMini.penumpang=busMini.penumpang-2;
       busMini.cetak();
       
       busMini.penumpang=busMini.penumpang+8;
       busMini.cetak();
    }
}
