package arrayList.livaria;

public class Livro {
	//Atributos
	private Autor autor;
	private String titulo, descricao, isbn;
	private double valor;
	
	//Metodos Especiais
	public Livro(Autor autor, String titulo, String descricao, String isbn, double valor) {
		this.autor 		= autor;
		this.titulo		= titulo;
		this.descricao 	= descricao;
		this.isbn      	= isbn;
		this.valor	  	= valor;
	}

	public String getTitulo() {
		return titulo;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public Autor getAutor() {
		return autor;
	}


	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", descricao=" + descricao + ", isbn=" + isbn + ", valor=" + valor
				+ ", autor=" + autor + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( !(obj instanceof Livro) ) return false;
		if ( this == obj ) 			   return true;
		
		Livro livro = (Livro) obj;
		return (autor.equals(livro.autor) && titulo.equalsIgnoreCase(livro.titulo) && valor == livro.valor &&
				descricao.equalsIgnoreCase(livro.descricao) && isbn.equalsIgnoreCase(livro.isbn));
	}
	
	@Override 
	public Livro clone() {
		return new Livro(autor, titulo, descricao, isbn, valor);
	}
	
	

	




	


	
	

}
