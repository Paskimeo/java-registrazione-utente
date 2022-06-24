package raccoltaDati;

import java.util.Scanner;

public class Registrazione {
	
public static void main(String[] args) 
{
Scanner scan = new Scanner(System.in);
	
	
	try 
	{
		
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
	      
	      Utente creazioneUtente = new Utente(nome, cognome, email, password, eta);
	      System.out.println(creazioneUtente);
	      System.out.println("Grazie, per aver creato il tuo account");
	      
	      
	}catch (NumberFormatException etaSbagliata) {
	      System.out.println("impossibile completare la registrazione");
	      System.out.println(etaSbagliata.getMessage());
	    } 
	
	 catch (Exception e) {
	      System.out.println("impossibile ocmpletare la registrazione");
	      System.out.println(e.getMessage());
	    }
	
	finally {
	      // codice che deve essere eseguito sempre
	      System.out.println("Arrivederci");
	    }


	    scan.close();

	
}
}
