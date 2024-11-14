package conta.repository;

import conta.model.Produto;

public interface ContaRepository {

	// CRUD - create, read, update and delete
	public void adicionar (Produto produto);
	Produto buscarPorCodigo (int codigo);
	
	
	// Venda
	public void vender(int codigo, double preco);
	public void listarTodos();
	
}

