package sistem_informasi_tabungan_pintar;

import java.util.ArrayList;
import java.util.Scanner;
public class Sistem_informasi_tabungan_pintar {

    static ArrayList<Muriasetya07194_DataPenggunaEntity> user = new ArrayList();
    static ArrayList<Muriasetya07194_DataTabunganEntity> datatabungan = new ArrayList();
    static Scanner muriasetya07194_input=new Scanner(System.in);
    public static void main(String[] args) {
       int muriasetya07194_pil;
        do{
        System.out.println("1. Daftar Akun ");
        System.out.println("2. Login ");
        System.out.println("3. Hapus data ");
        System.out.println("4. Update Email ");
        System.out.println("5. EXIT ");
        System.out.print("pilih = ");
         muriasetya07194_pil=muriasetya07194_input.nextInt();
        switch(muriasetya07194_pil){
            case 1:
                muriasetya07194_daftar();
                break;
            case 2:
                System.out.print("Email = ");
                String Muriasetya07194_Email=muriasetya07194_input.next();
                System.out.print("Password = ");
                String Muriasetya07194_Password=muriasetya07194_input.next();
                muriasetya07194_menuutama(Muriasetya07194_Email,Muriasetya07194_Password);              
                break;
            case 3: 
                System.out.print("Data sebelum dihapus \n");
                for (int a=0; a<user.size();a++){
                    System.out.println("Nama = "+user.get(a).getMuriasetya07194_Nama());
                    System.out.println("Target Menabung = "+datatabungan.get(a).getTarget());
                    System.out.println("Email = "+user.get(a).getMuriasetya07194_Email());
                    System.out.println(" ");
                }
                System.out.println("Nama yang dihapus");
                String Muriasetya07194_Nama=muriasetya07194_input.next();
                Muriasetya07194_hapusnama(Muriasetya07194_Nama);
                System.out.println(" ");
                System.out.println("Data sesudah dihapus \n");
                for (int a=0; a<user.size();a++){
                    System.out.println("Nama = "+user.get(a).getMuriasetya07194_Nama());
                    System.out.println("Target Menabung = "+datatabungan.get(a).getTarget());
                    System.out.println("Email = "+user.get(a).getMuriasetya07194_Email());
                    System.out.println(" ");
                }
                break;
            case 4:
                System.out.print("Data sebelum diupdate \n");
                for (int a=0; a<user.size();a++){
                    System.out.println("Nama = "+user.get(a).getMuriasetya07194_Nama());
                    System.out.println("Target Menabung = "+datatabungan.get(a).getTarget());
                    System.out.println("Email = "+user.get(a).getMuriasetya07194_Email());
                    System.out.println(" ");
                }
                System.out.print("Nama = ");
                String Muriasetya07194_Nama1=muriasetya07194_input.next();
                System.out.print("Masukan Email = ");
                String Muriasetya07194_Email1=muriasetya07194_input.next();
                Muriasetya07194_update(Muriasetya07194_Nama1,Muriasetya07194_Email1);
                System.out.print("Data setelah diupdate \n");
                for (int a=0; a<user.size();a++){
                    System.out.println("Nama = "+user.get(a).getMuriasetya07194_Nama());
                    System.out.println("Target Menabung = "+datatabungan.get(a).getTarget());
                    System.out.println("Email = "+user.get(a).getMuriasetya07194_Email());
                    System.out.println(" ");
                }
                break;
        }
        }while(muriasetya07194_pil!=5);
    }
    // MASUKKAN DATA --> CASE 1
    static void muriasetya07194_daftar(){
        System.out.print("Nama = ");
        String Muriasetya07194_Nama=muriasetya07194_input.next();
        System.out.print("Jenis Kelamin = ");
        String Muriasetya07194_JenisKelamin=muriasetya07194_input.next();
        System.out.print("Masukan Email = ");
        String Muriasetya07194_Email=muriasetya07194_input.next();
        System.out.print("Masukan Password = ");
        String Muriasetya07194_Password=muriasetya07194_input.next();
        user.add(new Muriasetya07194_DataPenggunaEntity(Muriasetya07194_Email,Muriasetya07194_Password,Muriasetya07194_JenisKelamin,Muriasetya07194_Nama));    
    }
    // UPDATE EMAIL --> CASE 4
    static void Muriasetya07194_update (String Muriasetya07194_Nama,String Muriasetya07194_Email){
        if (Muriasetya07194_carinama(Muriasetya07194_Nama)!=-1){
            user.get(Muriasetya07194_carinama(Muriasetya07194_Nama)).Muriasetya07194_Email=Muriasetya07194_Email;
        }
    }
    
