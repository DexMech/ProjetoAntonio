package br.edu.Eventos.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

import br.edu.Eventos.Modelos.Evento;

public class ConectaBanco {
	private static final String USUARIO="bilu";
	private static final String SENHA="usuario4718";

	private static final String URL = "jdbc:mysql://localhost:3306/eventos"; 
	private Connection con = ConectaBanco.createConnection();
	private static Connection createConnection() {

		Connection conexao = null;
		try {
			conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "algo deu errado");
		}

		return conexao;
	}

	public void inserirEvento(Evento e) throws SQLException{
		String sql = "INSERT INTO EVENTO " +
				"(,nome,solicitante,setor,ramal,data,local,"
			+   "prioridade,horainicio,horafim,observacao) " +
				"values (?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement smt = con.prepareStatement(sql);


	}
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


	}

}
