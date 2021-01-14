package Entity;

public class muriasetya07194_PenggunaEntity extends muriasetya07194_mahasiswa {

    private String muriasetya07194_password;

    public muriasetya07194_PenggunaEntity(String muriasetya07194_nama, String muriasetya07194_password, String muriasetya07194_jeniskelamin, String npm) {
        super(npm, muriasetya07194_nama, muriasetya07194_jeniskelamin);
        this.muriasetya07194_password = muriasetya07194_password;

    }
    @Override
    public String getNpm() {
        return npm;
    }

    public String getmuriasetya07194_Password() {
        return muriasetya07194_password;
    }
    public void setmuriasetya07194_Password(String muriasetya07194_password) {
        this.muriasetya07194_password = muriasetya07194_password;
    }

}
