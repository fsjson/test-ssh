
import java.util.Scanner; 

public class Kali {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Masukan Nilai a
        System.out.print("Masukkan nilai a: ");
        int a = scan.nextInt();

        // Masukan Nilai b
        System.out.print("Masukkan nilai b: ");
        int b = scan.nextInt();

        // Jika a atau b bernilai 0, langsung masuk ke blok else
        if (a == 0 || b == 0) {
            System.out.println("Dadah");
        } else {
            // hitung
            int hitung = a * b;
            System.out.println("Hasil hitungan perkalian = " + hitung);
        }
    }
}
