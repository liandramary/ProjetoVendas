import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int op;
		Cliente cliente = new Cliente();
		Vendedor vendedor = new Vendedor();
		Produto produto = new Produto();
		
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
		op = sc.nextInt();
		
		switch (op) {
		case 1:
			System.out.println("\n---- CADASTRAR CLIENTE ----");
			
			System.out.println("Digite o nome do cliente:");	
			cliente.setNome(sc.next());	
			
			System.out.println("Digite o CPF do cliente:");	
			cliente.setCpf(sc.next());	
			
			System.out.println(cliente.getNome());
			System.out.println(cliente.getCpf());
			
			break;
		case 2:
			System.out.println("\n---- LISTAR CLIENTES ----");
			break;
		case 3:
			System.out.println("\n---- CADASTRAR VENDEDOR ----");
			
			System.out.println("Digite o nome do vendedor:");	
			vendedor.setNome(sc.next());	
			
			System.out.println("Digite o CPF do vendedor:");	
			vendedor.setCpf(sc.next());	
			
			System.out.println(vendedor.getNome());
			System.out.println(vendedor.getCpf());
			
			break;
		case 4:
			System.out.println("\n---- LISTAR VENDEDORES ----");
			break;
		case 5:
			System.out.println("\n---- CADASTRAR PRODUTO ----");
			
			System.out.println("Digite o nome do produto:");	
			produto.setNome(sc.next());	
			
			System.out.println("Digite o preço do produdo:");	
			produto.setPreço(sc.nextDouble());	
			
			System.out.println("Digite a quantidade do produto:");	
			produto.setQuantidade(sc.nextInt());	
			
			System.out.println(produto.getNome());
			System.out.println(produto.getPreço());
			System.out.println(produto.getQuantidade());
			
			break;
		case 6:
			System.out.println("\n---- LISTAR PRODUTOS ----");
			break;
		case 7:
			System.out.println("\n---- REGISTRAR VENDA ----");
			break;
		case 8:
			System.out.println("\n---- LISTAR VENDAS ----");
			break;
		case 9:
			System.out.println("\n---- LISTAR VENDAS POR CLIENTE ----");
			break;
		case 0:
			System.out.println("\nAté Logo!");
			break;
		default:
			System.out.println("\nOpção inválida!");
			break;
		}
		
		} while (op != 0);
		
		sc.close();
		
	}

}
