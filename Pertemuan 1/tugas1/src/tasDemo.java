
import java.util.ArrayList;
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
public class tasDemo {
    public static void main(String[] args) {
        ArrayList fitur1=new ArrayList();
        ArrayList fitur2=new ArrayList();
        boolean running=true;
        boolean running1=true;
        tas tas1= new tas();
        tasGunung tas2= new tasGunung();
        
        tas1.setJenis("Tas Biasa");
        tas1.setMerk("Polo");
        tas1.cetakInformasi();
        Scanner sc = new Scanner(System.in);
        String input;
        int ok;
        while(running){
        System.out.print("Tambah fitur (y/t) :");
        input=sc.nextLine();
        switch(input){
            case "y":
                System.out.print("nama: ");
                fitur1.add(sc.nextLine());
                break;
            case "t":
                running=false;
                break;
        }
        }
        System.out.println("---------------");
        tas1.cetakInformasi();
        System.out.println("Fitur: "+fitur1);
        
        System.out.println("");
        tas2.setJenis("Tas Gunung");
        tas2.setMerk("Eiger");
        tas2.ukuran(20);
        tas2.cetakInformasi();
        while(running1){
        System.out.print("Tambah fitur (y/t) :");
        input=sc.nextLine();
        switch(input){
            case "y":
                System.out.print("nama: ");
                fitur2.add(sc.nextLine());
                break;
            case "t":
                running1=false;
                break;
        }
        }
        System.out.println("---------------");
        tas2.cetakInformasi();
        System.out.println("Fitur: "+fitur2);
        System.exit(0);
  }
}           