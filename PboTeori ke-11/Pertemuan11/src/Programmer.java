/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Programmer extends Pegawai{
    private final int bonus;

    public Programmer(String nama, int gaji, int bonus) {
        super(nama, gaji);
        this.bonus = bonus;
    }
    @Override
    public int getGaji() {
        return gaji;
    }
    public int getBonus() {
        return bonus;
    }
    
}
