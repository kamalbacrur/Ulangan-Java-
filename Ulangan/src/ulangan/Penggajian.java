package ulangan;
import java.util.Scanner;
public class Penggajian {
    public static void main(String[] args) {
        String NamaKaryawan;
        int gajiPokok;
        int lembur, gamasuk;
        int hasil;
        int pilihKaryawan;
        int operasi;
        
        
        Scanner keyboard = new Scanner(System.in);
        
        
        System.out.println("====================================");
        System.out.println("        HITUNG GAJI PT.AIUE         ");
        System.out.println("====================================");
        
        System.out.print("Nama karyawan: ");
        NamaKaryawan= keyboard.nextLine();
        System.out.println("Silahkan pilih SHIFT karyawan");
        System.out.println("1. Shift pagi");
        System.out.println("2. Shift malam");
        System.out.println("3. Freelance");
        System.out.println("Pilih no 1-3!");
        pilihKaryawan = keyboard.nextInt();
        
        switch (pilihKaryawan) {
            case 1 :
                System.out.println("Karyawan Shift pagi");          
                break;
            case 2 :
                System.out.println("Karyawan Shift Malam"); 
                break;
            case 3 :
                System.out.println("Karyawan Freelance");
                break;
            default :
                System.out.println("Error");
        }
        System.out.println("==================================");
        System.out.println("Untuk karyawan Shift Pagi gaji pokok Rp. 4.000.000/bulan");
        System.out.println("Untuk karyawan Shift Malam gaji pokok Rp. 5.000.000/bulan");
        System.out.println("Untuk karyawan Freelance pokok Rp. 3.000.000/2 bulan");
        System.out.println("==================================");
        System.out.print("Masukan gaji karyawan Rp.");
        gajiPokok = keyboard.nextInt();
        
            System.out.print("berapa kali karyawan lembur         : ");
            lembur = keyboard.nextInt();
            System.out.print("Berapa kali karyawan tidak masuk    : ");
            gamasuk = keyboard.nextInt();
            System.out.println("");
            
        hasil = gajiPokok + (lembur*100000) -(gamasuk*200000);
        System.out.println("Karyawan atas nama " + NamaKaryawan + " mendapatkan gaji keseluruhan: Rp." + hasil + ",-");
    }
    
}
