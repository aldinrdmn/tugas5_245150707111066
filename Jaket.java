import java.util.Scanner;

class Jaket {
    private final int Harga_A = 100000;
    private final int Harga_B = 125000;
    private final int Harga_C = 150000;
    
    private final int Diskon_A = 95000;
    private final int Diskon_B = 120000;
    private final int Diskon_C = 160000;

    public void beliJaket(char tipe, int jumlah){
        int hargaPerItem = 0;
        int total = 0;

        switch(Character.toUpperCase(tipe)){
            case 'A':
            hargaPerItem = (jumlah>100) ? Diskon_A : Harga_A;
            total = hargaPerItem*jumlah;
            System.out.println("Total harga Jaket A: Rp "+ total);
            break;

            case 'B':
            hargaPerItem = (jumlah>100) ? Diskon_B : Harga_B;
            total = hargaPerItem*jumlah;
            System.out.println("Total harga Jaket B: Rp "+ total);
            break;

            case'C':
            hargaPerItem = (jumlah>100) ? Diskon_C : Harga_C;
            total = hargaPerItem*jumlah;
            System.out.println("Total harga Jaket C: Rp "+ total);
            break;
            
            default:
            System.out.println("Tipe Jaket tidak tersedia");
            break;
        }
    }

    public static void main(String[] args) {
        Scanner jamal = new Scanner(System.in);
        Jaket jaket = new Jaket();
        System.out.println("Jumlah Jaket yang dibeli: ");
        int jumlah = jamal.nextInt();
        System.out.println("Tipe Jaket yang dibeli: ");
        char tipe = jamal.next().charAt(0);
        jaket.beliJaket(tipe, jumlah);
    }
}
