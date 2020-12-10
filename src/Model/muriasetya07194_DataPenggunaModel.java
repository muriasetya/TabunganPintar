package Model;

import Entity.muriasetya07194_DataPenggunaEntity;
import java.util.ArrayList;
import java.util.Scanner;
public class muriasetya07194_DataPenggunaModel implements ModelInterfaces {
    private ArrayList<muriasetya07194_DataPenggunaEntity> muriasetya07194_datapenggunaEntityArrayList;
    private Scanner input=new Scanner(System.in);

    public muriasetya07194_DataPenggunaModel() {
        muriasetya07194_datapenggunaEntityArrayList= new ArrayList<muriasetya07194_DataPenggunaEntity>();
    }
    
    @Override
    public void view(){
        if(muriasetya07194_datapenggunaEntityArrayList.isEmpty()){
            System.out.println("Data Kosong");
        }else{
            for(int a=0;a<muriasetya07194_datapenggunaEntityArrayList.size();a++){
                System.out.println("Nama = "+muriasetya07194_datapenggunaEntityArrayList.get(a).getmuriasetya07194_Nama());
                System.out.println("Email = "+muriasetya07194_datapenggunaEntityArrayList.get(a).getmuriasetya07194_Email());
                System.out.println("Password = "+muriasetya07194_datapenggunaEntityArrayList.get(a).getmuriasetya07194_Password());
                System.out.println("");
            }
        }
    }
    public int CekData(String muriasetya07194_Email,String muriasetya07194_Password){
        int loop=0;
        if(muriasetya07194_datapenggunaEntityArrayList.size()==0){
            loop=-1;
        }else{
            for(int a=0;a<muriasetya07194_datapenggunaEntityArrayList.size();a++){
                if(muriasetya07194_datapenggunaEntityArrayList.get(a).getmuriasetya07194_Email().equals(muriasetya07194_Email)&&muriasetya07194_datapenggunaEntityArrayList.get(a).getmuriasetya07194_Password().equals(muriasetya07194_Password)){
                    loop=a;
                    break;
                }else{
                    loop=-2;
                }
            }
        }
        return loop;
    }
     
     public void hapusnama(String muriasetya07194_nama){
      if(muriasetya07194_nama.equals(muriasetya07194_datapenggunaEntityArrayList.get(carinama(muriasetya07194_nama)).getmuriasetya07194_Nama())){
           muriasetya07194_datapenggunaEntityArrayList.remove(carinama(muriasetya07194_nama));
            System.out.println("Nama Sudah Dihapus");
      }else{
            System.out.println("Nama Tidak Ditemukan");
      }
   }
     
     public void update(String muriasetya07194_nama){
       if(carinama(muriasetya07194_nama)!=-1){     
        System.out.print("Email = ");
        String Email1=input.next();
           muriasetya07194_datapenggunaEntityArrayList.get(carinama(muriasetya07194_nama)).setmuriasetya07194_Email(Email1);
       }else{
           System.out.println("Nama Tidak Ditemukan");
       }
   }
     
      private int carinama(String muriasetya07194_nama){
       int indeks=-1;
       
       for(int a=0;a<muriasetya07194_datapenggunaEntityArrayList.size();a++){
           if(muriasetya07194_nama.equals(muriasetya07194_datapenggunaEntityArrayList.get(a).getmuriasetya07194_Nama())){
               indeks=a;
               break;
           }
       }
       return indeks;
   }
      public void InsertDataPengguna(muriasetya07194_DataPenggunaEntity muriasetya07194_dataPenggunaEntity){
          muriasetya07194_datapenggunaEntityArrayList.add(muriasetya07194_dataPenggunaEntity);
      }
}
