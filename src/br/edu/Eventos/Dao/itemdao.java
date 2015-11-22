package br.edu.Eventos.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;


import br.edu.Eventos.Modelos.Item;

public class itemdao {
	public void inserirItem(Item e) throws SQLException{


		Connection con = ControlaBanco.createConnection();
		String sql = "INSERT INTO evento " +
				"(nome,solicitante,setor,ramal,data,local,"
				+   "prioridade,horainicio,horafim,observacao) " +
				"values (?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement smt = con.prepareStatement(sql);






		JOptionPane.showMessageDialog(null, "Inserido com sucesso!!");


	}
	public void deletarItem(String nome) throws SQLException{
		Connection con = ControlaBanco.createConnection();
		String sql = "insert into contatos " +
				"(nome,email,endereco,dataNascimento) " +
				"values (?,?,?,?)";
		PreparedStatement smt = con.prepareStatement(sql);


	}
	public void atualizarItem(Item e)throws SQLException{
		Connection con = ControlaBanco.createConnection();
		String sql = "insert into contatos " +
				"(nome,email,endereco,dataNascimento) " +
				"values (?,?,?,?)";
		PreparedStatement smt = con.prepareStatement(sql);


	}
}
