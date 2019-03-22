package ulangan;
import java.util.Scanner;
public class Test {
 
/**
* @param args the command line arguments
*/
public static void main(String[] args) {
// TODO code application logic here
int tiket, pilihan, harga, total, harga_tkt;
Scanner scan = new Scanner(System.in);
Scanner input = new Scanner(System.in);
System.out.println("JENIS MASKAPAI");
System.out.println("1. Garuda Indonesia");
System.out.println("2. Citilink");
System.out.println("3. Lion Air");
 
System.out.println("Masukkan pilihan anda: ");
pilihan = scan.nextInt();
 
System.out.println("Jumlah Pembelian Tiket: ");
tiket = scan.nextInt();
 
if(pilihan == 1){
if(tiket >= 10){
harga = 700000;
}
else{
harga = 750000;
}
}

else if(pilihan == 2){
if(tiket >= 15){
harga = 600000;
}
else{
harga = 650000;
}
}

else{
if(tiket >= 20){
harga = 500000;
}
else{
harga = 550000;
}
}
harga_tkt = harga;
System.out.println("Harga Tiket @1 : Rp. "+harga_tkt);
total = harga*tiket;
System.out.println("Total Bayar : Rp. "+total);
}
 
}