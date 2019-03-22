package ulangan;
import java.util.Scanner;
public class pts {

    public static void main(String[] args) {
           int menu;
           int jumlah, jumlah1, jumlah2 ;
           String loop,pilihBarang="";
           int total = 0;
           int hasil;
           int diskon = 0;          
           /* Variabel harga jual */
           int camera = 1500000;
           int printer = 800000;
           int laptop = 7200000;

           
           System.out.println("========================================");
           System.out.println("                   KASIR                ");
           System.out.println("========================================");
           System.out.println("              *Pilih barang*              ");
           System.out.println("_________________________________________");
           System.out.println("|            1. camera digital          |");
           System.out.println("|            2. laptop Asus             |" );
           System.out.println("|            3. Printer canon           |");
           System.out.println("_________________________________________");

           Scanner scan = new Scanner(System.in);
           
           for (loop = "Y"; loop.equals ("Y") || loop.equals ("y"); ) {
           System.out.println("Plih barang 1-3!");
           menu = scan.nextInt();
           switch (menu) {
               case 1: 
                   System.out.println("Anda Memilih Camera digital: Rp.1.500.000,-");
                   System.out.print("Jumlah pesanan               : ");
                   jumlah = scan.nextInt();
                   pilihBarang = jumlah+" camera digital, ";
                   hasil = camera*jumlah;
                   System.out.println("Total : Rp." + hasil);
                   
                   if (hasil >= 2000000)
                       diskon = hasil*10/100;
                   total = hasil - diskon;
                   System.out.println("Anda mendapat potongan Rp." + diskon + " Anda cukup membayar Rp." + total);
                   
                   break;
               case 2:
                   System.out.println("Anda Memilih laptop        : Rp.7200000,-");
                   System.out.print("Jumlah pesanan               : ");
                   jumlah = scan.nextInt();
                   pilihBarang = jumlah+" laptop, ";
                   hasil = laptop*jumlah;
                   System.out.println("Total : Rp." + hasil);
                   
                   if (hasil >= 2000000)
                       diskon = hasil*10/100;
                   total = hasil - diskon;
                   System.out.println("Anda mendapat potongan Rp." + diskon + " Anda cukup membayar Rp." + total);
                   break;
               case 3:
                   System.out.println("Anda Memilih printer       : Rp.800.000,-");
                   System.out.print("Jumlah pesanan               : ");
                   jumlah = scan.nextInt();
                   pilihBarang = jumlah+" printer, ";
                   hasil = printer*jumlah;
                   System.out.println("Total : Rp." + hasil);
                   
                   if (hasil >= 2000000)
                       diskon = hasil* 10/100;
                   total = hasil - diskon;
                   System.out.println("Anda mendapat potongan Rp." + diskon + " Anda cukup membayar Rp." + total);
                   break;
               default: 
                   System.out.println(" Error ");     
           }
           
  
           System.out.println("Apakah mau lanjut pesan? (Y/N) :");
           loop = scan.next();
               
           System.out.println("barang yang anda pesan adalah      : " + pilihBarang);
           System.out.println("Total keseluruhan Harga Barang   : Rp." + total);
    
    }
 }
}