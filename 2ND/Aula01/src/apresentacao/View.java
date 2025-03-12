package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Pessoa;

public class View {
	public static void main (String[] args) {
		//VARIAVEIS
		
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in)); //CTRL+SHIFT+O
		
		Pessoa objeto1 = new Pessoa(); //INSTANCIA DE OBJETO
		
		//ENTRADA DE DADOS
		
		try {
			System.out.println("Digite o nome da pessoa: ");
			objeto1.setNome(leitor.readLine());
			
			System.out.println("Digite o endereço da pessoa: ");
			objeto1.setEndereco(leitor.readLine());
			
			System.out.println("Digite o telefone da pessoa: ");
			objeto1.setTelefone(leitor.readLine());
			
		} catch (Exception erro) {}
		
		//SAIDA DE DADOS
		
		System.out.println("Nome: %f" + objeto1.getNome());
		System.out.println("Endereco: " + objeto1.getEndereco());
		System.out.println("Telefone: " + objeto1.getTelefone());
	}
}
