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
public class MainBinatang {
    public static void main(String[] args) {
        Singa singa = new Singa("Grarrr-grarr", "Coklat", "Tegar", 4);
        Keledai keledai = new Keledai("hekokkk-hekokkk", "Abu-abu", "Pekok", 4);
        Gorilla gorilla = new Gorilla("Haumm-haummm", "Hitam", "GG", 2);
    
        singa.displayBinatang();
        singa.displayMakan();
        singa.displayData();
        
        keledai.displayBinatang();
        keledai.displayMakan();
        keledai.displayData();

        gorilla.displayBinatang();
        gorilla.displayMakan();
        gorilla.displayData();

    }
}
