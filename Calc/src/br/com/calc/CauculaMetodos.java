package br.com.calc;

import javax.swing.JOptionPane;

public class CauculaMetodos {

	
	public void somar(){
		double priValor;
		double segValor;
		priValor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o Primeiro Valor"));
		segValor = Double.parseDouble(JOptionPane.showInputDialog(null,"O Primeiro Valor foi "+ priValor+"\n"+"Digite o Segundo Valor :"));
		double soma = priValor + segValor;
		JOptionPane.showMessageDialog(null, "A Soma de"+priValor+"+"+segValor+"="+soma);
	}
	public void dividir(){
		double priValor;
		double segValor;
		priValor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o Primeiro Valor"));
		segValor = Double.parseDouble(JOptionPane.showInputDialog(null,"O Primeiro Valor foi "+ priValor+"\n"+"Digite o Segundo Valor :"));
		double dividir = priValor / segValor;
		JOptionPane.showMessageDialog(null, "A Divisão de"+priValor+"\""+segValor+"="+dividir);
	}
	public void subtrair(){
		double priValor;
		double segValor;
		priValor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o Primeiro Valor"));
		segValor = Double.parseDouble(JOptionPane.showInputDialog(null,"O Primeiro Valor foi "+ priValor+"\n"+"Digite o Segundo Valor :"));
		double subtrair = priValor - segValor;
		JOptionPane.showMessageDialog(null, "A Subtração de"+priValor+"-"+segValor+"="+subtrair);
	}
	public void multiplicar(){
		double priValor;
		double segValor;
		priValor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o Primeiro Valor"));
		segValor = Double.parseDouble(JOptionPane.showInputDialog(null,"O Primeiro Valor foi "+ priValor+"\n"+"Digite o Segundo Valor :"));
		double multiplica = priValor * segValor;
		JOptionPane.showMessageDialog(null, "A Multiplicação de"+priValor+"*"+segValor+"="+multiplica);
	}
}
