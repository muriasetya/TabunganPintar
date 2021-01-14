
package Entity;

public abstract class muriasetya07194_mahasiswa {
    protected String npm,muriasetya07194_nama,muriasetya07194_jeniskelamin;

    public muriasetya07194_mahasiswa(String npm, String muriasetya07194_nama, String muriasetya07194_jeniskelamin){
        this.npm = npm;
        this.muriasetya07194_nama = muriasetya07194_nama;
        this.muriasetya07194_jeniskelamin = muriasetya07194_jeniskelamin;
    }

    
    public muriasetya07194_mahasiswa(){
    
}
    public abstract String getNpm();

    public String getMuriasetya07194_nama() {
        return muriasetya07194_nama;
    }

    public String getMuriasetya07194_jeniskelamin() {
        return muriasetya07194_jeniskelamin;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public void setMuriasetya07194_nama(String muriasetya07194_nama) {
        this.muriasetya07194_nama = muriasetya07194_nama;
    }

    public void setMuriasetya07194_jeniskelamin(String muriasetya07194_jeniskelamin) {
        this.muriasetya07194_jeniskelamin = muriasetya07194_jeniskelamin;
    }

}


