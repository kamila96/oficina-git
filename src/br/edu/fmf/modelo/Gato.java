package br.edu.fmf.modelo;

import javax.swing.JOptionPane;

public class Gato {
	
	//atributos
	private String cor;
	private String nome;
	private int idade;

	//m�todos
	public void comer(){
		
		JOptionPane.showMessageDialog(null, "alerta", "O gato esta dormindo", JOptionPane.ERROR_MESSAGE);
	}
}


