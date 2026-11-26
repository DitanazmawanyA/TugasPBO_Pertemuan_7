package pertemuan_7;

class Civitas {
    String nama;
    String status;

    void tampilkanData() {
        System.out.println("Nama   : " + nama);
        System.out.println("Status : " + status);
    }
}

class Dosen extends Civitas {
}

class Mahasiswa extends Civitas {
}

class Staff extends Civitas {
}

public class FakultasTeknik {

    public static void main(String[] args) {

        Dosen dosen = new Dosen();
        dosen.nama = "Pak Budi";
        dosen.status = "Dosen";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.nama = "Dita";
        mahasiswa.status = "Mahasiswa";

        Staff staff = new Staff();
        staff.nama = "Bu Siti";
        staff.status = "Staff";

        System.out.println("=== CIVITAS AKADEMIKA FAKULTAS TEKNIK ===");

        System.out.println("\nData Dosen");
        dosen.tampilkanData();

        System.out.println("\nData Mahasiswa");
        mahasiswa.tampilkanData();

        System.out.println("\nData Staff");
        staff.tampilkanData();
    }
}
