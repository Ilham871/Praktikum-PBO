/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class TestElektronik {
    public static void main(String[] args) {
        Manusia indro = new Manusia();
        TelevisiJadul tvJadul = new TelevisiJadul("DVI", 220);
        TelevisiModern tvModern = new TelevisiModern("HDMI", 220);
        
        indro.nyalakanPerangkat(tvJadul);
        indro.nyalakanPerangkat(tvModern);
    }
}
