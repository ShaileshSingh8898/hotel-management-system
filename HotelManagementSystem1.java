
package hotel.management.system1;
import javax.swing.*;
 import java.awt.*;
import java.awt.event.*;

public  class HotelManagementSystem1  extends JFrame implements ActionListener{
HotelManagementSystem1(){
    setSize(1366, 565 );  
    setLocation(100,100);
    setLayout(null);
     ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
     JLabel image=new JLabel (i1);
     image.setBounds(0,0,1366,565);
      add(image);
     
     JLabel text=new JLabel("HOTEL MANAGEMENT SYSTEM");
             text.setBounds(20,430,1000,90);
             text.setForeground(Color.WHITE);
             text.setFont(new Font("sherif",Font.BOLD,40));
                     image.add(text);
             JButton next =new JButton("Next");
             next.setBounds(1150,450,150,50);
             next.setBackground(Color.WHITE);
             next.addActionListener(this);
             image.add(next);
     setVisible(true); 
     
     }

 public void actionPerformed(ActionEvent ae){
     setVisible(false);
     new Login();
 }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    new HotelManagementSystem1(); 
    
 
    }
   }
