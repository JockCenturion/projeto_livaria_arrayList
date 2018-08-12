package arrayList.livaria;

import java.util.ArrayList;
import java.util.Iterator;

public class Livraria {
	private ArrayList<Livro> livraria;
	
	public Livraria() {
		this.livraria = new ArrayList<>();
	}
	
	public void addLivro(Livro livro) {
		this.livraria.add(livro);
	}
	
	public void removeLivro(Livro livro) {
		this.livraria.remove(livro);
	}
	
	public Livro buscaLivroPorTitulo(String titulo, String isbn) {
		
		for (Livro livro : this.livraria) {
			if (livro.getTitulo().equalsIgnoreCase(titulo) &&
				livro.getIsbn().equalsIgnoreCase(isbn)) {
				return livro;
			}
		}
		return null;
	}
	
	public ArrayList<Livro> buscaLivroPorAutor(String nome) {
		ArrayList<Livro> listaLivros = new ArrayList<>();
		
		for (Livro livro : this.livraria) {
			Autor autor = livro.getAutor();
			if (autor.getNome().equalsIgnoreCase(nome))
				listaLivros.add(livro);
		}
		
		return (listaLivros.size() > 0 ? listaLivros : null);	
	}
	
	public void listaLivros() {
		Iterator<Livro> it = this.livraria.iterator();
		while (it.hasNext()) {
			System.out.println(it.next() + "\n");
		}
	}
	
	
}
