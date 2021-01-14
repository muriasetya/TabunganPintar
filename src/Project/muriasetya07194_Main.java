package Project;

import Controller.*;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import View.*;

public class muriasetya07194_Main {

    // private Scanner input = new Scanner(System.in);
    // private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    // private Calendar tgl = Calendar.getInstance();
    // private muriasetya07194_PenggunaController usercontroller = new muriasetya07194_PenggunaController();

    public static void main(String[] args) {
       
        muriasetya07194_GUI gui = new muriasetya07194_GUI();
        gui.setVisible(true);
        
        // muriasetya07194_Main Data = new muriasetya07194_Main();
        // int pil;
        // do {
        //     System.out.println("1.Daftar Akun");
        //     System.out.println("2.Login");
        //     System.out.println("3.hapus Data");
        //     System.out.println("4.Update Data");
        //     System.out.println("5.View");
        //     System.out.println("6.Exit");
        //     System.out.print("Pilih = ");
        //     pil = Data.input.nextInt();
        //     switch (pil) {
        //         case 1:
        //             Data.daftar();
        //             break;
        //         case 2:
        //         System.out.print("Password = ");
        //         String muriasetya07194_Password = Data.input.next();
        //         System.out.print("NPM = ");
        //         String npm = Data.input.next();
        //         Data.login(muriasetya07194_Password,npm);
        //         break;
        //         case 3:
        //             System.out.print("Nama Yang Dihapus = ");
        //             String muriasetya07194_nama1 = Data.input.next();
        //             int status1 = Data.usercontroller.hapusnama(muriasetya07194_nama1);
        //             Data.cekStatus(status1);
        //             break;
        //         case 4:
        //             System.out.print("Nama = ");
        //             String muriasetya07194_Nama = Data.input.next();
        //             System.out.print("Password Baru = ");
        //             String muriasetya07194_Password2 = Data.input.next();
        //             int status = Data.usercontroller.update(muriasetya07194_Nama,muriasetya07194_Password2);
        //             Data.cekStatus(status);
        //             break;
        //         case 5:
        //         Data.view();
        //     }
        // } while (pil != 6);
    }

