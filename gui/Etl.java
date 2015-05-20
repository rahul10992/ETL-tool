package gui;
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.*;
public class Etl extends JFrame {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Etl frame = new Etl();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Etl() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);		
		JButton btnNewButton_1 = new JButton("Transform and Load");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CompleteRun.finalTransfer();
			}
		});
		btnNewButton_1.setBounds(174, 111, 208, 23);
		getContentPane().add(btnNewButton_1);		
		JButton btnNewButton_2 = new JButton("extract");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CompleteRun.populateData();
				CompleteRun.extractData();
			}
		});
		btnNewButton_2.setBounds(10, 111, 89, 23);
		getContentPane().add(btnNewButton_2);
	}
}

