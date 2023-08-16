package com.alura.ConversorMoneda;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Menu extends Frame implements ActionListener {
	
	private JLabel label1, label2, label3;
	private JTextField textField1, textField2;
	private JButton button1;
	public JComboBox<String> combo1;
	

	public Menu() {
		
		setLayout(null);
		label1 = new JLabel("Conversor de Monedas");
		label1.setBounds(10, 20, 300, 30);
		add(label1);
		
		label2 = new JLabel("Ingrese el Monto: ");
		label2.setBounds(50, 50, 100, 30);
		add(label2);
		
		label3 = new JLabel("Resultado: ");
		label3.setBounds(50, 200, 100, 30);
		add(label3);
		
		textField1 = new JTextField();
		textField1.setBounds(150, 55, 150, 25);
		add(textField1);
		
		button1 = new JButton("Convertir");
		button1.setBounds(50, 150, 100, 30);
		add(button1);
		button1.addActionListener(this);
		
		combo1 = new JComboBox<String>();
		combo1.setBounds(100, 100, 200, 30);
		add(combo1);
		
		textField2 = new JTextField();
		textField2.setBounds(120, 200, 150, 25);
		add(textField2);
		
		combo1.addItem("Convertir de Bs a Dolar");
		combo1.addItem("Convertir de Bs a Euro");
		combo1.addItem("Convertir de Bs a Libras Esterlinas");
		combo1.addItem("Convertir de Bs a Yen Japones");
		combo1.addItem("Convertir de Bs a Real");
		//combo1.addItemListener((ItemListener) this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button1) {
			double monto = Double.valueOf(textField1.getText());
			String resultado;
			
			//Convertir de Bs a $
			/*if (combo1.getSelectedIndex() == 0) {
				resultado = String.valueOf(monto * 0.14);
				textField2.setText(resultado);		
			}*/
			
			switch (combo1.getSelectedIndex()) {
				case 0:
					resultado = String.valueOf(monto *0.14);
					textField2.setText(resultado);
					break;
				case 1:
					resultado = String.valueOf(monto *0.13);
					textField2.setText(resultado);
					break;
				case 2:
					resultado = String.valueOf(monto *0.11);
					textField2.setText(resultado);
					break;
				case 3:
					resultado = String.valueOf(monto *21.12);
					textField2.setText(resultado);
					break;
				case 4:
					resultado = String.valueOf(monto *0.72);
					textField2.setText(resultado);
					break;
					
				default:
					break;
				}
		}
		
	}
	
	public void itemStateChanged(ItemEvent e) {
		
		if (e.getSource() == combo1) {
			//String resultado;
			if (combo1.getSelectedIndex() == 1) {
				//resultado = textField1.getText();
				//resultado = textField2.toString();
			}
		}
	}
	
}
