package br.edu.Eventos.Controles;



import java.sql.ResultSet;
import java.sql.SQLException;


import br.edu.Eventos.Dao.EventoDao;

import br.edu.Eventos.Modelos.Evento;

public class ControlaEvento {



	EventoDao dao = new EventoDao(); 

	
	public void inserir(Evento e){

	



		try {
			dao.inserirEvento(e);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	

	public void deletar(String nome)throws SQLException{


		dao.deletarEvento(nome);
	};

	public void atualizar(Evento e)throws SQLException{


		dao.atualizarEvento(e);
	}


	public ResultSet mostra(String cond,String valor) {
		ResultSet resultado = null;
		try {
			 resultado = dao.mostra(cond,valor);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultado;
		
	};




}
