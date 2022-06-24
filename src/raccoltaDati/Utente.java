package raccoltaDati;

public class Utente {
	
	//attributi
	private String nome,cognome,email,password;
	private int eta;
	
	
	
	//costruttore
	public Utente(String nome, String cognome, String email, String password, int eta) throws Exception  {
	
		
		
		
		
		
		//this del costruttore
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.password = password;
		this.eta = eta;
		
		
		this.controlloEmail();
		this.controlloPassword();
		this.controlloEta();
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
	
	//metodo di stampa finale
	public String toString() {
		return "il tuo nome è: " + nome + " il tuo cognome è: " + cognome + " la tua età è: " + eta + 
				" la tua email è: " + email + " la tua password è: " + password;
	}
	
	public void controlloPassword() throws Exception {
        if ( password.length()<8 || password.length()>12)
            throw new Exception("La password deve contenere tra gli 8 e i 12 caratteri");
       
    }
	
	 public void controlloEmail() throws Exception {
	        if ( !(email.contains("@")) || !(email.contains(".") ))
	            throw new Exception(" La mail deve contenere un '@' e un '.'");
	        
	    }
	
	  public void controlloEta() throws Exception {
	        if (eta<18)
	            throw new Exception("Devi avere più di 18 anni");
	    
	    }
	
}
