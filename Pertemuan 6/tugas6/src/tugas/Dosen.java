/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author asus
 */
public class Dosen extends Pegawai{
    public int jumlahSKS;
    public int TARIF_SKS;

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }
    public void setSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    } 
    @Override
    public int getGaji() {
        gaji= TARIF_SKS*jumlahSKS;
        return gaji;
    }
}
