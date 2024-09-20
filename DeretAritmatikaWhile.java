import java.util.Scanner;

public class DeretAritmatikaWhile {
    public static void main(String[] args) {
        int sukuPertama,batasAkhir,beda;
        Scanner input = new Scanner(System.in);
        
        // Meminta input dari pengguna
        System.out.print("Masukkan suku pertama: ");
        sukuPertama = input.nextInt();
        
        System.out.print("Masukkan beda (selisih antar suku): ");
        beda = input.nextInt();
        
        System.out.print("Masukkan batas akhir: ");
        batasAkhir = input.nextInt();

        // Menggunakan perulangan WHILE untuk menghitung deret
        System.out.println("\n\nDeret Aritmatika menggunakan WHILE: ");
        int i = sukuPertama;
        while (i <= batasAkhir) {
            System.out.print(i + " ");
            i += beda;
        }
    }
}