/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class EncapDemo {
    private String name;
    private int age;
    
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name=newName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        if (newAge > 30) {
            System.out.println("Masukkan dengan benar");
            System.out.println("Umur Maksimal 30");
        } else if (newAge < 18 ) {
            System.out.println("Masukkan dengan benar");
            System.out.println("Umur Minimal 18");
        } else{
            System.out.println("Berhasil..!!!");
            age=newAge;
        }
    }
}
