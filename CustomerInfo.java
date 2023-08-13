package hotel.management.system1;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.*;

public class  CustomerInfo extends JFrame implements ActionListener{
   JTable table;
   JButton back;
          
    CustomerInfo(){
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);
       
       
       
       JLabel l1=new JLabel("Document Type");
       l1.setBounds(10,10,100,20);
       add(l1);
       
       JLabel l2=new JLabel("ID");
       l2.setBounds(130,10,100,20);
       add(l2);
       
       JLabel name=new JLabel("Name");
       name.setBounds(250,10,100,20);
       add(name);
       
       
       JLabel l3=new JLabel("Gender");
       l3.setBounds(380,10,100,20);
       add(l3);
       
       JLabel l4=new JLabel("Country");
       l4.setBounds(500,10,100,20);
       add(l4);
       
        JLabel l5=new JLabel("Room No");
       l5.setBounds(630,10,100,20);
       add(l5);
       
       JLabel l6=new JLabel("Checkinn Time");
       l6.setBounds(750,10,100,20);
       add(l6);
       
       JLabel l7=new JLabel("Deposit");
       l7.setBounds(880,10,100,20);
       add(l7);
       
       
       
       
       
        
       table=new JTable();
       table.setBounds(0,40,1000,400);
       add(table);
       
       try{ 
           Conn c=new Conn();
           ResultSet rs=c.s.executeQuery("select * from customers");
           table.setModel(DbUtils.resultSetToTableModel(rs));
       }catch (Exception e){
           e.printStackTrace();
       }
       
       back=new JButton("Back");
       back.setForeground(Color.WHITE);
       back.setBackground(Color.BLACK);
       back.addActionListener(this);
       back.setBounds(420,500,120,30);
       add(back);
        
        
        setBounds(300,200,1000,600);
       setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==back){
            setVisible(false);
            new Reception();
        }
    }
    public static void main(String[] args){
        new CustomerInfo();
    } 
}