    static int Muriasetya07194_carinama(String Muriasetya07194_Nama){
        int index = -1;
        for (int a=0; a<user.size(); a++){
            if (Muriasetya07194_Nama.equals(user.get(a).getMuriasetya07194_Nama())){
                index=a;
            }
        }
        return index;
    }
    // HAPUS NAMA --> CASE 3
    static void Muriasetya07194_hapusnama(String Muriasetya07194_Nama){
        user.remove(Muriasetya07194_carinama(Muriasetya07194_Nama));
    }
    // HITUNG TABUNGAN --> CASE 2
    static void muriasetya07194_menuutama(String Muriasetya07194_Email,String Muriasetya07194_Password){
        int Muriasetya07194_jangkawaktuterkumpul1,Muriasetya07194_jangkawaktuterkumpul2,Muriasetya07194_bulan,Muriasetya07194_kurang;
        for(int a=0;a<user.size();a++){
            if(Muriasetya07194_Email.equals(user.get(a).getMuriasetya07194_Email())&&Muriasetya07194_Password.equals(user.get(a).getMuriasetya07194_Password())){
                System.out.println("Nama = "+user.get(a).getMuriasetya07194_Nama());
                System.out.println("Jenis Kelamin = "+user.get(a).getMuriasetya07194_JenisKelamin());
                System.out.println("");
                System.out.print("Nominal menabung = ");
                int menabung=muriasetya07194_input.nextInt();
                System.out.print("Target Menabung = ");
                int target=muriasetya07194_input.nextInt();
                 if (target <=500000 && menabung <500000){
                    System.out.println("Anda disarankan untuk menabung Perhari untuk nomninal sebesar "+target);
                }else if(target >500000 && menabung <500000){
                    System.out.println("Anda disarankan untuk menabung Perhari untuk nomninal sebesar "+target);
                }else{
                     System.out.println("Anda Disarankan untuk menabung Perbulan untuk nominal sebesar "+target);
                 }
                System.out.print("Menabung perhari/perbulan\n"
                                + "1) Perhari\n"
                                + "2) Perbulan\n"
                                + "masukkan pilihan = ");
                int sekalamenabung=muriasetya07194_input.nextInt();
                Muriasetya07194_jangkawaktuterkumpul1=target/menabung;
                Muriasetya07194_jangkawaktuterkumpul2=target/menabung;
                switch (sekalamenabung){
                    case 1 :
                       if(target==Muriasetya07194_jangkawaktuterkumpul1*menabung && Muriasetya07194_jangkawaktuterkumpul1 <=30){
                        System.out.println(target+" akan terkumpul dalam jangka waktu "+Muriasetya07194_jangkawaktuterkumpul1+" hari\n");
                        Muriasetya07194_bulan = 0;
                        Muriasetya07194_kurang = 0;
                        Muriasetya07194_jangkawaktuterkumpul2 = 0;
                        datatabungan.add(new Muriasetya07194_DataTabunganEntity(Muriasetya07194_jangkawaktuterkumpul1,Muriasetya07194_jangkawaktuterkumpul2,Muriasetya07194_bulan,Muriasetya07194_kurang,target,menabung,sekalamenabung));
                    }else if (target==Muriasetya07194_jangkawaktuterkumpul1*menabung && Muriasetya07194_jangkawaktuterkumpul1 >30 && Muriasetya07194_jangkawaktuterkumpul1 <365){
                        Muriasetya07194_jangkawaktuterkumpul1 = Muriasetya07194_jangkawaktuterkumpul1/30;
                        System.out.println(target+" akan terkumpul dalam jangka waktu "+Muriasetya07194_jangkawaktuterkumpul1+" bulan\n");
                        Muriasetya07194_bulan = 0;
                        Muriasetya07194_kurang = 0;
                        Muriasetya07194_jangkawaktuterkumpul2 = 0;
                        datatabungan.add(new Muriasetya07194_DataTabunganEntity(Muriasetya07194_jangkawaktuterkumpul1,Muriasetya07194_jangkawaktuterkumpul2,Muriasetya07194_bulan,Muriasetya07194_kurang,target,menabung,sekalamenabung));
                    }else if (target==Muriasetya07194_jangkawaktuterkumpul1*menabung && Muriasetya07194_jangkawaktuterkumpul1 >365){
                        Muriasetya07194_jangkawaktuterkumpul2 = Muriasetya07194_jangkawaktuterkumpul1/365;
                        Muriasetya07194_bulan = (Muriasetya07194_jangkawaktuterkumpul1-365)/30;
                        System.out.println(target+" akan terkumpul dalam jangka waktu "+Muriasetya07194_jangkawaktuterkumpul2+" tahun "+ Muriasetya07194_bulan+" bulan\n");
                        Muriasetya07194_kurang = 0;
                        datatabungan.add(new Muriasetya07194_DataTabunganEntity(Muriasetya07194_jangkawaktuterkumpul1,Muriasetya07194_jangkawaktuterkumpul2,Muriasetya07194_bulan,Muriasetya07194_kurang,target,menabung,sekalamenabung));
                    }
                    break;
                    case 2 :
                        Muriasetya07194_jangkawaktuterkumpul2=Muriasetya07194_jangkawaktuterkumpul1/12;
                        if(Muriasetya07194_jangkawaktuterkumpul1==Muriasetya07194_jangkawaktuterkumpul2*12){
                        System.out.println(target+" akan terkumpul dalam jangka waktu "+Muriasetya07194_jangkawaktuterkumpul2+" tahun\n");
                        Muriasetya07194_bulan = 0;
                        Muriasetya07194_kurang = 0;
                        datatabungan.add(new Muriasetya07194_DataTabunganEntity(Muriasetya07194_jangkawaktuterkumpul1,Muriasetya07194_jangkawaktuterkumpul2,Muriasetya07194_bulan,Muriasetya07194_kurang,target,menabung,sekalamenabung));
                    }else{
                        Muriasetya07194_bulan=Muriasetya07194_jangkawaktuterkumpul1-(Muriasetya07194_jangkawaktuterkumpul2*12);
                        Muriasetya07194_kurang = 0;
                        datatabungan.add(new Muriasetya07194_DataTabunganEntity(Muriasetya07194_jangkawaktuterkumpul1,Muriasetya07194_jangkawaktuterkumpul2,Muriasetya07194_bulan,Muriasetya07194_kurang,target,menabung,sekalamenabung));
                        if(target==Muriasetya07194_jangkawaktuterkumpul1*menabung&&Muriasetya07194_jangkawaktuterkumpul1>12){
                            System.out.println(target+" akan terkumpul dalam jangka waktu "+Muriasetya07194_jangkawaktuterkumpul2+" tahun "+Muriasetya07194_bulan+" bulan\n");
                            datatabungan.add(new Muriasetya07194_DataTabunganEntity(Muriasetya07194_jangkawaktuterkumpul1,Muriasetya07194_jangkawaktuterkumpul2,Muriasetya07194_bulan,Muriasetya07194_kurang,target,menabung,sekalamenabung));
                        }else if(Muriasetya07194_jangkawaktuterkumpul1<12){
                             System.out.println(target+" akan terkumpul dalam jangka waktu "+Muriasetya07194_jangkawaktuterkumpul1+" bulan\n");
                             datatabungan.add(new Muriasetya07194_DataTabunganEntity(Muriasetya07194_jangkawaktuterkumpul1,Muriasetya07194_jangkawaktuterkumpul2,Muriasetya07194_bulan,Muriasetya07194_kurang,target,menabung,sekalamenabung));
                        }else{
                            Muriasetya07194_kurang=target-(Muriasetya07194_jangkawaktuterkumpul1*menabung);
                            System.out.println(target+" akan terkumpul dalam jangka waktu "+Muriasetya07194_jangkawaktuterkumpul2+" tahun "+Muriasetya07194_bulan+" bulan\n");
                            System.out.println("Dengan catatan dibulan terakhir, menabung "+Muriasetya07194_kurang+menabung);
                            datatabungan.add(new Muriasetya07194_DataTabunganEntity(Muriasetya07194_jangkawaktuterkumpul1,Muriasetya07194_jangkawaktuterkumpul2,Muriasetya07194_bulan,Muriasetya07194_kurang,target,menabung,sekalamenabung));
                        }
                    }
                }
                break;
            }else{
                System.out.println("Email atau Password Salah");
            }
        }
    }
}


