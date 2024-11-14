package conta.model;

public abstract class Produto {

	private int tipo;
	private String nome;
	private double preco;
	
	public Produto(int tipo, String nome, double preco) {
		this.tipo = tipo;
		this.nome = nome;
		this.preco = preco;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void visualizar() {
		
		String tipo = " ";
		
		switch(this.tipo) {
		case 1:
			tipo = "Livro";
			break;
		case 2:
			tipo = "Revista";
			break;
		}
			
			System.out.println("\n\n***********************************************************");
			System.out.println("Dados do Livro:");
			System.out.println("***********************************************************");
			System.out.println("Código: " + tipo);
			System.out.println("Nome: " + this.nome);
			System.out.println("Preço: " + this.preco);
			System.out.println("***********************************************************");
		
	}
	
}
