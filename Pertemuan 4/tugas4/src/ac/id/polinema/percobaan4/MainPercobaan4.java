/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.id.polinema.percobaan4;

/**
 *
 * @author asus
 */
public class MainPercobaan4 {

    private static Penumpang budi;
    public static void main(String[] args) {
        Penumpang p = new Penumpang("12345", "Mr. Krab");
        Gerbong gerbong = new Gerbong("A", 10);
        gerbong.setPenumpang(p, 1);
        System.out.println(gerbong.info());
       
        gerbong.setPenumpang(budi, 1);
        System.out.println(gerbong.info());
    }
}