    // void login(String muriasetya07194_Password,String npm) {
    //     int muriasetya07194_jangkawaktuterkumpul1;
    //     int muriasetya07194_CekDataPengguna = usercontroller.login(muriasetya07194_Password,npm);
    //     if (muriasetya07194_CekDataPengguna == -1 || muriasetya07194_CekDataPengguna == -2) {
    //         System.out.println("Password atau Email Salah");
    //     } else {
    //         System.out.print("Target Menabung = ");
    //         int muriasetya07194_target = input.nextInt();
    //         System.out.print("Nominal menabung = ");
    //         int muriasetya07194_menabung = input.nextInt();
    //         if (muriasetya07194_target <= 500000 && muriasetya07194_menabung < 500000) {
    //             System.out.println("Anda disarankan menabung perhari untuk nominal sebesar " + muriasetya07194_target);
    //         } else if (muriasetya07194_target > 500000 && muriasetya07194_menabung < 500000) {
    //             System.out.println("Anda disarankan menabung perhari untuk nominal sebesar " + muriasetya07194_target);
    //         } else {
    //             System.out.println("Anda disarankan menabung perbulan untuk nominal sebesar " + muriasetya07194_target);
    //         }
    //         System.out.println("Menabung (perhari/perbulan)");
    //         System.out.println("1)perhari");
    //         System.out.println("2)perbulan");
    //         System.out.print("Pilih = ");
    //         int muriasetya07194_sekalamenabung = input.nextInt();
    //         muriasetya07194_jangkawaktuterkumpul1 = muriasetya07194_target / muriasetya07194_menabung;
    //         switch (muriasetya07194_sekalamenabung) {
    //             case 1:
    //                 if (muriasetya07194_target == muriasetya07194_jangkawaktuterkumpul1 * muriasetya07194_menabung) {
    //                     System.out.println("Tanggal Menabung = " + sdf.format(tgl.getTime()));
    //                     tgl.add(Calendar.DATE, muriasetya07194_jangkawaktuterkumpul1);
    //                     System.out.println("Tabungan Terkumpul = " + sdf.format(tgl.getTime()));
    //                     usercontroller.InsertDataTabunganPintar(muriasetya07194_jangkawaktuterkumpul1, muriasetya07194_target, muriasetya07194_menabung, muriasetya07194_sekalamenabung);
    //                 } else {
    //                     System.out.println("Tanggal Menabung = " + sdf.format(tgl.getTime()));
    //                     tgl.add(Calendar.DATE, muriasetya07194_jangkawaktuterkumpul1);
    //                     System.out.println("Tabungan Terkumpul = " + sdf.format(tgl.getTime()));
    //                     usercontroller.InsertDataTabunganPintar(muriasetya07194_jangkawaktuterkumpul1, muriasetya07194_target, muriasetya07194_menabung, muriasetya07194_sekalamenabung);
    //                 }
    //                 break;
    //             case 2:
    //                 if (muriasetya07194_target == muriasetya07194_jangkawaktuterkumpul1 * muriasetya07194_menabung) {
    //                     System.out.println("Tanggal Menabung = " + sdf.format(tgl.getTime()));
    //                     tgl.add(Calendar.DATE, muriasetya07194_jangkawaktuterkumpul1 * 30);
    //                     System.out.println("Tabungan Terkumpul = " + sdf.format(tgl.getTime()));
    //                     usercontroller.InsertDataTabunganPintar(muriasetya07194_jangkawaktuterkumpul1, muriasetya07194_target, muriasetya07194_menabung, muriasetya07194_sekalamenabung);
    //                 } else {
    //                     System.out.println("Tanggal Menabung = " + sdf.format(tgl.getTime()));
    //                     tgl.add(Calendar.DATE, muriasetya07194_jangkawaktuterkumpul1 * 30);
    //                     System.out.println("Tabungan Terkumpul = " + sdf.format(tgl.getTime()));
    //                     usercontroller.InsertDataTabunganPintar(muriasetya07194_jangkawaktuterkumpul1, muriasetya07194_target, muriasetya07194_menabung, muriasetya07194_sekalamenabung);
    //                 }
    //         }
    //     }
    // }

    // void daftar() {
    //     try {
    //         System.out.print("Nama = ");
    //         String muriasetya07194_nama = input.next();
    //         System.out.print("Jenis Kelamin = ");
    //         String muriasetya07194_jeniskelamin = input.next();
    //         System.out.print("Masukan Password = ");
    //         String muriasetya07194_Password = input.next();
    //         System.out.print("Masukkan NPM = ");
    //         String npm = input.next();
    //         usercontroller.InsertDataPengguna(muriasetya07194_nama, muriasetya07194_Password, muriasetya07194_jeniskelamin, npm);
    //     } catch (Exception e) {
    //         System.out.println("Format Pengisian Salah !!");
    //     }
    // }
    // public void cekStatus (int cek){
    //     if (cek ==1){
    //         System.out.println("Berhasil");
    //     }else{
    //         System.out.println("Nama tidak ditemukan");
    //     }
    // }
    // public void view(){
    //     if(usercontroller.GetArrayListDataPenggunaIsEmpty()){
    //         System.out.println("Data Kosong");
    //     }else{
    //         for(int a=0;a<usercontroller.GetArrayListPenggunaSize();a++){
    //             System.out.println("Nama = "+usercontroller.costumer(a).getMuriasetya07194_nama());
    //             System.out.println("Password = "+usercontroller.costumer(a).getmuriasetya07194_Password());
    //             System.out.println("npm = "+usercontroller.costumer(a).getNpm());
    //             System.out.println("");
    //         }
    //     }
    // }
}

