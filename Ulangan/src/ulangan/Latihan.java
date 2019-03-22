package ulangan;
import java.util.Scanner;
public class Latihan {

    public static void main(String[] args) {
        int pilihan;
        int jumlah_tiket;
        int harga = 0;
        int total;
        String nama;
        String tanggal;
        
        Scanner out = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("        AdiPratam Travel       ");
        System.out.println("===============================");
        System.out.println("Jenis maskapai");
        System.out.println("1. Garuda Indonesia");
        System.out.println("2. Citilink");
        System.out.println("3. Lion Air");
        System.out.print("Masukan pilihan anda : ");
        pilihan = out.nextInt();
        
        switch (pilihan) {
            case 1 : 
                harga = 700000;
                break;
            case 2 : 
                harga = 600000;
                break;
            case 3 : 
                harga = 500000;
                break;
            default :
                System.out.println("error");
        }
        System.out.print("Jumlah pembelian tiket : ");
        jumlah_tiket = out.nextInt();
        
        total = harga * jumlah_tiket;
           
        System.out.println("Harga yang harus dibayar : "+ total);
    }
    
}
