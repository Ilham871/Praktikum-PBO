/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
    class Ikan {
        public void swim(){
            System.out.println("Ikan bisa berenang");
        }
    }
    class Piranha extends Ikan{
        @Override
        public void swim(){
        System.out.println("Piranha bisa makan daging");
        }
    }
    public class Fish{
        public static void main(String[] args) {
            Ikan a = new Ikan();
            Ikan b = new Piranha();
            a.swim();
            b.swim();
        }
    }

