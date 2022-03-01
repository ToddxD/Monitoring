
import javax.swing.*;  

public class Gui {

	
	
	public  void name() {
		
		JFrame f=new JFrame();//creating instance of JFrame  
		
		
		
		
		JLabel l1 = new JLabel("Test");
		l1.setBounds(30,10,100,40);
		l1.setVisible(true);
		
		JTextArea t1 = new JTextArea();
		t1.setBounds(30,100,100, 40);
		t1.setEditable(false);
		t1.setText("test");
		
		JButton b=new JButton("click");//creating instance of JButton  
		b.setBounds(130,100,100, 40);//x axis, y axis, width, height  
		
		JLabel l2 = new JLabel("Test2");
		l2.setBounds(30,300,100,40);
		l2.setVisible(true);
		
		JTextArea t2 = new JTextArea();
		t2.setBounds(30,100,100, 40);
		t2.setEditable(false);
		t2.setText("test");
		
		
				
		
		f.add(b);//adding button in JFrame  
		f.add(t1);
		f.add(l1);
		
		f.setSize(1000,1000);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible  
	}
	
	
	}  

