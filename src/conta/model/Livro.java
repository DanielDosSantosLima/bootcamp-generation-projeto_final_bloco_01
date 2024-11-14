package conta.model;

public class Livro extends Produto {

	private String descricao;
	
	public Livro(int codigo, String nome, double preco, String descricao) {
		super(codigo, nome, preco);
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void exibirProduto() {
		//super.exibirProduto();  
		System.out.println("Descrição: " + descricao);
	}
	
}
