package Monitoring;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;
import javax.swing.*;  

public class Gui {

	
	
	public  void name() {
		
		JFrame f=new JFrame("Herr Bert Monitoring");//creating instance of JFrame  
		
		
		Color c1 = new Color(132,195,190);//RGB Color Code
		f.getContentPane().setBackground(c1);//Sets the background color to the one saved in "c1"
		ImageIcon img = new ImageIcon("E:/Herrbert.png");//Sets the Path for the icon "img"
		f.setIconImage(img.getImage());//Sets the Frame icon to the one saved in "img"
		
		
		JLabel l1 = new JLabel("Anzahl Prozesse");
		l1.setBounds(30,10,100,40);//x axis, y axis, width, height  
		l1.setVisible(true);
		
		JTextArea t1 = new JTextArea();
		t1.setBounds(30,100,100, 40);//x axis, y axis, width, height  
		t1.setEditable(false);
		t1.setText("test");
		
		JButton b1=new JButton("click");//creating instance of JButton  
		b1.setBounds(130,100,100, 40);//x axis, y axis, width, height  
		
		
		
		JLabel l2 = new JLabel("Maximaler Arbeitsspeicher");
		l2.setBounds(30,210,200,40);//x axis, y axis, width, height  
		l2.setVisible(true);
		
		JTextArea t2 = new JTextArea();
		t2.setBounds(30,300,100, 40);//x axis, y axis, width, height  
		t2.setEditable(false);
		t2.setText("test");
		
		JButton b2=new JButton("click");//creating instance of JButton  
		b2.setBounds(130,300,100, 40);//x axis, y axis, width, height  
//		b2.addActionListener(new ActionListener() {
//	        @Override
//	        public void actionPerformed(ActionEvent arg0) {
//	            t2.setText("new value");
//	        }
//	    });

		
	
		
		f.add(t1);
		f.add(t2);
		f.add(l1);
		f.add(l2);
		f.add(b1);//adding button in JFrame  
		f.add(b2);//adding button in JFrame  
		
		f.setSize(400,500);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible  
		
		
		int abc = 0;
		while (true) {
			
			t1.setText(String.valueOf(abc));
				t2.setText(String.valueOf(abc));
		abc++;
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("yo ich kann nicht schlafen. Manno ");
		}
			
		}

	}
	
	
	}  




