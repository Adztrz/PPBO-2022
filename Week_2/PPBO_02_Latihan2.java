// Nama : Aditia Prasetya Nugraha
// NIM  : M0521004
    public class PPBO_02_Latihan2 {
        public static final int KURS_DOLLAR = 15000;
        public static final double PI = 3.14;
        public static final String NAMA = "Squidward";
        public static void main(String args[]) {
            KURS_DOLLAR = 13500;
            System.out.println(KURS_DOLLAR);
            System.out.println(PI);
            System.out.println(NAMA);
        }
    }
// Apa yang salah dengan source code tersebut?
// Jawaban : Tidak bisa memberikan value ke variabel final "KURS_DOLLAR", karena sudah merupakan konstanta.
// Apa maksud penggunaan keyword static sebelum keyword final pada deklarasi variabel tersebut?
// Jawaban : Penggunaan keyword static memungkinkan untuk variable diakses langsung tanpa membuat object terlebih
//           dahulu.
}
