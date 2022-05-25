package dao;

import java.util.List;
import dominio.Produto;
public class DaoProduto {
	
	public void salvar(Produto produto) {
		System.out.println("Salvando Produto");		
	}
	
	public void excluir(Integer id) {
		System.out.println("Excluindo Produto");
	}
	
	public List<Produto> listar(String nome){
		System.out.println("Listando Produtos");		
		return null;
	}
}