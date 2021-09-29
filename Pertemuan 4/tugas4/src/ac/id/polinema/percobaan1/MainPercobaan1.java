/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.id.polinema.percobaan1;

/**
 *
 * @author asus
 */
public class MainPercobaan1 {
    public static void main(String[] args) {
        Processor p = new Processor("Intel i5", 3);
        Laptop L = new Laptop("Thinkpad", new Processor("Intel i5", 3));
        L.info();
        Processor p1 = new Processor("Intel i5",4);
        p1.setMerk("Intel i5");
        p1.setCache(4);
        Laptop L1 = new Laptop("Thinkpad",p1);
        L1.setMerk("Thinkpad");
        L1.setProc(p1);
        L1.info();
    }
}
