package br.edu.Eventos.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

public class ConectaBanco {
private static final String USUARIO="bilu";
private static final String SENHA="usuario4718";
private static final String HOST="bilu";


public static Connection createConnection() throws SQLException{
	String url = "jdbc:mysql://localhost:3306/eventos"; 
	String user = "root"; 
	String password = "root"; 
	
	Connection conexao = null;
	conexao = DriverManager.getConnection(url, user, password);
	
	return conexao;
}



}
