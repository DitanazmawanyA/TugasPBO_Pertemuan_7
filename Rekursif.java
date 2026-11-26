package pertemuan_7;

public class Rekursif {
    static void hitung(int angka){
        if(angka > 0){
            System.out.println(angka);
            hitung(angka-1);
        }
    }
    public static void main(String[] args) {
        hitung(5);
    }
}
