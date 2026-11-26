package pertemuan_7;

import java.util.Scanner;

class Hitung{
    double p;
    double l;
    
    double getKeliling(){
        double hasil = 2 * (p + l);
        return hasil;
    }
}

public class PersegiPanjang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Hitung h1 = new Hitung();
        h1.p = 12;
        h1.l = 6;
        System.out.println("Keliling Persegi Panjang adalah: " + h1.getKeliling());
        
    }
}
