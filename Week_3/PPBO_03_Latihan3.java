// Nama : Aditia Prasetya Nugraha
// NIM  : M0521004

public class PPBO_03_Latihan3 {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 3};
        for (int i = 0; i < 5; i++) {
            System.out.println("elemen ke-" + i + " = " + arr[i]);
        }
    }
}

// Berikut ini adalah code untuk menampilkan elemen (anggota) sebuah array yang berupa bilangan
// integer, mulai dari elemen pertama hingga terakhir.

// Eksekusi source code tersebut dan jelaskan apakah penulisan kode perulangan dengan for pada code
// tersebut sudah tepat dan tuliskan perbaikan apabila diperlukan!

// Jawab:
// Terjadi error saat running code, hal tersebut terjadi karena loop tersebut melakukan iterasi melebihi jumlah elemen dari array.
// Menurut saya, source code tersebut dapat di improve dengan memberi value "i=1" menjadi "i=0" karena pada java perhitungan elemen array
// berawal dari 0, dan merubah "i<6" menjadi "i<5" karena elemen dari array "arr" hanya berjumlah 5.
