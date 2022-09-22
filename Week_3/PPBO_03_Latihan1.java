// Nama : Aditia Prasetya Nugraha
// NIM  : M0521004
import java.util.Scanner;

public class PPBO_03_Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total pembelian : ");

        int diskon, dibayar;
        int nominal = sc.nextInt();

        if (nominal < 50000){
            diskon = 0;
            dibayar = nominal-diskon;
            System.out.println("Anda tidak mendapat diskon :(");
        }
        else if (nominal > 50000 && nominal <= 75000 ){
            System.out.println("Anda mendapat diskon sebesar    :5%");
            diskon = (nominal*5)/100;
            dibayar = nominal-diskon;
        }
        else if (nominal > 75000 && nominal <= 125000){
            System.out.println("Anda mendapat diskon sebesar     :15%");
            diskon = (nominal*15)/100;
            dibayar = nominal-diskon;
        }
        else{
            System.out.println("Anda mendapat diskon sebesar     :20%");
            diskon = (nominal*20)/100;
            dibayar = nominal-diskon;
        }

        System.out.println("Total yang harus dibayar         :"+"Rp" +dibayar);

        // tambahkan code untuk menyimpan nominal total pembelian
        // tambahkan code untuk mengimplementasikan ketentuan diskon yang ditetapkan

        // tambahkan code untuk menampilkan nominal yang harus dibayar 
        // sesuai dengan ketentuan diskon yang diberikan

        sc.close();
    }
}
// Seorang mahasiswa berbelanja di mini market. Mini market tersebut memberikan diskon kepada
// pembeli dengan ketentuan
// a. Diskon 0% jika total pembelian di bawah 50.000
// b. Diskon 5% jika total pembelian 50.000 hingga 75.000
// c. Diskon 15% jika total pembelian di atas 75.000 hingga 125.000
// d. Diskon 20% jika total pembelian di atas 125.000