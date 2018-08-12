package arrayList.livaria;

public class Test {
	public static void main(String[] args) {
		
		Livro l1 = new Livro(new Autor("Deitel", "deitel@bol.com"), "Java", "Como Programar", "1234", 250);
		Livro l2 = new Livro(new Autor("Deitel", "deitel@bol.com"), "Java", "Como Programar", "1235", 320);
		Livro l3 = new Livro(new Autor("Jock", "jock@out.com"), "PHP", "OO", "1236", 270);
		
		Livraria livraria = new Livraria();
		livraria.addLivro(l1);
		livraria.addLivro(l2);
		livraria.addLivro(l3);
		
		//livraria.listaLivros();
		
		try {
			for (Livro livro : livraria.buscaLivroPorAutor("deitel"));
				//System.out.println(livro);
		} catch (NullPointerException e) {
			System.out.println("Error: " + e);
		}
		
		System.out.println("\n" + livraria.buscaLivroPorTitulo("Java", "1235"));
		
	}
}
