package br.edu.Eventos.Controles;


import java.sql.Connection;
import java.sql.SQLException;

import br.edu.Eventos.Dao.ConectaBanco;
import br.edu.Eventos.Modelos.Evento;

public class ControlaEvento {

	ConectaBanco conecta = new ConectaBanco();
	public void inserir(Evento e)throws SQLException{
		
		
		conecta.inserirEvento(e);
	};
	
public void deletar(String nome)throws SQLException{
		
		
		conecta.deletarEvento(nome);
	};
	
public void atualizar(Evento e)throws SQLException{
		
		
		conecta.atualizarEvento(e);
	};
	
	


}
