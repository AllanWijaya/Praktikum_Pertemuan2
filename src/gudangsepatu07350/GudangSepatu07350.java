package gudangsepatu07350;
import Process07350.*;
import java.util.Scanner;
public class GudangSepatu07350 {
    private static proses07350 tes07350 = new proses07350();
    private static Scanner input07350 = new Scanner(System.in);
    public static void main(String[] args) {
        int pilmenu07350;
        do{
            System.out.println("=====DATA GUDANG SEPATU=====");
            System.out.println("1. Tambahkan Data Sepatu");
            System.out.println("2. Hapus Data Sepatu");
            System.out.println("3. Ubah Data Sepatu");
            System.out.println("4. Lihat Seluruh Data Sepatu");
            System.out.println("5. Lihat Salah Satu Data Sepatu");
            System.out.println("0. Exit");
            System.out.print("Inputkan menu : ");
            pilmenu07350=input07350.nextInt();
            input07350.nextLine();
            switch(pilmenu07350){
                case 1:
                    masuk07350();
                    break;
                case 2:
                    tes07350.delete07350();
                    break;
                case 3:
                    tes07350.update07350();
                    break;
                case 4:
                    tes07350.view07350();
                    break;
                case 5:
                    salahsatu07350();
                case 0:
                    break;
                default:
                    System.err.println("Inputan Salah");
                    break;
            }
        }while(pilmenu07350!=0);
    }
    static void masuk07350(){
        System.out.print("Masukkan Kode Barang    : ");
        String newKode07350 = input07350.nextLine();
        System.out.print("Masukkan Nama Merek     : ");
        String newMerek07350 = input07350.nextLine();
        System.out.print("Masukkan Jenis Sepatu   : ");
        String newJenis07350 = input07350.nextLine();
        System.out.print("Masukkan Warna Sepatu   : ");
        String newWarna07350 = input07350.nextLine();
        tes07350.insertSepatu07350(newKode07350,newMerek07350,newJenis07350,newWarna07350);
        System.out.println();
    }
    static void salahsatu07350(){
        System.out.print("Masukkan kode barang sepatu yang akan dicari : ");
        String kode07350=input07350.next();
        tes07350.cariKode07350(kode07350);
        tes07350.view07350(kode07350);
    }
}
