package com.exemploLivro;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
      menu();

	}

public static void menu(){
	 boolean verdade = true;
	 
	 
	 ArrayList<Cliente> contados = new ArrayList<>();
	 Lista lista = new Lista();
	while(verdade){	
		int	f =Integer.parseInt(JOptionPane.showInputDialog(null,"Digite"+"\n"+"1 Adicionar  cliente"+"\n"+"2 Excluir cliente"+"\n"+"3 listar cliente"+"\n"+"4 sair"));
		
		if(f==1){
			lista.adicionar();
		}else if(f==2){
			String nomeDel = JOptionPane.showInputDialog(null,"Digite um nome pra deletar :");
		
		}else if (f==3){
	      lista.lista();
		}else if(f==4){
			System.exit(0);
		}
	}
  }
}

