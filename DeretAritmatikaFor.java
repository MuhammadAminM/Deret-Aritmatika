import java.util.Scanner;

public class DeretAritmatikaFor {
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
        
        // Menggunakan perulangan FOR untuk menghitung deret
        System.out.println("\nDeret Aritmatika menggunakan FOR: ");
        for (int i = sukuPertama; i <= batasAkhir; i += beda) {
            System.out.print(i + " ");
        }
    }
}
