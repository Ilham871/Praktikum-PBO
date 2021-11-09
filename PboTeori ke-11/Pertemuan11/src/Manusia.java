/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Manusia{

    public void nyalakanPerangkat(Elektronik perangkat) {
        Elektronik prkt = perangkat;
        if (perangkat instanceof TelevisiJadul) {
            System.out.println("Nyalakan televisi jadul dengan input: "+((TelevisiJadul)prkt).getModelInput());
        }
        else if (perangkat instanceof TelevisiModern) {
            System.out.println("Nyalakan televisi jadul dengan input: "+((TelevisiModern)prkt).getModelInput());
        }
        System.out.println("Voltase televisi: "+prkt.voltase);
    }
}
