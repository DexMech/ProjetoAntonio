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
			
			e1.printStackTrace();
		}
	}
	

	public void deletar(String nome){


		try {
			dao.deletarEvento(nome);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	};

	public void atualizar(Evento e,String nome){


		try {
			dao.atualizarEvento(e,nome);
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
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
