package pertemuan_7;

import java.util.Scanner;

public class Mahasiswa_ {

    String nama;
    String npm;
    String kelas;

    public Mahasiswa_(String nama, String npm, String kelas) {
        this.nama = nama;
        this.npm = npm;
        this.kelas = kelas;
    }

    public void TampilkanData() {
        System.out.println("\n=== DATA MAHASISWA ===");
        System.out.println("Nama  : " + this.nama);
        System.out.println("NPM   : " + this.npm);
        System.out.println("Kelas : " + this.kelas);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama : ");
        String nama = input.nextLine();

        System.out.print("Masukkan NPM : ");
        String npm = input.nextLine();

        System.out.print("Masukkan kelas : ");
        String kelas = input.nextLine();

        Mahasiswa_ mhs = new Mahasiswa_(nama, npm, kelas);

        mhs.TampilkanData();
    }
}