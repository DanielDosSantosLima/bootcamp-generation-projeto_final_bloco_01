package menu;

import java.util.Scanner;
import conta.model.Produto;

public class Menu {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Produto produto1 = new Produto(1, "Memórias Póstumas de Brás Cubas", 50.00);
		Produto produto2 = new Produto(2, "O Cortiço", 39.99);
		Produto produto3 = new Produto(3, "Til", 45.00);
		produto1.visualizar();

		int opcao;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                   LIVRARIA COMETA	                 ");
			System.out.println("            (funcionalidades para o lojista)         ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Cadastro                       ");
			System.out.println("            2 - Listar todas os Cadastros            ");
			System.out.println("            3 - Buscar Cadastro por Número           ");
			System.out.println("            4 - Atualizar Dados do Cadastro          ");
			System.out.println("            5 - Ver Produtos                         ");
			System.out.println("            6 - Saiba mais                           ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 6) {
				System.out.println("\n'Livraria Cometa: conectando mentes e planetas'");
				sobre();
                leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("Criar Cadastro\n\n");
					break;
				case 2:
					System.out.println("Listar todas os Cadastros\n\n");
					break;
				case 3:
					System.out.println("Buscar Cadastro por Número\n\n");
					break;
				case 4:
					System.out.println("Atualizar Dados do Cadastro\n\n");
					break;
				case 5:
					System.out.println("Ver Produtos\n\n");
					break;
				default:
					System.out.println("Opção Inválida, tente novamente!");
					break;
			}
		}
	}
    
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("github.com/conteudoGeneration");
		System.out.println("*********************************************************");
	}
}