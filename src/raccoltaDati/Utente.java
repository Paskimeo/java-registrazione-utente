package raccoltaDati;

public class Utente {
	
	//attributi
	String nome,cognome,email,password;
	int eta;
	
	
	
	//costruttore
	public Utente(String nome, String cognome, String email, String password, int eta) throws Exception  {
	
		//metodi di validazione
		if(eta < 18){
		      throw new Exception("Km deve essere maggiore di 0");
	    }
		
		 if ( !(email.contains("@")) || !(email.contains(".") )) {
	            throw new Exception("La mail deve contenere un '@' e un '.'");
		 
		 }
		 
	     if (password.length()<8 || password.length()>12) {
	        throw new Exception("La password deve contenere tra gli 8 e i 12 caratteri");
	     }
		
		
		
		
		//this del costruttore
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.password = password;
		this.eta = eta;
	}


	//get e set del costruttore
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCognome() {
		return cognome;
	}



	public void setCognome(String cognome) {
		this.cognome = cognome;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public int getEta() {
		return eta;
	}



	public void setEta(int eta) {
		this.eta = eta;
	}
	
	
	
}
