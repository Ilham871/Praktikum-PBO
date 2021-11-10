/*
 * To change this lic`      ense header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacelatihan;

/**
 *
 * @author asus
 */
import interfacelatihan.ICumlaude;
import interfacelatihan.Mahasiswa;
import interfacelatihan.PascaSarjana;
import interfacelatihan.Rektor;
import interfacelatihan.Sarjana;

public class interfacemain {
    public static void main(String[] args) {
        Rektor pakrektor = new Rektor();

        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");
        
        //pakrektor.beriSertifikatCumlaude(sarjanaCumlaude);
        //pakrektor.beriSertifikatCumlaude(masterCumlaude);
        //pakrektor.beriSertifikatMawapres(sarjanaCumlaude);
        pakrektor.beriSertifikatMawapres(masterCumlaude);
    }
}
