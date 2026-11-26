package pertemuan_7;
import java.util.Scanner;

public class Sumpah_Pemuda{
     public Sumpah_Pemuda(){
        System.out.println("Kami Putra dan Putri Indonesia");
    }
    public void Tampilkan(){
        System.out.println("Satu, Kami Putra dan Putri Indonesia, mengaku bertumpah darah yang satu, Tanah air Indonesia");
        System.out.println("Dua, Kami Putra dan Putri Indonesia, mengaku berbangsa yang satu , bangsa Indoensia");
        System.out.println("Tiga, Kami Putra dan Putri Indonesia, menjunjung bahasa persatuan, bahasa Indonesia");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Sumpah_Pemuda sp = new Sumpah_Pemuda();
        
        sp.Tampilkan();
    }
}

