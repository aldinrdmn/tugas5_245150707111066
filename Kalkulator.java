import java.util.Scanner;

public class Kalkulator
{
   public static int penjumlahan(int a, int b)
   {
    return a+b;
   }

   public static int pengurangan(int a, int b)
   {
    return a-b;
   }

   public int perkalian(int a, int b)
   {
    return a*b;
   }

   public double pembagian(int a, int b)
   {
    if(b == 0)
    {
        System.out.println("Pembagian tidak dapat dibagi dengan 0");
    }
    return (double)a/b;
   }

    public void sederhana(int pembilang, int penyebut) {
    int gcd = cariFPB(pembilang, penyebut);
    pembilang /= gcd;
    penyebut /= gcd;
    System.out.println("Hasil penyederhanaan: " + pembilang + "/" + penyebut);
    }

    private int cariFPB(int a, int b) {
    if (b == 0) return a;
    return cariFPB(b, a % b);
    }

       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Kalkulator k = new Kalkulator();

        System.out.println("=== Kalkulator Sederhana ===");
        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();

        System.out.println("Penjumlahan: " + penjumlahan(a, b));
        System.out.println("Pengurangan: " + pengurangan(a, b));
        System.out.println("Perkalian: " + k.perkalian(a, b));
        System.out.println("Pembagian: " + k.pembagian(a, b));

        System.out.println("\n=== Penyederhanaan Pecahan ===");
        System.out.print("Masukkan pembilang: ");
        int pembilang = input.nextInt();
        System.out.print("Masukkan penyebut: ");
        int penyebut = input.nextInt();
        k.sederhana(pembilang, penyebut);
    }
}