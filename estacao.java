package estacoes;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class estacao {
	
	public void clima() {
		
		//Scanner tec = new Scanner(System.in);
		//System.out.println("Digite um n�mero: ");
		//int tipo = tec.nextInt();
		
		
		int tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
		String estacao;
		
		switch (tipo) {
		    case 1:
		    	estacao = "Primavera";
		    	break;
		    case 2:
		    	estacao = "Ver�o";
		    	break;
		    case 3:
		    	estacao = "Outono";
		    	break;
		    case 4:
		    	estacao = "Inverno";
		    	break;
		    default:
		    	estacao = "Op��o inv�lida";
		    	break;
		}
		JOptionPane.showMessageDialog(null,estacao);
		System.out.println(estacao);
	}

}
