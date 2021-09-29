/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.id.polinema.percobaan2;

/**
 *
 * @author asus
 */
public class MainPercobaan2 {
    public static void main(String[] args) {
        Mobil m = new Mobil("Avanza",350000);
        Sopir s = new Sopir("John Doe",200000);
        Pelanggan p = new Pelanggan("Jane Doe",m,s,2);
        System.out.println("Biaya Total = " +
        p.hitungBiayaTotal());
        
        System.out.println(p.getMobil().getMerk());
    }
}
