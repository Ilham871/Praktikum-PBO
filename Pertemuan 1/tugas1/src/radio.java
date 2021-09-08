public class radio {
    private String merk;
    boolean power;

public void setMerk(String newValue){
    merk= newValue;
}  
public void powerOn(){
    power=true;
        System.out.println("Radio Hidup");
}
public void powerOff(){
    power=false;
        System.out.println("Radio mati");
}
public void cetakInformasi(){
    System.out.println("Merk :"+merk );
    System.out.println("Power :"+power);
}
}