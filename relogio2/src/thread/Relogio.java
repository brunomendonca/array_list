package thread;

import javax.swing.*;

public class Relogio extends JFrame {

	public Relogio(){
		
	 JPanel tela = new JPanel();
	 tela.setBounds(10, 10, 20, 70);
	 
	 JLabel texto =new JLabel ();
	 RelogioHora re = new RelogioHora(texto);
	   re.start();
	 
	 tela.add(texto);
	 setContentPane(tela);
	 
	 
	
	}
}
