import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        int angka,temp=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Angka :");
        angka = input.nextInt();

        for(int i=angka; i>=1; i--){
            System.out.print(i+" x ");
            temp *= i;
        }
        System.out.println();
        System.out.println("Total Faktorial = "+temp);
    }
    
}
