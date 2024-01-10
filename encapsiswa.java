
package latihan2;
public class encapsiswa {
    
   private String nama;
   private String address;
   private int age;
   
   public int getAge(){
       return age;
   }
   public String getname(){
       return nama;
   }
   public String getaddress(){
       return address;
   }
   public void setage (int newage){
       age=newage;
   }
   public void setname(String newname){
           nama=newname;
   }
   public void setaddress(String newaddress){
       address=newaddress;
   }
}
