package aula1;

import javax.swing.JOptionPane;

public class Teste1 {

static int x=0;
static int y=5;
static int recebe; 
public static void main(String[]args){
	
	entradaDeDados();
	compararValor();
	
}
public static void entradaDeDados(){
	
     recebe =Integer.parseInt(JOptionPane.showInputDialog(null,"digite um valor","ENTRADA DE DADOS",JOptionPane.WARNING_MESSAGE));
}
	public static void compararValor(){
	
	if(x == recebe || y== recebe){
		
JOptionPane.showMessageDialog(null,"O valor Digitado e Igual á x ou y"
		+ "");

System.out.println(x+"é igual a "+y);


	}else{
		
	
	JOptionPane.showMessageDialog(null,"O valor informado é diferente de x e y");	
		System.out.println(x+"é diferente de "+y);
	}
 }
}
