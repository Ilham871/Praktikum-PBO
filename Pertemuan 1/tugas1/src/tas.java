public class tas {
    String jenis;
    String merk;
    
public void setJenis (String newValue){
    jenis=newValue;
}    
public void setMerk (String newValue){
    merk=newValue;
}
public void cetakInformasi(){
    System.out.println("Jenis :"+jenis );
    System.out.println("Merk :"+merk );
}
}