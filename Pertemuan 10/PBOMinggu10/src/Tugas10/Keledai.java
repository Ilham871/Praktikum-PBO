/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas10;

/**
 *
 * @author asus
 */
public class Keledai extends Binatang implements IHerbivora{
    private final String suara;
    private final String warnaBulu;

    public Keledai(String suara, String warnaBulu, String nama, int jmlKaki) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }
    @Override
    public void displayMakan(){
        System.out.println("Makanan : " + herbivora);
    }
    @Override
    public void displayBinatang(){
        System.out.println("DONKEY");
        System.out.println("Nama :" + super.nama);
        System.out.println("Jumlah Kaki : " + super.jmlKaki);
    }
    public void displayData(){
        System.out.println("Suara : " + suara);
        System.out.println("Warna Bulu : " + warnaBulu);
        System.out.println("");
    }
}
