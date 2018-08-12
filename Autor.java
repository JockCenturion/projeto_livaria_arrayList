package arrayList.livaria;

public class Autor {
	//Atributos
	private String nome, email;
	
	//Metodos Especiais
	public Autor(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	@Override
	public String toString() {
		return ("[Nome=" + this.nome + " (" + this.email + ")]");
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( !(obj instanceof Autor) ) return false;
		if ( this == obj ) 			   return true;
		
		Autor autor = (Autor) obj;
		return (nome.equalsIgnoreCase(autor.nome) &&
				email.equalsIgnoreCase(autor.email));
	}
	
	@Override
	public Autor clone() {
		return new Autor(this.nome, this.email);
	}
	
	

}
