package ulangan;
import java.util.Scanner;
public class Kuliah {

    public static void main(String[] args) {
        int totalBayar, diskon, hargaBarang, hasil; 
        String Barang, NamaKasir, NamaPembeli;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("===============Selamat datang Di INDOAPRIL==============");
        System.out.println("");
        System.out.println("               Daftar Harga Barang INDOAPRIL            ");
        System.out.println("1.Sabun     = Rp.3000");
        System.out.println("2.Susu      = Rp.65000");
        System.out.println("3.Detergen  = Rp.40000");
        System.out.println("4.Sirup     = Rp.17000");
        System.out.println("");
        System.out.println("1. Jika membeli mencapai total bayar Rp100.000,- maka mendapatkan potogan Rp5000");
        System.out.println("2. Jika membeli mencapai total bayar Rp150.000,- maka mendapatkan potogan Rp15000");
        System.out.println("3. Jika membeli mencapai total bayar Rp200.000,- maka mendapatkan potogan Rp25000");
        System.out.println("========================================================");
        
        System.out.print("Masukan nama Pembeli: ");
        NamaPembeli = keyboard.nextLine();
        System.out.print("Masukan nama Kasir  : ");
        NamaKasir = keyboard.nextLine();
        System.out.print("Barang yang dibeli  : ");
        Barang = keyboard.nextLine();
        System.out.print("Harga bayar         : Rp.");
        totalBayar = keyboard.nextInt();
        
        
        if ((totalBayar >= 100000) && (totalBayar<= 150000)){
            diskon = 5000;
        } else if ((totalBayar >= 151000) && (totalBayar <= 200000)) {
            diskon = 15000;
        } else if (totalBayar >=201000) {
            diskon = 25000;
        } else {
            diskon= 0;
        }
        /* hitung Hasil keselurahan */
        hasil = totalBayar - diskon;
        
        /* Hitung hasil diskon */
        diskon = totalBayar - hasil;
        
        System.out.println("============================");
        System.out.println("Nama pembeli : " + NamaPembeli);
        System.out.println("Nama Kasir   : " + NamaKasir);
        System.out.println("Barang       : " + Barang);
        System.out.println("Total diskon Rp." + diskon );
        System.out.println("Total bayar Rp." + hasil );
    }
    
}
