public class hp {
    private String merk;
    int volume;
    int maxVol=100;
    int minVol=0;
public void setMerk(String newValue){
    merk= newValue;
}  
public void volumeTambah(){
    if (this.volume == maxVol){
        System.out.println("Volume sekarang: "+this.volume+"%");
    } else{
        this.volume +=10;
        System.out.println("Volume sekarang: "+this.volume+"%");
    }
}
public void volumeKurang(){
    if (this.volume == minVol){
        System.out.println("Volume sekarang: "+this.volume+"%");
    } else{
        this.volume -=10;
        System.out.println("Volume sekarang: "+this.volume+"%");
    }
}
public void cetakInformasi(){
    System.out.println("Merk :"+merk );
    System.out.println("Volume default:"+volume );
}
}