package ulangan;
import java.util.Scanner;
public class PtsJawab {
    public static void main(String[] args) {
        int total ;
        int mkn_rngn;
        int jmlh_pesanan;
        int harga;
        int hasil = 0;
        int diskon = 0,diskon1,diskon2;
        int pilihan;
        int Beef = 400000;
        int oq = 350000;
        int foie = 300000;
        int crois = 250000;
        int creme = 100000;
        int kir= 75000;
        int citron = 90000;
        
        
        Scanner out = new Scanner(System.in);
        System.out.println("============================================");
        System.out.println("                Paris Cafe                  ");
        System.out.println("============================================");
        System.out.println("               *Pilih menu*                 ");
        System.out.println("               1. Beef Burguignon");
        System.out.println("               2. Coq au Vin");
        System.out.println("               3. Foie Gras");
        System.out.println("--------------------------------------------");
        System.out.println("               4. Croissant");
        System.out.println("               5. Crème Brulee");
        System.out.println("--------------------------------------------");
        System.out.println("               6. Kir Royale");
        System.out.println("               7. Citron Presse.");
        System.out.print("Pilihan makananan diatas!(klik 1-7): ");
        System.out.println("");
        pilihan = out.nextInt();
        
        switch (pilihan) {
            case 1: 
                System.out.println("Anda memilih Beef Burguignon : Rp.400.000");
                System.out.print("Jumlah pesanan Anda      : " );
                jmlh_pesanan = out.nextInt();
                hasil = jmlh_pesanan*Beef;
                
                if (hasil >= 0) {
                    diskon2 = 50000;
                    diskon = hasil- diskon2;
                } else {
                    diskon = 0;
                }
                break;
            case 2: 
                System.out.println("Anda memilih Coq au Vin : Rp.350.000");
                System.out.print("Jumlah pesanan Anda      : " );
                jmlh_pesanan = out.nextInt();
                hasil = jmlh_pesanan*oq;
                
                if (hasil >= 0) {
                    diskon2 = 50000;
                    diskon = hasil- diskon2;
                } else {
                    diskon = 0;
                }
                break;
            case 3: 
                System.out.println("Anda memilih Foie Gras : Rp.300.000");
                System.out.print("Jumlah pesanan Anda      : " );
                jmlh_pesanan = out.nextInt();
                hasil = jmlh_pesanan*foie;
                
                if (hasil <= 0) {
                    diskon2 = 50000;
                    diskon = hasil- diskon2;
                } else {
                    diskon = 0;
                }
                break;
            case 4: 
                System.out.println("Anda memilih Croissant : Rp.250.000");
                System.out.print("Jumlah pesanan Anda      : " );
                jmlh_pesanan = out.nextInt();
                hasil = jmlh_pesanan*crois;
                
                if (hasil >= 0) {
                    diskon1 = 10000;
                    diskon = hasil- diskon1;
                } else {
                    diskon = 0;
                }
                break;
            case 5: 
                System.out.println("Anda memilih Crème Brulee : Rp.100.000");
                System.out.print("Jumlah pesanan Anda      : " );
                jmlh_pesanan = out.nextInt();
                hasil = jmlh_pesanan*creme;
                
                if (hasil >= 0) {
                    diskon1 = 10000;
                    diskon = hasil- diskon1;
                } else {
                    diskon = 0;
                }
                break;
                
            case 6: 
                System.out.println("Anda memilih Kir Royale : Rp.75.000");
                System.out.print("Jumlah pesanan Anda      : " );
                jmlh_pesanan = out.nextInt();
                hasil = jmlh_pesanan*kir;
                
                if (hasil >= 0) {
                    diskon1 = 10000;
                    diskon = hasil- diskon1;
                } else {
                    diskon = 0;
                }
                break;
            case 7: 
                System.out.println("Anda memilih Citron Presse : Rp.90.000");
                System.out.print("Jumlah pesanan Anda      : " );
                jmlh_pesanan = out.nextInt();
                hasil = jmlh_pesanan*citron;
                
                if (hasil >= 0) {
                    diskon1 = 10000;
                    diskon = hasil- diskon1;
                } else {
                     
                }
                break;
            default: 
                System.out.println("Error");
        }
        System.out.println("harga :Rp." + hasil);
        System.out.println("bayar tunai :Rp." + diskon);
        
    
    }
}
