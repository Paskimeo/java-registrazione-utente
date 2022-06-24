package raccoltaDati;

import java.util.Scanner;

public class Registrazione {
 Scanner scan = new Scanner(System.in);
	
	
	try {
		
	      //richiesta nome
		  System.out.print("Inserisci il tuo nome: ");
	      String nome = scan.nextLine();
	      
	      
	      //richiesta cognome
	      System.out.print("Inserisci il tuo cognome: ");
	      String cognome = scan.nextLine();
		
	      //richeista età
	      System.out.print("Inserisci la tua età: ");
	      String inputEta = scan.nextLine();
	      int eta = Integer.parseInt(inputEta);
		
	      //richiesta password
	      System.out.print("Inserisci la tua password: ");
	      String password = scan.nextLine();
		
	      //richiesta email
	      System.out.print("Inserisci la tua email: ");
	      String email = scan.nextLine();
		
	}
	

}
