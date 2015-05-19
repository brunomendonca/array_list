package br.com.calc;

import javax.swing.JOptionPane;

public class CalcMain {
  static int menu;
	public static void main(String[] args) {
	 
	  CauculaMetodos calc = new CauculaMetodos();
     do{
    	 menu	=Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha Uma Operação"+"\n"+"1 - Somar"+"\n"+"2 - Dividir"+"\n"+"3 - Multiplicar"+"\n"+"4 - Subtrair"+"\n"+"0 - Sair"));
    	 if(menu ==1){
    		calc.somar(); 
    	 }
    	 if(menu==2){
    		calc.dividir(); 
    	 }
    	 if(menu == 3){
    		calc.multiplicar(); 
    	 }
    	 if(menu==4){
    		 calc.subtrair();
    	 }	 
    
     }while(menu > 0);
    	 
     }
	}


