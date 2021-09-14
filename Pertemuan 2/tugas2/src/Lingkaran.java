public class Lingkaran {
    public double phi;
    public double r;
    
    public double hitungLuas(){
        double l=phi*r*r;
        return l;
    }
    public double hitungKeliling(){
        double k=2*phi*r;
        return k;
    }
    public void tampilData() {
        System.out.println("Jadi Diketahui  : ");
        System.out.println("Phi : "+phi);
        System.out.println("r   : "+r);
        System.out.println(" ");
        System.out.println("Hasilnya  : ");
        System.out.println("Luas Lingkaran     : phi*r*r = ");
        System.out.println(phi+"*"+r+"*"+r+" = "+hitungLuas());
        System.out.println(" ");
        System.out.println("Keliling Lingkaran : 2*phi*r = ");
        System.out.println(2+"*"+phi+"*"+r+" = "+hitungKeliling());
    }
}