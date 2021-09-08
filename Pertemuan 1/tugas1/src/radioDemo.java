
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
public class radioDemo {
    public static void main(String[] args) {
        radio rd1= new radio();
        
        rd1.setMerk("Polytron");
        Scanner input = new Scanner(System.in);
        int pilih;
        System.out.println("[1] Nyalakan Radio");
        System.out.println("[2] Matikan Radio");
        System.out.print("Pilih : ");
        pilih=input.nextInt();
        switch(pilih){
            case 1:
                rd1.powerOn();
                break;
            case 2:
                rd1.powerOff();
                break;
        }
        rd1.cetakInformasi();
    }
}
