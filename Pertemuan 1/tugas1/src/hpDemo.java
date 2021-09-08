
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
public class hpDemo {
    public static void main(String[] args) {
        hp hp1= new hp();
        
        hp1.setMerk("Iphone x++");
        hp1.volume=50;
        hp1.cetakInformasi();
        Scanner input = new Scanner(System.in);
        int pilih;
        while (true){
        System.out.println("[1] Tambah Volume Suara Hp");
        System.out.println("[2] Kurangi Volume Suara Hp");
        System.out.print("Pilih : ");
        pilih=input.nextInt();
        switch(pilih){
            case 1:
                hp1.volumeTambah();
                break;
            case 2:
                hp1.volumeKurang();
                break;
        }
    }
    }
}
