package conta.model;

public class Produto {

	private int codigo;
	private String nome;
	private double preco;
	
	public Produto(int codigo, String nome, double preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setDescricao(String nome) {
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void exibirProduto() {
		System.out.println("Código: " + codigo);
		System.out.println("Nome: " + nome);
		System.out.println("Preço: R$" + preco);
	}
	
	public void visualizar() {

		Int codigo = " ";
			
		switch(this.codigo) {
		case 1:
			nome = "Memórias Póstumas";
			break;
		case 2:
			nome = "O Cortiço";
			break;
		case 3:
			nome = "Til";
			break;
		}
			
			System.out.println("\n\n***********************************************************");
			System.out.println("Dados do Livro:");
			System.out.println("***********************************************************");
			System.out.println("Código: " + this.codigo);
			System.out.println("Nome: " + this.nome);
			System.out.println("Preço: " + this.preco);
			System.out.println("***********************************************************");
		
	}
	
}
