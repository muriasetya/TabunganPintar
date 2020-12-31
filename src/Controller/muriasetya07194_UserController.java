package Controller;

import Entity.muriasetya07194_PenggunaEntity;
import Entity.muriasetya07194_TabunganPintarEntity;

public class muriasetya07194_UserController implements muriasetya07194_ControllerInterface {

    public muriasetya07194_AllObjectController allObject = new muriasetya07194_AllObjectController();

    public muriasetya07194_UserController() {
    }

    public int GetArrayListDataPenggunaSize() {
        return allObject.UserModel.GetArrayListDataPenggunaSize();
    }

    public boolean GetArrayListDataPenggunaIsEmpty() {
        return allObject.UserModel.GetArrayListDataPenggunaIsEmpty();
    }

    public int update(String muriasetya07194_nama, String muriasetya07194_email) {
        return allObject.UserModel.update(muriasetya07194_nama, muriasetya07194_email);
    }

    public muriasetya07194_PenggunaEntity Costumer(int index) {
        return allObject.UserModel.Costumer(index);
    }

    public int hapus(String muriasetya07194_nama) {
        return allObject.UserModel.hapusnama(muriasetya07194_nama);
    }

    @Override
    public int loginUser(String muriasetya07194_email, String muriasetya07194_password) {
        return allObject.UserModel.CekData(muriasetya07194_email, muriasetya07194_password);
    }

    public void InsertDataPengguna(String muriasetya07194_email, String muriasetya07194_nama, String muriasetya07194_password, String muriasetya07194_jeniskelamin) {
        allObject.UserModel.InsertDataPengguna(new muriasetya07194_PenggunaEntity(muriasetya07194_email, muriasetya07194_nama, muriasetya07194_password, muriasetya07194_jeniskelamin));
    }

    public void InsertDataTabungan(int muriasetya07194_jangkawaktuterkumpul1, int muriasetya07194_target, int muriasetya07194_menabung, int muriasetya07194_sekalamenabung) {
        allObject.TabunganPintar.InsertDataTabungan(new muriasetya07194_TabunganPintarEntity(muriasetya07194_jangkawaktuterkumpul1, muriasetya07194_target, muriasetya07194_menabung, muriasetya07194_sekalamenabung));
    }
}
