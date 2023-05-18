package projetoExceptions;
import java.util.Scanner;

import java.util.ArrayList;
public class NomeProduto {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean continuar = true; 
		ArrayList<String> lista = new ArrayList<String>();
		while(continuar) {
			System.out.println("Insira o nome do produto: ");
			String nomeProduto = input.next();
			
			try {
				verificarLista(lista, nomeProduto);
			} catch (NomeIgualException e) {
				System.out.println("Erro: "+e.getMessage());
				continue;
			}
			lista.add(nomeProduto);
			
			System.out.println("Produtos: "+lista);
			System.out.println("Deseja continuar (S/N)?");
			String resposta = input.next();
			if(resposta.equals("n")) {
				continuar = false;
			}
			
		}
	}
	
	public static void verificarLista(ArrayList<String> lista, String nomeProduto) throws NomeIgualException  {
		for(int i=0; i<lista.size(); i++) {
			if(nomeProduto.equals(lista.get(i))) {
				throw new NomeIgualException("Nome do produto ja existe!");
			}
		}
	
	}
}
