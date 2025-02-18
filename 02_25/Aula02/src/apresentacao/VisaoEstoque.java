package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Estante;
import negocio.Produto;

public class VisaoEstoque {

	public static void main(String[] args) {
		//variaveis
		
		BufferedReader rd = new BufferedReader (new InputStreamReader(System.in));
		Produto objProduto = new Produto();
		
		//entrada 
		try {
			System.out.println("Digite o nome: ");
			objProduto.setNome(rd.readLine());
			
			System.out.println("Digite o número da estante: ");
			objProduto.setObjEstante(new Estante(Integer.parseInt(rd.readLine()))); //integer.parseInt transforma inteiro para string 
			
			System.out.println("Digite a quantidade: ");
			objProduto.setQuantidade(Integer.parseInt(rd.readLine())); //integer.parseInt transforma inteiro para string 
			
			
		} catch (Exception erro) {
			System.out.println("Erro: " + erro);
		}

		
		//saida
		System.out.println("Nome: " + objProduto.getNome());
		System.out.println("Numero da estante: " + objProduto.getObjEstante().getNumero());
		System.out.println("Quantidade: " + objProduto.getQuantidade());
	}

}
