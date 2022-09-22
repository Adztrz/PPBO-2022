// Nama : Aditia Prasetya Nugraha
// NIM  : M0521004
public class PPBO_02_Latihan3 {

static class Mahasiswa {
        String NIM, nama, alamat;
        char jenisKelamin;

    Mahasiswa(String NIM, String nama, char jenisKelamin, String alamat){
        this.NIM = NIM;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
    }

    void cetakData() {
        System.out.println("");
        System.out.println("Data Mahasiswa: ");
        System.out.println("NIM:            " + NIM);
        System.out.println("Nama:           " + nama);
        System.out.println("Jenis Kelamin:  " + jenisKelamin);
        System.out.println("Alamat:         " + alamat);
    }

        public static void main(String[] args) {
            Mahasiswa mhs = new Mahasiswa("M0501001", "Patrick Star", 'L', "Bikini Bottom");
            Mahasiswa mhs1 = new Mahasiswa("M0501002", "Spongebob", 'L', "Rock Bottom");

            mhs.cetakData();
            mhs1.cetakData();

        }
    }

// Buatlah constructor untuk menginisiasi nilai dari variabel
// nim, nama, jenisKelamin, alamat
}