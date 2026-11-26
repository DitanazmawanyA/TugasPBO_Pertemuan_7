package pertemuan_7;

import java.util.Scanner;

public class Mahasiswa {
    /* Penjelasan Mekanisme sebuah Class mnejadi Objek:
    Mekanisme sebuah Class menjadi Objek dimulai dari pembuatan class yang berfungsi sebagi cetakan atau rancangan untuk objek.
    Didalam Class terdapat atribut yang menyimpan data dan method yang menentukan tindakan atau fungsi yang dapat dilakukan objek.
    setelah Class dibuat objek dapat dibuat menggunakan kata kunci "new".
    */
    
    String nama;
    int umur;
    
    void tampilkanData(){
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Mahasiswa mhs = new Mahasiswa();
        
        mhs.nama = "Dita Nazmawany Alamsyah";
        mhs.umur = 19;
        
        mhs.tampilkanData();
    }
}
