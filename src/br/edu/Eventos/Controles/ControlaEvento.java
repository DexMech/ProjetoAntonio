package br.edu.Eventos.Controles;


import java.sql.Connection;
import java.sql.SQLException;

import br.edu.Eventos.Dao.ConectaBanco;
import br.edu.Eventos.Modelos.Evento;

public class ControlaEvento {

	
	public void inserir(Evento e)throws SQLException{
		
		Connection con= ConectaBanco.createConnection();
	};
	
	


}
