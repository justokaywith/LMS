package library.management.system;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;

public class aboutUs extends JFrame{

	private JPanel contentPane;

        public static void main(String[] args) {
            new aboutUs().setVisible(true);			
	}
    
        public aboutUs() {
            
            super("About Us");
            setBounds(200, 300, 600, 300);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel l1 = new JLabel("New label");
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/logo.jpg"));
            Image i2 = i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l1 = new JLabel(i3);
            l1.setBounds(400, 40, 100, 100);
            contentPane.add(l1);


            JLabel l3 = new JLabel("Library");
            l3.setForeground(new Color(0, 127, 255));
            l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l3.setBounds(70, 40, 150, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("Mangement System");
            l4.setForeground(new Color(0, 127, 255));
            l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l4.setBounds(70, 90, 405, 40);
            contentPane.add(l4);


            JLabel l5 = new JLabel("Muhammad Haris Rana - 2122 ");
            l5.setFont(new Font("Trebuchet MS", Font.BOLD , 20));
            l5.setBounds(70, 150, 500, 34);
            contentPane.add(l5); 
            
            JLabel l6 = new JLabel("Shayan Mehfoz - 2298 ");
            l6.setFont(new Font("Trebuchet MS", Font.BOLD , 20));
            l6.setBounds(70, 170, 500, 34);
            contentPane.add(l6);
            contentPane.setBackground(Color.WHITE);
            
             JLabel l7 = new JLabel("Obaidullah - 2298 ");
            l7.setFont(new Font("Trebuchet MS", Font.BOLD , 20));
            l7.setBounds(70, 190, 500, 34);
            contentPane.add(l7);
            contentPane.setBackground(Color.WHITE);
            
       
	}
        
        

}

