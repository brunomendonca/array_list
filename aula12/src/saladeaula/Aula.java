package saladeaula;

import javax.swing.JOptionPane;

public class Aula {
 
	public static void main(String[]args){
	
		
	int codigo []=new int[2];
	String descricao[]=new String[2];
	float preco[]=new float[2];
		int quantidade[]=new int[2];
		float tatal[]=new float[2];
		 
		for(int i=0;i<=2; i++);{
			
			codigo[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"digite o codigo"));
			descricao[i]=JOptionPane.showInputDialog(null,"descrevar: ");
			preco[i]=Float.parseFloat(JOptionPane.showInputDialog(null,"Didite o valor:"));
			quantidade[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"digite a quantidade:"));
			total[i]=preco*quantiade[i];
		}
			
		for(int a=0; a<=2; a++){
			JOptionPane.showMessageDialog(null, descricao [a]);
		}
		
 
	}
}
