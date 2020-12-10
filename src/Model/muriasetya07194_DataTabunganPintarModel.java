package Model;
import Entity.muriasetya07194_DataTabunganPintarEntity;
import java.util.ArrayList;
public class muriasetya07194_DataTabunganPintarModel {
    protected ArrayList<muriasetya07194_DataTabunganPintarEntity> muriasetya07194_datatabunganpintarEntityArrayList;
    public muriasetya07194_DataTabunganPintarModel() {
        muriasetya07194_datatabunganpintarEntityArrayList= new ArrayList<muriasetya07194_DataTabunganPintarEntity>();
    }
    public void InsertDataTabunganPintar(muriasetya07194_DataTabunganPintarEntity muriasetya07194_dataTabunganPintarEntity){
        muriasetya07194_datatabunganpintarEntityArrayList.add(muriasetya07194_dataTabunganPintarEntity);
    }
}
