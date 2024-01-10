
package classobjek.latihan;

public class busjava {
    private int penumpang,maxpenumpang;
    
    public busjava(int maxpenumpang){
        this.maxpenumpang=maxpenumpang;
        penumpang=0;
    }
    public void pluspenumpang(int penumpang){
        int temp;
        temp=this.penumpang+penumpang;
        if(temp>=maxpenumpang){
            System.out.println("Overload penumpang");
        }
        else{
            this.penumpang=temp;
        }
    }
    public void cetak(){
        System.out.println("penumpang sekarang = " + penumpang);
        System.out.println("penumpang seharusnya= "+ maxpenumpang);
    }
    
}
