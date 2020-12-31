package Main;

import Controller.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class muriasetya07194_Main {

    private muriasetya07194_UserController UserController = new muriasetya07194_UserController();
    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    private Calendar tanggal = Calendar.getInstance();
    private Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        muriasetya07194_Main Data = new muriasetya07194_Main();
        int pilihan;

        do {
            System.out.println("1.Daftar Akun");
            System.out.println("2.Login");
            System.out.println("3.hapus Data");
            System.out.println("4.Update Data");
            System.out.println("5.View");
            System.out.println("6.Exit");
            System.out.print("Pilih = ");
            pilihan = Data.input.nextInt();
            switch (pilihan) {
                case 1:
                    Data.daftar();
                    break;
                case 2:
                    System.out.print("Masukkan email = ");
                    String muriasetya07194_email = Data.input.next();
                    System.out.print("Masukkan password = ");
                    String muriasetya07194_password = Data.input.next();
                    Data.login(muriasetya07194_email, muriasetya07194_password);
                    break;
                case 3:
                    System.out.print("nama Yang Dihapus = ");
                    String muriasetya07194_nama1 = Data.input.next();
                    int Status1 = Data.UserController.hapus(muriasetya07194_nama1);
                    Data.cekStatus(Status1);

                    break;
                case 4:
                    System.out.print("nama = ");
                    String muriasetya07194_nama = Data.input.next();
                    System.out.print("email baru = ");
                    String muriasetya07194_email1 = Data.input.next();
                    int Status = Data.UserController.update(muriasetya07194_nama, muriasetya07194_email1);
                    Data.cekStatus(Status);
                    break;
                case 5:
                    Data.view();
            }
        } while (pilihan != 6);
    }

    void daftar() {
        try {
            System.out.print("Masukkan nama = ");
            String muriasetya07194_nama = input.next();
            System.out.print("Jenis Kelamin = ");
            String muriasetya07194_jeniskelamin = input.next();
            System.out.print("Masukkan email = ");
            String muriasetya07194_email = input.next();
            System.out.print("Masukkan password = ");
            String muriasetya07194_password = input.next();
            UserController.InsertDataPengguna(muriasetya07194_email, muriasetya07194_nama, muriasetya07194_password, muriasetya07194_jeniskelamin);
        } catch (Exception e) {
            System.out.println("Inputan tidak sesuai ketentuan");
        }
    }

    void login(String muriasetya07194_email, String muriasetya07194_password) {
        int muriasetya07194_jangkawaktuterkumpul1;
        int CekDataPengguna = UserController.loginUser(muriasetya07194_email, muriasetya07194_password);
        if (CekDataPengguna == -1 || CekDataPengguna == -2) {
            System.out.println("password atau email Salah");
        } else {
            System.out.print("target Menabung = ");
            int muriasetya07194_target = input.nextInt();

            System.out.print("Nominal menabung = ");
            int muriasetya07194_menabung = input.nextInt();

            if (muriasetya07194_target <= 500000 && muriasetya07194_menabung < 500000) {
                System.out.println("Anda disarankan menabung perhari untuk nominal sebesar " + muriasetya07194_target);
            } else if (muriasetya07194_target > 500000 && muriasetya07194_menabung < 500000) {
                System.out.println("Anda disarankan menabung perhari untuk nominal sebesar " + muriasetya07194_target);
            } else {
                System.out.println("Anda disarankan menabung perbulan untuk nominal sebesar " + muriasetya07194_target);
            }
            System.out.println("Menabung (perhari/perbulan)");
            System.out.println("1)perhari");
            System.out.println("2)perbulan");
            System.out.print("Pilih = ");
            int muriasetya07194_sekalamenabung = input.nextInt();
            muriasetya07194_jangkawaktuterkumpul1 = muriasetya07194_target / muriasetya07194_menabung;
            switch (muriasetya07194_sekalamenabung) {
                case 1:
                    if (muriasetya07194_target == muriasetya07194_jangkawaktuterkumpul1 * muriasetya07194_menabung) {
                        System.out.println("Tanggal Menabung = " + sdf.format(tanggal.getTime()));
                        tanggal.add(Calendar.DATE, muriasetya07194_jangkawaktuterkumpul1);
                        System.out.println("Tabungan Terkumpul = " + sdf.format(tanggal.getTime()));
                        UserController.InsertDataTabungan(muriasetya07194_jangkawaktuterkumpul1, muriasetya07194_target, muriasetya07194_menabung, muriasetya07194_sekalamenabung);

                    } else {
                        System.out.println("Tanggal Menabung = " + sdf.format(tanggal.getTime()));
                        tanggal.add(Calendar.DATE, muriasetya07194_jangkawaktuterkumpul1);
                        System.out.println("Tabungan Terkumpul = " + sdf.format(tanggal.getTime()));
                        UserController.InsertDataTabungan(muriasetya07194_jangkawaktuterkumpul1, muriasetya07194_target, muriasetya07194_menabung, muriasetya07194_sekalamenabung);
                    }
                    break;
                case 2:
                    if (muriasetya07194_target == muriasetya07194_jangkawaktuterkumpul1 * muriasetya07194_menabung) {
                        System.out.println("Tanggal Menabung = " + sdf.format(tanggal.getTime()));
                        tanggal.add(Calendar.DATE, muriasetya07194_jangkawaktuterkumpul1 * 30);
                        System.out.println("Tabungan Terkumpul = " + sdf.format(tanggal.getTime()));
                        UserController.InsertDataTabungan(muriasetya07194_jangkawaktuterkumpul1, muriasetya07194_target, muriasetya07194_menabung, muriasetya07194_sekalamenabung);
                    } else {
                        System.out.println("Tanggal Menabung = " + sdf.format(tanggal.getTime()));
                        tanggal.add(Calendar.DATE, muriasetya07194_jangkawaktuterkumpul1 * 30);
                        System.out.println("Tabungan Terkumpul = " + sdf.format(tanggal.getTime()));
                        UserController.InsertDataTabungan(muriasetya07194_jangkawaktuterkumpul1, muriasetya07194_target, muriasetya07194_menabung, muriasetya07194_sekalamenabung);
                    }

            }
        }

    }

    public void view() {
        if (UserController.GetArrayListDataPenggunaIsEmpty()) {
            System.out.println("Data Kosong");
        } else {
            for (int a = 0; a < UserController.GetArrayListDataPenggunaSize(); a++) {
                System.out.println("nama          = " + UserController.Costumer(a).getmuriasetya07194_nama());
                System.out.println("Jenis Kelamin = " + UserController.Costumer(a).getmuriasetya07194_jeniskelamin());
                System.out.println("email         = " + UserController.Costumer(a).getmuriasetya07194_email());
                System.out.println("");

            }
        }
    }

    public void cekStatus(int Cek) {
        if (Cek == 1) {
            System.out.println("Berhasil");
        } else {
            System.out.println("nama Tidak Ditemukan");
        }
    }
}
