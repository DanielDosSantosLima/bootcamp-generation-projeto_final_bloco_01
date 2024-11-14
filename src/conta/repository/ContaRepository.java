package conta.repository;

public interface ContaRepository {

	// CRUD - create, read, update and delete
	public void procurarCodigo(int codigo);
	public void listarTodas();
	public void cadastrar(int codigo);
	public void atualizar(int codigo);
	public void deletar(int codigo);
		
	// Venda
	public void vender(int codigo, double preco);

	
}

