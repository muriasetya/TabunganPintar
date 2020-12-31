package Model;

import Entity.muriasetya07194_TabunganPintarEntity;
import java.util.ArrayList;

public class muriasetya07194_TabunganPintarModel {

    public ArrayList<muriasetya07194_TabunganPintarEntity> datatabunganpintarEntityArrayList;

    public muriasetya07194_TabunganPintarModel() {
        datatabunganpintarEntityArrayList = new ArrayList<muriasetya07194_TabunganPintarEntity>();
    }

    public void InsertDataTabungan(muriasetya07194_TabunganPintarEntity dataTabunganPintarEntity) {
        datatabunganpintarEntityArrayList.add(dataTabunganPintarEntity);

    }

}
