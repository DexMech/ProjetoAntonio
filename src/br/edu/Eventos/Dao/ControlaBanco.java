package br.edu.Eventos.Dao;

import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

import br.edu.Eventos.Modelos.Evento;

public class ControlaBanco {
	private static final String USUARIO="root";
	private static final String SENHA="usuario4718";

	private static final String URL = "jdbc:mysql://localhost:3306/eventos"; 

	private static Connection createConnection() {

		Connection conexao = null;
		try {
			conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
		} catch (SQLException e) {

		}

		return conexao;
	}

	public void inserirEvento(Evento e) throws SQLException{
		
		String pegadata;
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


	}/*
	public void deletarEvento(String nome) throws SQLException{
		String sql = "insert into contatos " +
				"(nome,email,endereco,dataNascimento) " +
				"values (?,?,?,?)";
		PreparedStatement smt = con.prepareStatement(sql);


	}
	public void atualizarEvento(Evento e)throws SQLException{
		String sql = "insert into contatos " +
				"(nome,email,endereco,dataNascimento) " +
				"values (?,?,?,?)";
		PreparedStatement smt = con.prepareStatement(sql);


	}*/

}
