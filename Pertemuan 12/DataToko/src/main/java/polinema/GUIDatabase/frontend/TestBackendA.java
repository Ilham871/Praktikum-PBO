/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polinema.GUIDatabase.frontend;
import  polinema.GUIDatabase.backend.*;
public class TestBackendA {
    public static void main(String[] args) {
        Anggota agt1 = new Anggota("Ilham", "Malang", "081217297023");
        Anggota agt2 = new Anggota("Lutfi", "Kendal", "082241451712");
        Anggota agt3 = new Anggota("Syah", "Jakarta", "083123423485");

        // test insert
        agt1.save();
        agt2.save();
        agt3.save();

        // test update
        agt2.setAlamat("Surabaya");
        agt2.save();

        // test delete
        agt3.delete();

        // test select all
        for (Anggota a : new Anggota().getAll()) {
            System.out.println("Nama: " + a.getNama() + ", Alamat: " + a.getAlamat()
            + ", Telepon: " + a.getTelepon());
        }

        // test search
        for (Anggota a : new Anggota().search("malang")) {
            System.out.println("Nama: " + a.getNama() + ", Alamat: " + a.getAlamat()
            + ", Telepon: " + a.getTelepon());
        }
    }
}
