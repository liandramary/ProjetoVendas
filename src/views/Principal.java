package views;
import java.util.Scanner;

import models.Venda;


public class Principal {
	private static Scanner sc = new Scanner(System.in);
	Venda venda = new Venda();
	public static void main(String[] args) {
		
		int opcao;	
		do {
			System.out.println("\n---- PROJETO DE VENDAS ----");	
			System.out.println("\n**** MENU ****\n");
		
			System.out.println("1 – Cadastrar Cliente");
			System.out.println("2 – Listar Clientes");
			System.out.println("3 – Cadastrar Vendedor");
			System.out.println("4 – Listar Vendedores");
			System.out.println("5 – Cadastrar Produto");
			System.out.println("6 – Listar Produtos");
			System.out.println("7 – Registrar Venda");
			System.out.println("8 – Listar Vendas");
			System.out.println("9 – Listar Vendas por Cliente");
			System.out.println("0 – Sair");
			
			System.out.println("\nDigite a opção desejada: ");
			opcao = sc.nextInt();
		
			switch (opcao) {
			case 1:	
				CadastrarCliente.renderizar();
				break;
			case 2:	
				ListarClientes.renderizar();
				break;
			case 3:	
				CadastrarVendedor.renderizar();
				break;
			case 4:	
				ListarVendedores.renderizar();
				break;
			case 5:	
				CadastrarProduto.renderizar();
				break;
			case 6:	
				ListarProdutos.renderizar();
				break;
			case 7:	
				CadastrarVenda.renderizar();
				break;
			case 8:
				
				break;
			case 9:
				
				break;
			case 0:	
				System.out.println("\nSaindo...");			
				break;
			default:
				System.out.println("\nOpção inválida!");
				break;
			}
		} while (opcao != 0);	
	}
}

