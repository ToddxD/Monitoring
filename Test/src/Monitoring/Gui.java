package Monitoring;

import java.awt.Color;
import java.util.concurrent.TimeUnit;
import javax.swing.*;

public class Gui {

	public void create() {

		JFrame jFrame = new JFrame("Herr Bert Monitoring");
		

		jFrame.getContentPane().setBackground(new Color(132, 195, 190));
		ImageIcon img = new ImageIcon("E:/Herrbert.png");
		jFrame.setIconImage(img.getImage());

		JLabel labelProzesse = new JLabel("Anzahl Prozesse");
		labelProzesse.setBounds(30, 10, 100, 40);
		labelProzesse.setVisible(true);

		JTextArea textProzess = new JTextArea();
		textProzess.setBounds(30, 100, 100, 40);
		textProzess.setEditable(false);
		
		JTextArea textProzessWarnung = new JTextArea();
		textProzessWarnung.setBounds(200, 100, 100, 40);
		textProzessWarnung.setEditable(false);

		JLabel labelArbeitspeicher = new JLabel("Maximaler Arbeitsspeicher");
		labelArbeitspeicher.setBounds(30, 210, 200, 40);
		labelArbeitspeicher.setVisible(true);

		JTextArea textArbeitsspeicher = new JTextArea();
		textArbeitsspeicher.setBounds(30, 300, 100, 40);
		textArbeitsspeicher.setEditable(false);
		
		JTextArea textArbeitsspeicherWarnung = new JTextArea();
		textArbeitsspeicherWarnung.setBounds(200, 300, 100, 40);
		textArbeitsspeicherWarnung.setEditable(false);
		
		jFrame.add(textProzess);
		jFrame.add(textArbeitsspeicher);
		jFrame.add(labelProzesse);
		jFrame.add(labelArbeitspeicher);
		jFrame.add(textArbeitsspeicherWarnung);
		jFrame.add(textProzessWarnung);
		
		jFrame.setSize(400, 500);
		jFrame.setLayout(null);
		jFrame.setVisible(true);

		MysqlCon connector = new MysqlCon();

		while (true) {
			connector.connect();
			
			float arbeitsspeicher = connector.getArbeitsspeicher();
			int prozess = connector.getProzess();
			
			textArbeitsspeicher.setText(arbeitsspeicher + "");
			textProzess.setText(prozess + "");
			
			if (arbeitsspeicher < 15.63) {
				textProzessWarnung.setText("ACHTUNG!");
			}
			else {
				textProzessWarnung.setText("Alles in Ordnung");
			}
			
			if (prozess > 300) {
				textArbeitsspeicher.setText("ACHTUNG!");
			}
			else {
				textArbeitsspeicherWarnung.setText("Alles in Ordnung");
			}
			
			
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.err.println("yo ich kann nicht schlafen. Manno ");
			}

		}
	}

}
