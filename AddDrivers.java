
package hotel.management.system1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class AddDrivers extends JFrame implements ActionListener {
   JButton add,cancel;
   JTextField tfname,tfcompany,tfage,tfmodel,tflocation;
   JComboBox availablecombo,gendercombo;
    
    
    AddDrivers(){
          getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading=new JLabel("Add Driver");
        heading.setFont(new Font("Tahoma",Font.BOLD,18));
       heading.setBounds(150,20,200,20);
        add(heading);
        
        JLabel lblroomno=new JLabel("Name");
        lblroomno.setFont(new Font("Tahoma",Font.PLAIN,18));
       lblroomno.setBounds(60,80,940,30);
        add(lblroomno);
        
         tfname=new JTextField();
        tfname.setBounds(200,80,150,30);
        add(tfname);
        
        
        JLabel lblage=new JLabel("Age");
        lblage.setFont(new Font("Tahoma",Font.PLAIN,18));
       lblage.setBounds(60,130,940,30);
        add(lblage);
        
       
         tfage=new JTextField();
        tfage.setBounds(200,130,150,30);
        add(tfage);
        
      
        JLabel lblclean=new JLabel("Gender");
        lblclean.setFont(new Font("Tahoma",Font.PLAIN,18));
      lblclean.setBounds(60,180,940,30);
        add(lblclean);
        
        String cleanOptions[]={"Male","Female"};
         gendercombo=new JComboBox(cleanOptions);
        gendercombo.setBounds(200,180,150,30);
        gendercombo.setBackground(Color.WHITE);
        add(gendercombo);
        
        JLabel lblprice=new JLabel("Car Company");
        lblprice.setFont(new Font("Tahoma",Font.PLAIN,18));
       lblprice.setBounds(60,230,120,30);
        add(lblprice);
        
        tfcompany=new JTextField();
        tfcompany.setBounds(200,230,150,30);
        add(tfcompany);
        
         JLabel lbltype=new JLabel("Car Model");
        lbltype.setFont(new Font("Tahoma",Font.PLAIN,18));
      lbltype.setBounds(60,280,150,30);
        add(lbltype);
        
        tfmodel=new JTextField();
        tfmodel.setBounds(200,280,150,30);
        add(tfmodel);
        
        JLabel lblavailable=new JLabel("Available");
        lblavailable.setFont(new Font("Tahoma",Font.PLAIN,18));
      lblavailable.setBounds(60,330,150,30);
        add(lblavailable);
        
          
        String driverOptions[]={"Available","busy"};
         availablecombo=new JComboBox(driverOptions);
        availablecombo.setBounds(200,330,150,30);
        availablecombo.setBackground(Color.WHITE);
        add(availablecombo);
        
        JLabel lbllocation=new JLabel("Location");
        lbllocation.setFont(new Font("Tahoma",Font.PLAIN,18));
      lbllocation.setBounds(60,380,150,30);
        add(lbllocation);
        
        tflocation=new JTextField();
        tflocation.setBounds(200,380,150,30);
        add(tflocation);
        
        
         add=new JButton("Add Driver");
        add.setForeground(Color.WHITE);
        add.setBackground(Color.BLACK);
        add.setBounds(60,430,130,30);
        add.addActionListener(this);
        add(add);
        
        
         cancel=new JButton("Cancel");
        cancel.setForeground(Color.WHITE);
        cancel.setBackground(Color.BLACK);
        cancel.setBounds(220,430,130,30);
        cancel.addActionListener(this);
        add(cancel);
        
                ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/eleven.jpg"));
                Image i2=i1.getImage().getScaledInstance(500, 300,Image.SCALE_DEFAULT );
                ImageIcon i3=new ImageIcon(i2);
                
                JLabel image=new JLabel(i3);
                image.setBounds(400,100,500,300);
        add(image);
        
        
        
        setBounds(300,200,980,550);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== add){
            String name=tfname.getText();
            String age=tfage.getText();
             String gender=(String)gendercombo.getSelectedItem();
              String company=tfcompany.getText();
            String brand=tfmodel.getText();
            String available=(String)availablecombo.getSelectedItem();
            String location=tflocation.getText();

            try{
                Conn conn=new Conn();
                String query="insert into drivers(name,age,gender,company,brand,available,location)values('"+name+"','"+age+"','"+gender+"','"+company+"','"+brand+"','"+available+"','"+location+"')";
                        conn.s.executeUpdate(query);
                        
                        JOptionPane.showMessageDialog(null,"New Driver added successfully");
            setVisible(false);
            }catch(Exception e){
                
            }
        }else{
        setVisible(false);
    }
    }
    
    
    public static void main(String[] args){
        new AddDrivers();

}}
