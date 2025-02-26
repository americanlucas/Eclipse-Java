package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Compra;
import negocio.Produto;
import negocio.Tipo;

public class VisaoAmazon {

	public static void main(String[] args) {
		//variaveis
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		Compra objCompra = new Compra();
		Produto objProduto = new Produto();
		
		//entrada
		try {
			System.out.println("Digite o nome do produto: ");
			objProduto.setNome(rd.readLine());	
			
			System.out.println("Digite o tipo do produto: ");
			objProduto.setObjTipo(new Tipo(rd.readLine()));
			
			System.out.println("Digite o preço do produto: ");
			objProduto.setPreco(Double.parseDouble(rd.readLine()));
			
			objCompra.setObjProduto(objProduto);
			
			System.out.println("Digite a quantidade: ");
			objCompra.setQtd(Integer.parseInt(rd.readLine()));
			
			System.out.println("Digite a data da compra: ");
			objCompra.setData(rd.readLine());
			
			System.out.println("Digite a forma de pagamento: ");
			objCompra.setCartao(rd.readLine());
			
			
		} catch (Exception erro) {
			System.out.println("ERRO!" + erro);
		}
		
		//saida
		System.out.println();
		System.out.println("Nome: " + objCompra.getObjProduto().getNome());
		System.out.println("Descrição: " + objCompra.getObjProduto().getObjTipo().getDescricao());
		System.out.println("Preço: R$ " + objCompra.getObjProduto().getPreco());
		System.out.println("Quantidade: " + objCompra.getQtd());
		System.out.println("Data: " + objCompra.getData());
		System.out.println("Método de Pagamento: " + objCompra.getCartao());
	}

}
