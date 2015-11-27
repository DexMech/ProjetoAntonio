package br.edu.Eventos.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;


import br.edu.Eventos.Modelos.Item;

public class itemdao {
	public void inserirItem(Item e) throws SQLException{


		Connection con = ControlaBanco.createConnection();
		String sql = "INSERT INTO item " +
				"(nome,solicitante,setor,ramal,data,local,"
				+   "prioridade,horainicio,horafim,observacao) " +
				"values (?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement smt = con.prepareStatement(sql);






		JOptionPane.showMessageDialog(null, "Inserido com sucesso!!");


	}
	public void deletarItem(String nome) throws SQLException{
		Connection con = ControlaBanco.createConnection();
		String sql = "DELETE FROM item " +
				"WHERE pats =" +
				"?";
		PreparedStatement smt = con.prepareStatement(sql);
		smt.setString(1, nome );
		JOptionPane.showMessageDialog(null, "Deletado com sucesso!!");

	}
	public void atualizarItem(Item e)throws SQLException{
		Connection con = ControlaBanco.createConnection();
		String sql = "UPDATE item " +
				"set nome=?,email=?,endereco=?,dataNascimento=? " +
				"WHERE cond = ?";
		PreparedStatement smt = con.prepareStatement(sql);
		JOptionPane.showMessageDialog(null, "Atualizado com sucesso!!");

	}
}
