package Project;
import Model.*;
import Entity.*;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class Main {
       private muriasetya07194_DataTabunganPintarModel muriasetya07194_datatabunganModel=new muriasetya07194_DataTabunganPintarModel();
       private Scanner input=new Scanner(System.in);
       private muriasetya07194_DataPenggunaModel muriasetya07194_datapenggunaModel=new muriasetya07194_DataPenggunaModel();
       private SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
       private Calendar tgl = Calendar.getInstance();
       
      public static void main(String[] args) {
          Main Data= new Main();
           int pil;
        do{
        System.out.println("1.Daftar Akun");
        System.out.println("2.Login");
        System.out.println("3.hapus Data");
        System.out.println("4.Update Data");
        System.out.println("5.View");
        System.out.println("6.Exit");
        System.out.print("Pilih = ");
        pil=Data.input.nextInt();
        switch(pil){
            case 1:
                Data.daftar();
                break;
            case 2:
                System.out.print("Email = ");
                String muriasetya07194_Email=Data.input.next();
                System.out.print("Password = ");
                String muriasetya07194_Password=Data.input.next();
                Data.login(muriasetya07194_Email,muriasetya07194_Password);
                break;
            case 3:
  
                System.out.print("Nama Yang Dihapus = ");
                String muriasetya07194_nama1=Data.input.next();
                Data.muriasetya07194_datapenggunaModel.hapusnama(muriasetya07194_nama1);
                break;
            case 4:
                System.out.print("Nama = ");
                String muriasetya07194_Nama=Data.input.next();
                Data.muriasetya07194_datapenggunaModel.update(muriasetya07194_Nama);
                break;
            case 5:
                Data.muriasetya07194_datapenggunaModel.view();               
        }
        }while(pil!=6);
      }
      void login(String muriasetya07194_Email,String muriasetya07194_Password){
        int muriasetya07194_jangkawaktuterkumpul1;
        int muriasetya07194_CekDataPengguna=muriasetya07194_datapenggunaModel.CekData(muriasetya07194_Email,muriasetya07194_Password);
            if(muriasetya07194_CekDataPengguna==-1||muriasetya07194_CekDataPengguna==-2){
                System.out.println("Password atau Email Salah");
            }else{
                System.out.print("Target Menabung = ");
                int muriasetya07194_target=input.nextInt();          
                System.out.print("Nominal menabung = ");
                int muriasetya07194_menabung=input.nextInt();
                if(muriasetya07194_target<=500000&&muriasetya07194_menabung<500000){
                     System.out.println("Anda disarankan menabung perhari untuk nominal sebesar "+muriasetya07194_target);  
                }else if(muriasetya07194_target>500000&&muriasetya07194_menabung<500000){
                    System.out.println("Anda disarankan menabung perhari untuk nominal sebesar "+muriasetya07194_target);   
                }else{
                     System.out.println("Anda disarankan menabung perbulan untuk nominal sebesar "+muriasetya07194_target);  
                }
                System.out.println("Menabung (perhari/perbulan)");
                System.out.println("1)perhari");
                System.out.println("2)perbulan");
                System.out.print("Pilih = ");
                int muriasetya07194_sekalamenabung=input.nextInt();
                muriasetya07194_jangkawaktuterkumpul1=muriasetya07194_target/muriasetya07194_menabung;
                switch(muriasetya07194_sekalamenabung){
                    case 1:
                        if(muriasetya07194_target==muriasetya07194_jangkawaktuterkumpul1*muriasetya07194_menabung){
                            System.out.println("Tanggal Menabung = "+sdf.format(tgl.getTime()));
                            tgl.add(Calendar.DATE, muriasetya07194_jangkawaktuterkumpul1);
                            System.out.println("Tabungan Terkumpul = "+sdf.format(tgl.getTime()));
                            muriasetya07194_datatabunganModel.InsertDataTabunganPintar(new muriasetya07194_DataTabunganPintarEntity(muriasetya07194_jangkawaktuterkumpul1,muriasetya07194_target,muriasetya07194_menabung,muriasetya07194_sekalamenabung));
                        }else {
                            System.out.println("Tanggal Menabung = "+sdf.format(tgl.getTime()));
                            tgl.add(Calendar.DATE, muriasetya07194_jangkawaktuterkumpul1);
                            System.out.println("Tabungan Terkumpul = "+sdf.format(tgl.getTime())); 
                            muriasetya07194_datatabunganModel.InsertDataTabunganPintar(new muriasetya07194_DataTabunganPintarEntity(muriasetya07194_jangkawaktuterkumpul1,muriasetya07194_target,muriasetya07194_menabung,muriasetya07194_sekalamenabung));
                        }
                        break;
                    case 2:
                        if(muriasetya07194_target==muriasetya07194_jangkawaktuterkumpul1*muriasetya07194_menabung){
                            System.out.println("Tanggal Menabung = "+sdf.format(tgl.getTime()));
                            tgl.add(Calendar.DATE, muriasetya07194_jangkawaktuterkumpul1*30);
                            System.out.println("Tabungan Terkumpul = "+sdf.format(tgl.getTime())); 
                            muriasetya07194_datatabunganModel.InsertDataTabunganPintar(new muriasetya07194_DataTabunganPintarEntity(muriasetya07194_jangkawaktuterkumpul1,muriasetya07194_target,muriasetya07194_menabung,muriasetya07194_sekalamenabung));
                    }else{
                            System.out.println("Tanggal Menabung = "+sdf.format(tgl.getTime()));
                            tgl.add(Calendar.DATE, muriasetya07194_jangkawaktuterkumpul1*30);
                            System.out.println("Tabungan Terkumpul = "+sdf.format(tgl.getTime())); 
                            muriasetya07194_datatabunganModel.InsertDataTabunganPintar(new muriasetya07194_DataTabunganPintarEntity(muriasetya07194_jangkawaktuterkumpul1,muriasetya07194_target,muriasetya07194_menabung,muriasetya07194_sekalamenabung));
                    }            
                }
            }  
    }
       void daftar(){
         System.out.print("Nama = ");
         String muriasetya07194_nama=input.next();
         System.out.print("Jenis Kelamin = ");
         String muriasetya07194_jeniskelamin=input.next();
         System.out.print("Masukan Email = ");
         String muriasetya07194_Email=input.next();          
         System.out.print("Masukan Password = ");
         String muriasetya07194_Password=input.next();
         muriasetya07194_datapenggunaModel.InsertDataPengguna(new muriasetya07194_DataPenggunaEntity(muriasetya07194_Email,muriasetya07194_nama,muriasetya07194_Password,muriasetya07194_jeniskelamin)); 
        } 
      }

