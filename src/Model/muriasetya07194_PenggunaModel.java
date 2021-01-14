package Model;

import Entity.muriasetya07194_PenggunaEntity;
import java.util.ArrayList;

public class muriasetya07194_PenggunaModel implements ModelInterfaces {
    private ArrayList<muriasetya07194_PenggunaEntity> muriasetya07194_datapenggunaEntityArrayList;

    public muriasetya07194_PenggunaModel() {
        muriasetya07194_datapenggunaEntityArrayList= new ArrayList<muriasetya07194_PenggunaEntity>();
    }
        
    
    @Override
    public int CekData(String muriasetya07194_Password,String npm){
        int loop=0;
        if(muriasetya07194_datapenggunaEntityArrayList.size()==0){
            loop=-1;
        }else{
            for(int a=0;a<muriasetya07194_datapenggunaEntityArrayList.size();a++){
                if(muriasetya07194_datapenggunaEntityArrayList.get(a).getmuriasetya07194_Password().equals(muriasetya07194_Password)&&muriasetya07194_datapenggunaEntityArrayList.get(a).getNpm().equals(npm)){
                    loop=a;
                    break;
                }else{
                    loop=-2;
                }
            }
        }
        return loop;
    }
     
     public int hapusnama(String muriasetya07194_nama){
        int Status;
        if(carinama(muriasetya07194_nama)!=-1){     
            muriasetya07194_datapenggunaEntityArrayList.remove(carinama(muriasetya07194_nama));
                Status=1;
        }else{
            Status=0;
        }
        return Status;
   }
     
     public int update(String muriasetya07194_nama,String muriasetya07194_password){
        int Status;
        if(carinama(muriasetya07194_nama)!=-1){     
            muriasetya07194_datapenggunaEntityArrayList.get(carinama(muriasetya07194_nama)).setmuriasetya07194_Password(muriasetya07194_password);
                Status=1;
        }else{
            Status=0;
        }
        return Status;
    }
     
      private int carinama(String muriasetya07194_nama){
       int indeks=-1;
       
       for(int a=0;a<muriasetya07194_datapenggunaEntityArrayList.size();a++){
           if(muriasetya07194_nama.equals(muriasetya07194_datapenggunaEntityArrayList.get(a).getMuriasetya07194_nama())){
               indeks=a;
               break;
           }
       }
       return indeks;
   }
      public void InsertDataPengguna(muriasetya07194_PenggunaEntity muriasetya07194_dataPenggunaEntity){
          muriasetya07194_datapenggunaEntityArrayList.add(muriasetya07194_dataPenggunaEntity);
      }
      public int GetArrayListPenggunaSize(){
        return muriasetya07194_datapenggunaEntityArrayList.size();
      }
      public muriasetya07194_PenggunaEntity costumer(int index){
          return muriasetya07194_datapenggunaEntityArrayList.get(index);
      }
      public boolean GetArrayListDataPenggunaIsEmpty(){
          return muriasetya07194_datapenggunaEntityArrayList.isEmpty();
      }
      public muriasetya07194_PenggunaEntity showDataPengguna(int indexLogin){
          return muriasetya07194_datapenggunaEntityArrayList.get(indexLogin);
      }
      public int sizedatatabungan(){
          return muriasetya07194_datapenggunaEntityArrayList.size();
      }

}
