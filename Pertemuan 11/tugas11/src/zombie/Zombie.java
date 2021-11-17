/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombie;

/**
 *
 * @author asus
 */
public abstract class Zombie implements IDestroyable{
    protected int health,level;
    public abstract void heal();
    @Override
    public abstract void destroyed();
    public String getZombieInfo(){
        return "Health = "+health+"\nLevel = "+level+"\n";
    }
}
