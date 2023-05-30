
package recursive.prime;

import java.util.Scanner;

public class RecursivePrime {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        boolean asalMi = asalKontrol(sayi);

        if (asalMi) {
            System.out.println(sayi + " bir asal sayıdır.");
        } else {
            System.out.println(sayi + " bir asal sayı değildir.");
        }

    }
    
    public static boolean asalKontrol(int sayi) {
        if (sayi <= 1) {
            return false;
        }
        
        return asalKontrol(sayi, sayi - 1);
    }

    private static boolean asalKontrol(int sayi, int bolen) {
        if (bolen == 1) {
            return true;
        }

        if (sayi % bolen == 0) {
            return false;
        }

        return asalKontrol(sayi, bolen - 1);
    }
    
}
