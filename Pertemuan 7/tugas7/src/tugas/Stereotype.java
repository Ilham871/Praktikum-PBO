/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author asus
 */
    class Manusia {
        public void bernafas(){
            System.out.println("Manusia bernafas memerlukan oksigen");
        }
        public void makan(){
            System.out.println("Manusia pasti memelukan makan");
        }
    }
    class Dosen extends Manusia{
        @Override
        public void makan(){
        System.out.println("Dosen juga memerlukan makan");
        }
        public void lembur(){
        System.out.println("Dosen butuh lembur untuk kepentingan perkuliahan");
        }
    }
    class Mahasiswa extends Manusia{
        @Override
        public void makan(){
        System.out.println("Mahasiswa juga memerlukan makan");
        }
        public void tidur(){
        System.out.println("Mahasiswa butuh tidur untuk istirahat");
        }
    }
    public class Stereotype{
        public static void main(String[] args) {
            Manusia a = new Manusia();
            Dosen b = new Dosen();
            Mahasiswa c = new Mahasiswa();
            
            Manusia x;
            x = a;
            
            x.bernafas();
            x.makan();
            System.out.println("");
            x = b;
            x.makan();
            b.lembur();
            System.out.println("");
            x = c;
            x.makan();
            c.tidur();
        }
    }
