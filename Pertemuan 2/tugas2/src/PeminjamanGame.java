public class PeminjamanGame {
    public int id;
    public String namaMember;
    public String namaGame;
    public int hargaBayar;
    
    public void tampilData() {
        System.out.println("ID          : "+id);
        System.out.println("Nama Member : "+namaMember);
        System.out.println("Nama Game   : "+namaGame);
        System.out.println("Harga Bayar(per-game) : "+hargaBayar);
    }
    public int tampilHarga(int lamaSewa) {
        System.out.println("Jumlah harga semuanya: "+lamaSewa * hargaBayar);
        return 0;
    }
    
}