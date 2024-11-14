package conta.controller;

import java.util.ArrayList;
import conta.model.Produto;
import conta.repository.ContaRepository;

public class Controller implements ContaRepository {

	private ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	@Override
	public void adicionar(Produto produto) {
		produtos.add(produto);
		System.out.println("Produto " + produto.getNome() + " adicionado ao carrinho!");
	}
	
	@Override
	public Produto buscarPorCodigo(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void vender(int codigo, double preco) {
		// TODO Auto-generated method stub
		
	}
	
	 @Override
	 public void listarTodos() {
	        for (Produto produto : produtos) {
				produto.visualizar();
			}        
	 }
	
}
