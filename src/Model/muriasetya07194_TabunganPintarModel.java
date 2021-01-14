package Model;
import Entity.muriasetya07194_TabunganPintarEntity;
import java.util.ArrayList;
public class muriasetya07194_TabunganPintarModel {
    protected ArrayList<muriasetya07194_TabunganPintarEntity> muriasetya07194_datatabunganpintarEntityArrayList;
    public muriasetya07194_TabunganPintarModel() {
        muriasetya07194_datatabunganpintarEntityArrayList= new ArrayList<muriasetya07194_TabunganPintarEntity>();
    }
    public void InsertDataTabunganPintar(muriasetya07194_TabunganPintarEntity muriasetya07194_dataTabunganPintarEntity){
        muriasetya07194_datatabunganpintarEntityArrayList.add(muriasetya07194_dataTabunganPintarEntity);
    }
    public ArrayList <muriasetya07194_TabunganPintarEntity> tabungan(){
        return muriasetya07194_datatabunganpintarEntityArrayList;
    }
    public muriasetya07194_TabunganPintarEntity muriasetya07194_TabunganPintar(int indeks){
        return muriasetya07194_datatabunganpintarEntityArrayList.get(indeks);
    }
    
}
