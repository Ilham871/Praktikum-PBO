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
public class Segitiga {
    int sudut;
    
    int totalSudut(int sudutA){
        sudut=180 - sudutA;
        System.out.println("Total sudut segitiga ke-1 :"+sudut);
        return sudut;
    }
    int totalSudut(int sudutA, int sudutB){
        sudut = 180 - (sudutA + sudutB);
        System.out.println("Total sudut segitiga ke-2 :"+sudut);
        return sudut;
    }
    int keliling(int sisiA,int sisiB, int sisiC){
        int keliling = sisiA + sisiB + sisiC;
        System.out.println("Keliling segitiga ke-1 :"+keliling);
        return keliling;
    }
    double keliling(int sisiA,int sisiB){
        double c = sisiA*sisiA/sisiA + sisiB*sisiB/sisiB;
        System.out.println("Keliling segitiga ke-2 :"+c);
        return c;
    }
    public static void main(String[] args) {
        Segitiga stg = new Segitiga();
        
        stg.totalSudut(90);
        stg.totalSudut(45, 60);
        stg.keliling(40, 80, 20);
        stg.keliling(90, 60);
    }
}
