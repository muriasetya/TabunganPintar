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

public class muriasetya07194_pilih extends muriasetya07194_komponen{
    public muriasetya07194_pilih() {
        pilih();
    }
    public void pilih(){
        setSize(300 , 300);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnsatu.setBounds(80,170,120,30);
        btndua.setBounds(80,210,120,30);

        btnsatu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                    try{
                   if (muriasetya07194_allobjctrl.user.GetArrayListPenggunaSize() == 0){
                    JOptionPane.showMessageDialog(null, "kosong ", "Peringatan", JOptionPane.INFORMATION_MESSAGE);
                   }else{
                        JOptionPane.showMessageDialog(null, "Kembali awal" , "info", JOptionPane.INFORMATION_MESSAGE);
                    muriasetya07194_PenggunaGUI pemgguna = new muriasetya07194_PenggunaGUI();
                    dispose();
                    pemgguna.setVisible(true);
                   }
                    }catch(Exception e) {
                        JOptionPane.showMessageDialog(null, "gagal ", "Peringatan", JOptionPane.INFORMATION_MESSAGE);
                    }  
                 }
            });

            btndua.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                        try{
                        muriasetya07194_menabung menabung = new muriasetya07194_menabung();
                        dispose();
                        menabung.setVisible(true);
                        }catch(Exception e) {
                            JOptionPane.showMessageDialog(null, "Gagal", "Peringatan", JOptionPane.INFORMATION_MESSAGE);
                        }  
                     }
                });
        
        add(btnsatu);
        add(btndua);
    }
    
}
