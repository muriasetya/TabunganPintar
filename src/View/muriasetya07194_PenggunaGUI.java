package View;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.color.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;

public class muriasetya07194_PenggunaGUI extends muriasetya07194_komponen {
    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    private Calendar calendar1 = Calendar.getInstance();
    int muriasetya07194_targetnabung,muriasetya07194_nominal,muriasetya07194_jangkawaktuterkumpul1;
    public muriasetya07194_PenggunaGUI() {
        init();
    }

    public void init(){
        setSize(800 , 500);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        datauser.setBounds(30,20,400,40);
        datauser.setFont(new Font("GeoSlab703 Md BT", Font.BOLD, 30));
        datausertabungan.setBounds(30,60,250,200);
        datausertabungan.setText(datauser());

        datausertabungan2.setBounds(30, 300, 250, 100);
        datausertabungan2.setText(datauser2());

        btnupdate.setBounds(320,110,120,30);
        btnhapus.setBounds(320,170,120,30);
        btnback.setBounds(320,230,120,30);

        btnback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                    try{
                    JOptionPane.showMessageDialog(null, "Kembali awal" , "info", JOptionPane.INFORMATION_MESSAGE);
                    muriasetya07194_GUI awal = new muriasetya07194_GUI();
                    dispose();
                    awal.setVisible(true);
                    }catch(Exception e) {
                        JOptionPane.showMessageDialog(null, "Gagal ", "Peringatan", JOptionPane.INFORMATION_MESSAGE);
                    }  
                 }
            });

            btnupdate.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                        try{
                        muriasetya07194_UpdateGUI updatewindow = new muriasetya07194_UpdateGUI();
                        dispose();
                        updatewindow.setVisible(true);
                        }catch(Exception e) {
                            JOptionPane.showMessageDialog(null, "Gagal ", "Peringatan", JOptionPane.INFORMATION_MESSAGE);
                        }  
                     }
                });

                btnhapus.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                            try{
                            muriasetya07194_HapusGUI windowhapus = new muriasetya07194_HapusGUI();
                            dispose();
                            windowhapus.setVisible(true);
                            }catch(Exception e) {
                                JOptionPane.showMessageDialog(null, "Gagal ", "Peringatan", JOptionPane.INFORMATION_MESSAGE);
                            }  
                         }
                    });


        add(datauser);
        add(datausertabungan);
        add(btnback);
        add(btnhapus);
        add(btnupdate);
        add(btnreset);   
        add(datausertabungan2);

    }
    String datauser(){
        for(int a=0;a<muriasetya07194_allobjctrl.user.GetArrayListPenggunaSize();a++){
        String text = "nama = "+muriasetya07194_allobjctrl.user.costumer(a).getMuriasetya07194_nama()+"\n"               
                    + "Password = "+muriasetya07194_allobjctrl.user.costumer(a).getmuriasetya07194_Password()+"\n"
                    + "Jenis Kelamin = "+muriasetya07194_allobjctrl.user.costumer(a).getMuriasetya07194_jeniskelamin()+"\n"
                    + "NPM = "+muriasetya07194_allobjctrl.user.costumer(a).getNpm()+"\n";
        return text;
    }
    return null;
}
String datauser2(){
    for(int b=0;b<muriasetya07194_allobjctrl.user.GetArrayListPenggunaSize();b++){
    String text2 = "Nominal Menabung = "+muriasetya07194_allobjctrl.user.muriasetya07194_TabunganPintar(b).getmuriasetya07194_Menabung()+"\n"
                + "Target Menabung = "+muriasetya07194_allobjctrl.user.muriasetya07194_TabunganPintar(b).getmuriasetya07194_Target()+"\n";
    return text2;
}
return null;
}
}

