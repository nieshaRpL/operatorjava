package latihan2;
public class testsiswa {
    public static void main(String[] args) {
        encapsiswa siswa=new encapsiswa();
        siswa.setname("niesha");
        siswa.setage(14);
        siswa.setaddress("kalimantan");
       
        System.out.println("nama: "+siswa.getname()+ " alamat: "+siswa.getaddress()+ " berumur: "+siswa.getAge()+"tahun");
    }
}
