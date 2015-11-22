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

	public static Connection createConnection() {

		Connection conexao = null;
		try {
			conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
		} catch (SQLException e) {

		}

		return conexao;
	}

	

}
