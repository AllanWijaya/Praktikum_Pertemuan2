package Process07350;
import Entity07350.*;
import java.util.Scanner;
public class proses07350 implements Interface07350 {
    private static sepatu07350[] shoes07350 = new sepatu07350[50];
    private static Scanner input07350 = new Scanner(System.in);
    public static int jumSepatu07350 = 0;  
    public void insertSepatu07350(String kode07350,String merek07350, String jenis07350, String warna07350){
        shoes07350[jumSepatu07350] = new sepatu07350(kode07350,merek07350,jenis07350,warna07350);
        jumSepatu07350++;
    }
    public void view07350(){
        if(jumSepatu07350==0){
            System.err.println("Data Kosong!!!");
        }
        else{
            for(int i=0;i<jumSepatu07350;i++)
            {
                System.out.println("==============================================");
                System.out.println("Kode Barang : "+shoes07350[i].getKode07350());
                System.out.println("==============================================");
                System.out.println("Merek       : "+shoes07350[i].getMerek07350());
                System.out.println("Jenis       : "+shoes07350[i].getJenis07350());
                System.out.println("Warna       : "+shoes07350[i].getWarna07350());
                System.out.println("==============================================");
            }
        }
    }
    public int cariKode07350(String kode07350){
        int loop07350=0;
        for(sepatu07350 proses07350 : shoes07350){
            if(proses07350.getKode07350().equals(kode07350)){
                break;
            }
            else{
                loop07350++;
            }
        }
        return loop07350;
    }
    public void view07350(String kode07350){
        int cari07350=cariKode07350(kode07350);
        System.out.println("==============================================");
        System.out.println("Kode Barang : "+shoes07350[cari07350].getKode07350());
        System.out.println("==============================================");
        System.out.println("Merek       : "+shoes07350[cari07350].getMerek07350());
        System.out.println("Jenis       : "+shoes07350[cari07350].getJenis07350());
        System.out.println("Warna       : "+shoes07350[cari07350].getWarna07350());
        System.out.println("==============================================");      
    }
    public void update07350(){
        System.out.print("Masukkan kode barang yang akan mau diubah : ");
        String cari07350=input07350.next();
        int tes07350=0;
        do{
            if(tes07350==jumSepatu07350){
            System.err.println("Data Kosong!!!");
            }
            
            else if(shoes07350[tes07350].getKode07350().equals(cari07350)){
            int menu07350;
            do{
                System.out.println("1. Lihat Daftar Barang");
                System.out.println("2. Ubah Merek Barang");
                System.out.println("3. Ubah Jenis Barang");
                System.out.println("4. Ubah Warna Barang");
                System.out.println("0. Exit");
                System.out.print("Input menu : ");
                menu07350=input07350.nextInt();
                
                switch(menu07350){
                    case 1:
                        view07350(cari07350);
                        break;
                    case 2:
                        System.out.print("Inputkan Merek baru : ");
                        String editMerek07350 = input07350.next();
                        editMerek07350 += input07350.nextLine();
                        shoes07350[tes07350].setMerek07350(editMerek07350);
                        break;
                    case 3:
                        System.out.print("Inputkan Jenis baru : ");
                        String editJenis07350 = input07350.nextLine();
                        shoes07350[tes07350].setJenis07350(editJenis07350);
                        break;
                    case 4:
                        System.out.print("Inputkan Warna baru : ");
                        String editWarna07350 = input07350.nextLine();
                        shoes07350[tes07350].setWarna07350(editWarna07350);
                        break;
                    case 0:
                        break;    
                }
            }while(menu07350!=0);
            }
            else{
                tes07350++;
            }
            break;
        }while(jumSepatu07350!=0);
        
            
    }
    public void delete07350(){
        System.out.print("Masukkan kode barang sepatu yang akan dihapus : ");
        String search = input07350.next();
        int cari07350 = 0;
        do{
            if(cari07350 == jumSepatu07350){
                System.err.println("Tidak ada data!");
                break;
            }else if(shoes07350[cari07350].getKode07350().equals(search)){
                if(cari07350==jumSepatu07350-1){
                    jumSepatu07350--;
                }else{
                    for(int i=cari07350;i<jumSepatu07350;i++){
                        shoes07350[i]=shoes07350[i+1];
                    }
                    jumSepatu07350--;
                }
                break;
            }else{
                cari07350++;
            }
        }while(true);
    }
}