/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class tasGunung extends tas{
    private int ukuranPerLiter;
    
    public int ukuran(int newValue){
        ukuranPerLiter=newValue;
        return ukuranPerLiter;
    }
    @Override
    public void cetakInformasi(){
        System.out.println("Jenis :"+jenis );
        System.out.println("Merk :"+merk );
        System.out.println("Ukuran :"+ukuranPerLiter+" liter");
}
}
