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
public class DaftarGaji {
    private final Pegawai[] listPegawai;
    
    DaftarGaji(int pegawai){
        this.listPegawai=new Pegawai[pegawai];
        this.dtpegawai();
    }
    private void dtpegawai(){
        for(int i=0;i<this.listPegawai.length;i++){
            this.listPegawai[i]=new Pegawai(null, null, null);
        }
    }
    public void addPegawai(Pegawai pegawai){
        for(int i=0;i<this.listPegawai.length;i++){
            if(this.listPegawai[i].getNama()==null){
                this.listPegawai[i]=pegawai;
                break;
            }
        }
    }
    public void printSemuaGaji(){
        for (Pegawai gjpegawai : this.listPegawai)
            if (gjpegawai.getNama() != null){
        System.out.println("Nama Pegawai       : "+ gjpegawai.getNama());
        System.out.println("Besar Gaji Pegawai : "+ gjpegawai.getGaji());
            }
    }
    public static void main(String[] args) {

        Pegawai listpg1,listpg2,listpg3;
        listpg1=new Pegawai("2101","Ilham","Malang");
        listpg2=new Pegawai("2102","Lutfi","Malang");
        listpg3=new Pegawai("2103","Fian","Malang");
        listpg1.gaji=2000000;
        listpg2.gaji=1500000;
        listpg3.gaji=1000000;
        
        Dosen dsn=new Dosen("2001", "Syah", "Malang");
        dsn.TARIF_SKS=200000;
        dsn.setSKS(5);
        
        DaftarGaji gj = new DaftarGaji(3);
        gj.addPegawai(listpg1);
        gj.addPegawai(listpg2);
        gj.addPegawai(listpg3);
        gj.printSemuaGaji();
        System.out.println("Nama Dosen       : "+dsn.nama);
        System.out.println("Besar Gaji Dosen : "+dsn.getGaji());
    }
}