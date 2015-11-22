package br.edu.Eventos.Controles;



import java.sql.SQLException;

import br.edu.Eventos.Dao.ControlaBanco;
import br.edu.Eventos.Dao.EventoDao;
import br.edu.Eventos.Modelos.Evento;

public class ControlaEvento {

	EventoDao dao = new EventoDao(); 
	public void inserir(Evento e)throws SQLException{


		dao.inserirEvento(e);
	};

	public void deletar(String nome)throws SQLException{


		dao.deletarEvento(nome);
	};

	public void atualizar(Evento e)throws SQLException{


		dao.atualizarEvento(e);
	};




}
