/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class MainSoal4 {
    public static void main(String[] args) {
        BarangPasar bp1=new BarangPasar();
        bp1.kode="AEZAKMI";
        bp1.namaBarang="Beras";
        bp1.hargaDasar=10000;
        bp1.diskon=20f;
        bp1.hitungHargaJual();
        bp1.tampilData();
    }
}
