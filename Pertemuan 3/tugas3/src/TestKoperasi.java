
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class TestKoperasi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int pilih;
        
        AnggotaKoperasiDemo donny = new AnggotaKoperasiDemo("111333444", "Donny", 5000000);
        System.out.println("");
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
        
        do{
        System.out.println("");
        System.out.println("Pilih salah satu");
        System.out.println("[1] Pinjam");
        System.out.println("[2] Angsur");
        System.out.println("[3] Exit");
        System.out.print("Pilih : ");
        pilih=sc.nextInt();
        switch(pilih){
            case 1:
                System.out.print("Meminjam uang sebesar :");
                donny.pinjam(sc.nextInt());
                break;
            case 2:
                System.out.print("Membayar angsuran sebesar :");
                donny.angsur(sc.nextInt());
                break;
        }
            System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        }
        while(pilih<3);
        if (pilih>3) {
            System.out.println("Error... \nPilih dengan benar..!");
        }
    }
}