package estacoes;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class estacao {
	
	public void clima() {
		
		//Scanner tec = new Scanner(System.in);
		//System.out.println("Digite um número: ");
		//int tipo = tec.nextInt();
		
		
		int tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		String estacao;
		
		switch (tipo) {
		    case 1:
		    	estacao = "Primavera";
		    	break;
		    case 2:
		    	estacao = "Verão";
		    	break;
		    case 3:
		    	estacao = "Outono";
		    	break;
		    case 4:
		    	estacao = "Inverno";
		    	break;
		    default:
		    	estacao = "Opção inválida";
		    	break;
		}
		JOptionPane.showMessageDialog(null,estacao);
		System.out.println(estacao);
	}

}
