package thread;

import java.awt.*;
import java.util.*;

import javax.swing.*;


public class RelogioHora extends Thread {

	JLabel texto;
	public RelogioHora(JLabel texto){
		this.texto =texto;
		
	}
  public void run(){
	  while (true){
		  try{
			  Calendar calendario= new GregorianCalendar();
			  Date hora = new Date ();
			  calendario.setTime(hora);
			  texto.setText(calendario.get(Calendar.HOUR_OF_DAY)+ ":"+calendario.get(Calendar.MINUTE)+ ":"+ calendario.get(Calendar.SECOND));
			  
			  
			  texto.setFont(new Font ("TimesRoman",Font.BOLD,50));
			  texto.setForeground(new Color (40,300,60));
			  Thread.sleep(1000);
			  
		  
		 }catch(Exception e){
		  
	  }
  }

  }

	
}
	
