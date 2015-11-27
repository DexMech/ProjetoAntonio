package br.edu.Eventos.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.edu.Eventos.Modelos.Evento;

public class EventoDao {
	public void inserirEvento(Evento e) throws SQLException{


		Connection con = ControlaBanco.createConnection();
		String inicio ="  CREATE TABLE IF NOT EXISTS `evento` ("
  +"`idevento` int(11) NOT NULL AUTO_INCREMENT,"
  +"`nome` varchar(45) NOT NULL,"
  +"`solicitante` varchar(45) NOT NULL,"
  +"`setor` varchar(45) NOT NULL,"
  +"`ramal` varchar(45) NOT NULL,"
  +"`data` date NOT NULL,"
  +"`local` varchar(45) NOT NULL,"
  +"`prioridade` varchar(45) NOT NULL,"
  +"`horainicio` time NOT NULL,"
  +"`horafim` time NOT NULL,"
  +"`observacao` varchar(45) DEFAULT NULL,"
  +"`microfone` tinyint(1) NOT NULL,"
  +"`passador` tinyint(1) NOT NULL,"
  +"`funcionario` varchar(45) NOT NULL,"
  +"`sala` varchar(10) NOT NULL,"
  +"PRIMARY KEY (`idevento`),"
  +"UNIQUE KEY `idevento_UNIQUE` (`idevento`)"
+") ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=latin1;";
		PreparedStatement s = con.prepareStatement(inicio);
		s.execute();
		s.close();


		String sql = "INSERT INTO evento " +
				"(nome,solicitante,setor,ramal,data,local,"
				+   "prioridade,horainicio,horafim,observacao,microfone,passador,funcionario,sala) " +
				"values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement smt = con.prepareStatement(sql);
		smt.setString(1, e.getNome());
		smt.setString(2, e.getSolicitante());
		smt.setString(3, e.getSetor());
		smt.setString(4, e.getRamal());

		long ms = e.getData().getTime();
		java.sql.Date ds = new java.sql.Date( ms );
		smt.setDate(5, ds);
		smt.setString(6, e.getLocal());
		smt.setString(7, e.getPrioridade());
		smt.setString(8, e.getHoraInicio());
		smt.setString(9, e.getHoraFim());
		smt.setString(10, e.getObservacao());
		smt.setBoolean(11, e.isMicrofone());
		smt.setBoolean(12, e.isPassador());
		smt.setString(13, e.getFuncionario());
		smt.setString(14, e.getSala());



		smt.execute();
		smt.close();

		JOptionPane.showMessageDialog(null, "Inserido com sucesso!!");


	}
	public void deletarEvento(String nome) throws SQLException{
		Connection con = ControlaBanco.createConnection();
		String sql = "DELETE FROM evento " +
				"WHERE nome = ?";
		PreparedStatement smt = con.prepareStatement(sql);
		smt.setString(1, nome);
		smt.execute();
		JOptionPane.showMessageDialog(null, "Deletado com sucesso");

	}
	public void atualizarEvento(Evento e,String nome)throws SQLException{
		Connection con = ControlaBanco.createConnection();
		String sql = "UPDATE evento" +
				" SET solicitante=?,setor=?,ramal=?,data=?,local=?,prioridade=?,horainicio=?,horafim=?,"
				+ " observacao=?,microfone=?,passador=?,funcionario=?,sala=?" +
				" WHERE nome=?" ;
		PreparedStatement smt = con.prepareStatement(sql);
		smt.setString(1, e.getSolicitante());
		smt.setString(2, e.getSetor());
		smt.setString(3, e.getRamal());
		long ms = e.getData().getTime();
		java.sql.Date ds = new java.sql.Date( ms );
		smt.setDate(4, ds);
		smt.setString(5, e.getLocal());
		smt.setString(6, e.getPrioridade());
		smt.setString(7, e.getHoraInicio());
		smt.setString(8, e.getHoraFim());
		smt.setString(9, e.getObservacao());
		smt.setBoolean(10, e.isMicrofone());
		smt.setBoolean(11, e.isPassador());
		smt.setString(12,e.getFuncionario());
		smt.setString(13, e.getSala());
		smt.setString(14, nome);
		smt.execute();
		smt.close();
		JOptionPane.showMessageDialog(null, "Atualizado com sucesso");

	}
	public ResultSet mostra(String cond,String valor) throws SQLException{
		Connection con = ControlaBanco.createConnection();
		String sql ="SELECT * FROM evento WHERE +"+cond+" = ?";
		PreparedStatement smt = con.prepareStatement(sql);
		smt.setString(1, valor);

		ResultSet resultado = smt.executeQuery();


		smt.execute();
		smt.close();
		return resultado;
	}
}
