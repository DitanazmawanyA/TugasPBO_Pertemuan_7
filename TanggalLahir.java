package pertemuan_7;
import java.util.Scanner;

class TebakLahir{
    int bulan;
    int tanggal;
    
    public void isiData(int b, int t){
        bulan = b;
        tanggal = t;
    }
    
    public int hasil(){
        return (bulan * 100) + tanggal;
    }
}

public class TanggalLahir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        TebakLahir tl = new TebakLahir();
        
        System.out.print("Masukkan Bulan Lahir: ");
        int bulan = input.nextInt();
        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggal = input.nextInt();
        
        tl.isiData(bulan, tanggal);
        
        System.out.println("Hasil : " + tl.hasil());
    }
}
