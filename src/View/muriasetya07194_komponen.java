package View;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class muriasetya07194_komponen extends JFrame{
    
    protected JLabel labelnama = new JLabel("Masukkan Nama : ");
    protected JLabel labelNPM = new JLabel("Masukkan NPM : ");
    protected JLabel labelpassword = new JLabel("Masukkan Password  : ");
    protected JLabel sambutan = new JLabel("Sistem Informasi Tabungan Pintar");
    protected JLabel header = new JLabel("Daftar Akun");
    protected JLabel header2 = new JLabel("Login Akun");
    protected JLabel labelnama2 = new JLabel("Masukkan Nama : ");
    protected JLabel labelNPM2 = new JLabel("Masukkan NPM : ");
    protected JLabel labelpassword2 = new JLabel("Masukkan Password  : ");
    protected JLabel namadihapus = new JLabel("Masukkan nama yang akan dihapus");
    protected JLabel carinama = new JLabel("Masukkan nama ");
    protected JLabel passbaru = new JLabel("Masukkan Password Baru ");
    protected JLabel datauser = new JLabel("Data Pengguna");
    protected JLabel targetmenabung = new JLabel("Masukkan Target menabung");
    protected JLabel nominal = new JLabel("Masukkan nominal menabung");
    protected JLabel headerupdate = new JLabel("Update Password");
    protected JLabel headerhapus = new JLabel("Hapus Data");

    protected JTextArea datausertabungan = new JTextArea();
    protected JTextArea datausertabungan2 = new JTextArea();
    protected JTextArea tglterkumpul = new JTextArea();
    protected JTextArea tglmasuk = new JTextArea(); 

    protected JRadioButton laki = new JRadioButton("Laki-laki");
    protected JRadioButton perempuan = new JRadioButton("Perempuan");
    protected JRadioButton laki2 = new JRadioButton("Laki-laki");
    protected JRadioButton perempuan2 = new JRadioButton("Perempuan");
    protected JRadioButton perhari = new JRadioButton("Perhari");
    protected JRadioButton perbulan = new JRadioButton("Perbulan");

    protected JTextField txtnama = new JTextField();
    protected JTextField txtNPM = new JTextField();
    protected JPasswordField txtpassword = new JPasswordField();
    protected JTextField txtnama2 = new JTextField();
    protected JTextField txtNPM2 = new JTextField();
    protected JPasswordField txtpassword2 = new JPasswordField();
    protected JTextField txttargetmenabung = new JTextField();
    protected JTextField txtnominal = new JTextField();
    protected JTextField txtnamaupdate = new JTextField();
    protected JTextField txtpudatepass = new JTextField();
    protected JTextField txtnamahapus = new JTextField();

    protected JButton btnInsert = new JButton(" Daftar ");
    protected JButton btnlogin = new JButton(" login ");
    protected JButton btnhapus = new JButton(" hapus ");
    protected JButton btnupdate = new JButton(" update ");
    protected JButton btnsubmit = new JButton(" SUBMIT ");
    protected JButton btnback = new JButton(" << Kembali ");
    protected JButton btnselesaiupdate = new JButton(" Selesai ");
    protected JButton btnselesauhapus = new JButton(" Selesai ");
    protected JButton btnbackhapus = new JButton(" << Kembali ");
    protected JButton btnbackupdate = new JButton(" << Kembali ");
    protected JButton btnreset = new JButton(" Reset ");
    protected JButton btnsatu = new JButton(" view ");
    protected JButton btndua = new JButton(" menabung ");
    protected JButton btntiga = new JButton(" kembali ");

}
