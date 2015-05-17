package com.exemploLivro;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Lista {
	static int cont;
	Cliente cliente = new Cliente();
	         public void adicionar(){
	        	  cont = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite quantos clientes você quer adicionar"));
        	 for(int i = 0;i <= cont; i++){
					cliente.setCodigo(Integer.parseInt( JOptionPane.showInputDialog(null,"Digite o codigo do cliente :")));
					 cliente.setNome( JOptionPane.showInputDialog(null,"Digite o nome do cliente:"));
					cliente.setTelefone(JOptionPane.showInputDialog(null,"Digite o nímero do telefone:"));
				
				}
         }

public void lista(){
	 
for(int i = 0;i <=cont ; i++){
		JOptionPane.showMessageDialog(null, "listas de clientes" +"\n"+cliente.getCodigo()
				+"\n"+"Nome"+cliente.getNome() +"\n"+ "telefone:"+cliente.getTelefone());
	
	}
}
}
