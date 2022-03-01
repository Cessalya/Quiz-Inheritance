/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class gaji extends pegawai{
    double nomorpegawai;
    String nama;
    String Jeniskelamin;
    private double gaji;
    
    public void setnama (String nama){
        this.nama=nama;
    }
    public void setgaji(double gaji){
        this.gaji=gaji;
    }
    public void Cetak(){
        super.absen1();
        System.out.println("nama = "+super.nama);
        System.out.println("jenis kelamin = "+super.jeniskelamin);
        System.out.println("nomor pegawai "+super.nomorpegawai);
        super.absen2();  
    }
    public void gaji (){
        float gaji=1200000;
        System.out.println("gaji utama yang didapat "+gaji);
    }
    public void bonusgaji(){
        float bonusgaji=2400000;
        System.out.println("gaji yang didapat jika bekerja secara baik menjadi "+bonusgaji);
    }        
  
}
