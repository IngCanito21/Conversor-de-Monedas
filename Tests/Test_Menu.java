package com.alura.Tests;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

import com.alura.ConversorMoneda.Menu;

public class Test_Menu {

	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.setBounds(0, 0, 400, 500);
		menu.setVisible(true);
		menu.setLocationRelativeTo(null);
		menu.setLocationRelativeTo(null);
		//menu.Cerrar();
		
		
		
		menu.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent evt) {
				int opcion =0;
				
				opcion = JOptionPane.showConfirmDialog(menu, "¿Seguro que desea cerrar el Progama?", "Aviso", 
						JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				switch (opcion) {
				case JOptionPane.YES_OPTION:
					System.exit(0);
					break;
				case JOptionPane.NO_OPTION:
					break;
				case JOptionPane.CLOSED_OPTION:
					break;
				default:
					break;
				}
			}
		});
	}
}
