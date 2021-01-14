package View;

import javax.swing.*;

import Controller.muriasetya07194_AllObjectModel;
import Controller.muriasetya07194_PenggunaController;
import java.awt.font.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.color.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class muriasetya07194_GUI extends muriasetya07194_komponen{
    boolean cekjeniskelamin;
    public muriasetya07194_GUI() {
        initComponent();
    }

    public void initComponent(){
        setSize(800 , 500);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Judul Program
        sambutan.setBounds(70, 30, 700, 40);
        sambutan.setFont(new Font("Lucida Handwriting", Font.BOLD, 30));

        // Pilih jenis kelamin
        laki.setBounds(30, 150, 90, 20);
        laki.setBackground(Color.getHSBColor(176, 75, 72));
        perempuan.setBounds(125, 150, 90, 20);
        perempuan.setBackground(Color.getHSBColor(176, 75, 72));

        laki.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                if (laki.isSelected()){
                    perempuan.setSelected(false);
                    cekjeniskelamin=true;
                }
            }
        });

        perempuan.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                if (perempuan.isSelected()){
                    laki.setSelected(false);
                    cekjeniskelamin=false;
                }
            }
        });

        // Daftar User
        header.setBounds(40, 110, 200, 30);
        header.setFont(new Font("Gill Sans MT", Font.BOLD, 20));
        labelnama.setBounds(30,180,150,15);
        txtnama.setBounds(30,200,190,25);

        labelpassword.setBounds(30,240,150,15);
        txtpassword.setBounds(30,260,190,25);

        labelNPM.setBounds(30,300,150,15);
        txtNPM.setBounds(30, 320, 190, 25);

        btnInsert.setBounds(30,380,120,30);

        // Login User
        header2.setBounds(560, 110, 200, 30);
        header2.setFont(new Font("Gill Sans MT", Font.BOLD, 20));
        labelpassword2.setBounds(550, 180, 150, 15);
        txtpassword2.setBounds(550, 200, 190, 25);

        labelNPM2.setBounds(550, 240, 150, 15);
        txtNPM2.setBounds(550, 260, 190, 25);

        btnlogin.setBounds(550, 380, 120, 30);

        btnlogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {                   
                    String muriasetya07194_password = txtpassword.getText();
                    String npm = txtNPM.getText();
                        if(IndexOutOfBoundsException()){
                            JOptionPane.showMessageDialog(null, "NPM atau Password salah ", "Peringatan", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                        muriasetya07194_allobjctrl.user.login(muriasetya07194_password, npm);
                        JOptionPane.showMessageDialog(null, "Selamat Datang ", "Login Sukses", JOptionPane.INFORMATION_MESSAGE);
                        muriasetya07194_pilih costumerz = new muriasetya07194_pilih();
                        dispose();
                        costumerz.setVisible(true);
                        }  
                 }

            private boolean IndexOutOfBoundsException() {
                return muriasetya07194_allobjctrl.user.GetArrayListDataPenggunaIsEmpty();
            }
            });
                    
        
        btnInsert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    if (cekjeniskelamin==true){
                    String npm = txtNPM.getText();
                    String muriasetya07194_password = txtpassword.getText();
                    String muriasetya07194_nama = txtnama.getText();
                    String muriasetya07194_jeniskelamin = "Laki-Laki";
                    muriasetya07194_allobjctrl.user.InsertDataPengguna(muriasetya07194_nama, muriasetya07194_password, muriasetya07194_jeniskelamin, npm);
                    JOptionPane.showMessageDialog(null, "Registrasi Sukses", "Login", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                    }else{
                    String npm = txtNPM.getText();
                    String muriasetya07194_password = txtpassword.getText();
                    String muriasetya07194_nama = txtnama.getText();
                    String muriasetya07194_jeniskelamin = "Perempuan";
                    muriasetya07194_allobjctrl.user.InsertDataPengguna(muriasetya07194_nama, muriasetya07194_password, muriasetya07194_jeniskelamin, npm);
                    JOptionPane.showMessageDialog(null, "Registrasi Sukses", "Login", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                    }
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Format Penulisan Salah", "Registrasi Gagal", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                }
            }
        });

        add(labelnama); add(txtnama); add(txtpassword); add(labelpassword);
        add(labelNPM); add(txtNPM); add(labelNPM2); add(txtNPM2);
        add(labelnama2); add(txtnama2); add(labelpassword2); add(txtpassword2);
        add(laki); add(perempuan); add(sambutan); add(header);
        add(header2); add(btnInsert); add(btnlogin); add(laki2);
        add(perempuan2);
}
void kosong(){
    txtpassword.setText(null);
    txtNPM.setText(null);
    txtnama.setText(null);
}
}
