// Nama : Aditia Prasetya Nugraha
// NIM  : M0521004
class Person{
    public String name;
    public static int count=0;
    Person(String name){
        this.name = name;
        count++;
    }
}
public class PPBO_02_Latihan4 {
    public static void main(String[] args) {
        Person dummy1 = new Person("Terry");
        Person dummy2 = new Person("Larry");
        Person dummy3 = new Person("Merry");
        System.out.println( "Jumlah objek Person yang telah terbuat: "+Person.count);

        Person dummy4 = new Person("Jerry");
        System.out.println( "Jumlah objek Person yang telah terbuat: "+Person.count);
    }
}

// Lengkapi class Person supaya dapat menghitung jumlah objek yang telah dibuat dari class Person,
// Gunakan variable static dan constructor, serta tampilkan nilai tersebut pada baris print yang telah
// disediakan 

/* Output yang diharapkan:
    Jumlah objek Person yang telah terbuat: 3 
    Jumlah objek Person yang telah terbuat: 4
 */