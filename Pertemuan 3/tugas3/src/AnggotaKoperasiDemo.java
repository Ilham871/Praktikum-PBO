/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class AnggotaKoperasiDemo {
    private final String noKtp;
    private final String nama;
    private final int limitPinjaman;
    private int jumlahPinjaman;

    AnggotaKoperasiDemo(String newNoKtp, String newNama, int newLimitPinjaman) {
       noKtp=newNoKtp;
       nama=newNama;
       limitPinjaman=newLimitPinjaman;
    } 
    public String getNoKtp(){
        return noKtp;
    } 
    public String getNama(){
        return nama;
    }
    public int getLimitPinjaman(){
        return limitPinjaman;
    }
    public int getJumlahPinjaman(){
        return jumlahPinjaman;
    }
    public void pinjam(int newPinjam){
        if (newPinjam > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        } else {
            jumlahPinjaman=newPinjam; 
        }
    }
    public void angsur(int newAngsur){
        if (newAngsur < jumlahPinjaman*10/100) {
            System.out.println("Maaf angsuran harus 10% dari jumlah pinjaman");
        } else {
            jumlahPinjaman = jumlahPinjaman - newAngsur;
        }
    }
}