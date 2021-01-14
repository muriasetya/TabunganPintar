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

public class muriasetya07194_menabung extends muriasetya07194_komponen{
    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    private Calendar calendar1 = Calendar.getInstance();
    int muriasetya07194_targetnabung,muriasetya07194_nominal,muriasetya07194_jangkawaktuterkumpul1;
    public muriasetya07194_menabung() {
        menabung();
    }
    public void menabung(){
        setSize(800 , 500);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        targetmenabung.setBounds(500,20,400,40);
        txttargetmenabung.setBounds(500, 50, 250, 25);
        nominal.setBounds(500, 70, 400, 40);
        txtnominal.setBounds(500, 100, 250, 25);
        btnsubmit.setBounds(570,130,120,30);
        perhari.setBounds(530, 170, 90, 20);
        perhari.setBackground(Color.getHSBColor(176, 75, 72));;
        perbulan.setBounds(630, 170, 90, 20);
        perbulan.setBackground(Color.getHSBColor(176, 75, 72));
        tglmasuk.setBounds(500, 200, 250, 25);
        tglterkumpul.setBounds(500, 230, 250, 25);
        btntiga.setBounds(320,170,120,30);

        btntiga.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                    try{
                    muriasetya07194_PenggunaGUI view = new muriasetya07194_PenggunaGUI();
                    dispose();
                    view.setVisible(true);
                    }catch(Exception e) {
                        JOptionPane.showMessageDialog(null, "Gagal ", "Peringatan", JOptionPane.INFORMATION_MESSAGE);
                    }  
                 }
            });

        btnsubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                    try{
                        muriasetya07194_nominal = Integer.parseInt( txtnominal.getText());
                        muriasetya07194_targetnabung = Integer.parseInt( txttargetmenabung.getText());
                        muriasetya07194_jangkawaktuterkumpul1= muriasetya07194_targetnabung/muriasetya07194_nominal;
                       
                           if(muriasetya07194_targetnabung<=500000&&muriasetya07194_nominal<500000){
                       JOptionPane.showMessageDialog(null, "Anda disarankan menabung perhari ","information", JOptionPane.INFORMATION_MESSAGE);  
                    }else if(muriasetya07194_targetnabung>500000&&muriasetya07194_nominal<500000){
                           JOptionPane.showMessageDialog(null, "Anda disarankan menabung perhari ","information", JOptionPane.INFORMATION_MESSAGE);
                    }else{
                           JOptionPane.showMessageDialog(null, "Anda disarankan menabung perbulan ","information", JOptionPane.INFORMATION_MESSAGE); 
                    }
                    }catch(Exception e) {
                        JOptionPane.showMessageDialog(null, "gagal ", "Peringatan", JOptionPane.INFORMATION_MESSAGE);
                    }  
                 }
            });


        perhari.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                
                     if(perhari.isSelected()){
                         
                       perbulan.setSelected(false);
                       try{
                        muriasetya07194_nominal = Integer.parseInt( txtnominal.getText());
                        muriasetya07194_targetnabung = Integer.parseInt( txttargetmenabung.getText());
                        muriasetya07194_jangkawaktuterkumpul1= muriasetya07194_targetnabung/muriasetya07194_nominal;
                       
                        if(muriasetya07194_targetnabung==muriasetya07194_jangkawaktuterkumpul1*muriasetya07194_nominal){   
                            tglmasuk.setText(sdf.format(calendar1.getTime()));
                                 calendar1.add(Calendar.DATE, muriasetya07194_jangkawaktuterkumpul1);
                                     tglterkumpul.setText(sdf.format(calendar1.getTime()));
                                     
                                     muriasetya07194_allobjctrl.user.InsertDataTabunganPintar(muriasetya07194_jangkawaktuterkumpul1, muriasetya07194_targetnabung, muriasetya07194_nominal, muriasetya07194_nominal);                                
                        }else{
                                tglmasuk.setText(sdf.format(calendar1.getTime()));
                                 calendar1.add(Calendar.DATE, muriasetya07194_jangkawaktuterkumpul1);
                                     tglterkumpul.setText(sdf.format(calendar1.getTime()));
                                     
                                     muriasetya07194_allobjctrl.user.InsertDataTabunganPintar(muriasetya07194_jangkawaktuterkumpul1, muriasetya07194_targetnabung, muriasetya07194_nominal, muriasetya07194_nominal);             
                        }
                        
                       }catch(Exception exception){
                            JOptionPane.showMessageDialog(null, "Gagal ","information", JOptionPane.INFORMATION_MESSAGE); 
                       } 
                     }   
            }
        });
        
        perbulan.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                
                     if(perbulan.isSelected()){
                         
                       perhari.setSelected(false);
                       try{          
                        muriasetya07194_nominal = Integer.parseInt( txtnominal.getText());
                        muriasetya07194_targetnabung = Integer.parseInt( txttargetmenabung.getText());
                        muriasetya07194_jangkawaktuterkumpul1= muriasetya07194_targetnabung/muriasetya07194_nominal;
                       
                        if(muriasetya07194_targetnabung==muriasetya07194_jangkawaktuterkumpul1*muriasetya07194_nominal){    
                                tglmasuk.setText(sdf.format(calendar1.getTime()));
                                     calendar1.add(Calendar.DATE, muriasetya07194_jangkawaktuterkumpul1*12);
                                         tglterkumpul.setText(sdf.format(calendar1.getTime()));
                                         muriasetya07194_allobjctrl.user.InsertDataTabunganPintar(muriasetya07194_jangkawaktuterkumpul1, muriasetya07194_targetnabung, muriasetya07194_nominal, muriasetya07194_nominal);
                        }else{
                                tglmasuk.setText(sdf.format(calendar1.getTime()));
                                 calendar1.add(Calendar.DATE, muriasetya07194_jangkawaktuterkumpul1*12);
                                     tglterkumpul.setText(sdf.format(calendar1.getTime()));                          
                                     muriasetya07194_allobjctrl.user.InsertDataTabunganPintar(muriasetya07194_jangkawaktuterkumpul1, muriasetya07194_targetnabung, muriasetya07194_nominal, muriasetya07194_nominal);
                        }
                        
                       }catch(Exception exception){
                            JOptionPane.showMessageDialog(null, "Gagal ","information", JOptionPane.INFORMATION_MESSAGE); 
                       } 
                     }   
            }
        });
        add(targetmenabung);
        add(txttargetmenabung);
        add(nominal);
        add(txtnominal);
        add(btnsubmit);
        add(perhari);
        add(perbulan);
        add(tglterkumpul);
        add(btnback);
        add(btnhapus);
        add(btnupdate);
        add(tglmasuk);
        add(btnreset);
        add(btntiga);
    }
}
