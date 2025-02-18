package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Autor;
import negocio.Livro;

public class VisaoLivraria {

	public static void main(String[] args) {
		// variaveis
		
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		Livro objLivro = new Livro();
		
		//entrada
		
		try {
			
			System.out.println("Digite o título do livro: ");
			objLivro.setTitulo(rd.readLine());
			
			System.out.println("Digite o nome do autor do livro: ");
			objLivro.setObjAutor(new Autor(rd.readLine())); //Usar quando o construtor tiver apenas uma propriedade(classe independente DENTRO do classe dependente
			
			System.out.println("Digite o genero do livro: ");
			objLivro.setGenero(rd.readLine());
			
		} catch (Exception erro) {
			System.out.println("ERRO!!!" + erro);
		}
		
		//saida
		
		System.out.println("Título: " + objLivro.getTitulo());
		System.out.println("Genero: " + objLivro.getGenero());
		System.out.println("Nome: " + objLivro.getObjAutor().getNome());
	}

}
