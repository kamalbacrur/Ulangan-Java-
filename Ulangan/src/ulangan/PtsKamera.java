
package ulangan;
import java.util.Scanner;
public class PtsKamera {
    public static void main(String[] args) {
        String nama_pmbli;
        int total_harga; 
        int total_barang;
        int pilihan;
        int diskon;
        int barang;
        int harga_jual = 0;
               
        Scanner out = new Scanner(System.in);
        System.out.print("masukan nama pembeli: ");
        nama_pmbli = out.nextLine();
        System.out.println("nama barang");
        System.out.println("1. Camera digital : Rp.1500000");
        System.out.println("2. Laptop Asus    : Rp.7200000");
        System.out.println("3. Printer Canon  : Rp.800000");
        System.out.print("Masukan pilihan anda: ");
        pilihan = out.nextInt();
        switch (pilihan){
            case 1: 
                System.out.println("=======anda memilih camera=======");
                break;
            case 2:
                System.out.println("=======anda memilih laptop=======");
                break;
            case 3: 
                System.out.println("=======anda memilih printer=======");
                break;
            default: 
                System.out.println("error");
        }
        System.out.print("dengan harga :Rp.");
        harga_jual= out.nextInt();
        System.out.print("jumlah pembelian barang: ");
        total_barang = out.nextInt();
        diskon = 10/100;
        total_harga = harga_jual * diskon * total_barang;
        
        if (total_harga >= 2000000){
            diskon = total_harga* 10/100;
        } else {
            diskon = 0;
        }
        
        total_harga = harga_jual * diskon * total_barang;
        System.out.println("nama anda      : " + nama_pmbli);
        System.out.println("total barang   : " + total_barang);
        System.out.println("jumlah bayaran :Rp."+ total_harga);
    } 
}
