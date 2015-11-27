package br.edu.Eventos.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.edu.Eventos.Modelos.Evento;

public class EventoDao {
	public void inserirEvento(Evento e) throws SQLException{


		Connection con = ControlaBanco.createConnection();
		String sql = "INSERT INTO evento " +
				"(nome,solicitante,setor,ramal,data,local,"
				+   "prioridade,horainicio,horafim,observacao) " +
				"values (?,?,?,?,?,?,?,?,?,?)";
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



		smt.execute();
		smt.close();

		JOptionPane.showMessageDialog(null, "Inserido com sucesso!!");


	}
	public void deletarEvento(String nome) throws SQLException{
		Connection con = ControlaBanco.createConnection();
		String sql = "DELETE FROM evento " +
				"WHERE nome = ?";
		PreparedStatement smt = con.prepareStatement(sql);
		JOptionPane.showMessageDialog(null, "Deletado com sucesso");

	}
	public void atualizarEvento(Evento e)throws SQLException{
		Connection con = ControlaBanco.createConnection();
		String sql = "UPDATE evento" +
				"SET nome=?,email=?,endereco=?,dataNascimento=? " +
				"WHERE cond=? ";
		PreparedStatement smt = con.prepareStatement(sql);
		JOptionPane.showMessageDialog(null, "Atualizado com sucesso");

	}
}
