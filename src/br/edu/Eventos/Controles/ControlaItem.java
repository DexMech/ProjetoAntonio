package br.edu.Eventos.Controles;



import java.sql.SQLException;

import br.edu.Eventos.Dao.itemdao;
import br.edu.Eventos.Modelos.Item;

public class ControlaItem {
	private itemdao item = new itemdao();
	public void inserir(Item i) throws SQLException{

		item.inserirItem(i);




	}
	public void deletar(String nome) throws SQLException{


		item.deletarItem(nome);



	}
	public void atualizar(Item i) throws SQLException{

		item.atualizarItem(i);




	}
}
