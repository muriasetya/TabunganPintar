package Model;

import Entity.muriasetya07194_PenggunaEntity;
import java.util.ArrayList;

public class muriasetya07194_PenggunaModel implements ModelInterfaces {

    private ArrayList<muriasetya07194_PenggunaEntity> datapenggunaEntityArrayList;

    public muriasetya07194_PenggunaModel() {
        datapenggunaEntityArrayList = new ArrayList<muriasetya07194_PenggunaEntity>();
    }

    @Override
    public int CekData(String muriasetya07194_email, String muriasetya07194_password) {
        int loop = 0;
        if (datapenggunaEntityArrayList.size() == 0) {
            loop = -1;
        } else {
            for (int a = 0; a < datapenggunaEntityArrayList.size(); a++) {
                if (datapenggunaEntityArrayList.get(a).getmuriasetya07194_email().equals(muriasetya07194_email) && datapenggunaEntityArrayList.get(a).getmuriasetya07194_password().equals(muriasetya07194_password)) {
                    loop = a;
                    break;
                } else {
                    loop = -2;
                }
            }
        }
        return loop;
    }

    public int hapusnama(String muriasetya07194_nama) {
        int Status;
        if (cariNama(muriasetya07194_nama) != -1) {
            datapenggunaEntityArrayList.remove(cariNama(muriasetya07194_nama));
            Status = 1;
        } else {
            Status = 0;

        }
        return Status;
    }

    public int update(String muriasetya07194_nama, String muriasetya07194_email) {
        int Status;
        if (cariNama(muriasetya07194_nama) != -1) {
            datapenggunaEntityArrayList.get(cariNama(muriasetya07194_nama)).setmuriasetya07194_email(muriasetya07194_email);
            Status = 1;
        } else {
            Status = 0;
        }
        return Status;
    }

    private int cariNama(String muriasetya07194_nama) {
        int indeks = -1;

        for (int a = 0; a < datapenggunaEntityArrayList.size(); a++) {
            if (muriasetya07194_nama.equals(datapenggunaEntityArrayList.get(a).getmuriasetya07194_nama())) {
                indeks = a;
                break;
            }
        }
        return indeks;
    }

    public void InsertDataPengguna(muriasetya07194_PenggunaEntity syahrul07185_dataPenggunaEntity) {
        datapenggunaEntityArrayList.add(syahrul07185_dataPenggunaEntity);
    }

    public int GetArrayListDataPenggunaSize() {
        int index;
        return index = datapenggunaEntityArrayList.size();
    }

    public muriasetya07194_PenggunaEntity Costumer(int index) {
        return datapenggunaEntityArrayList.get(index);
    }

    public boolean GetArrayListDataPenggunaIsEmpty() {
        return datapenggunaEntityArrayList.isEmpty();
    }

}
