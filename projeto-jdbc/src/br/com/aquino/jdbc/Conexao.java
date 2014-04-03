package br.com.aquino.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
	
	Connection con;
	
	public Connection getConnection(){
		
		try {
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/database", "postgres", "acdc");
			System.out.println("Conectado com sucesso!");
		} catch (SQLException e) {
			System.out.println("Não foi possivel conectar no banco de dados");
			e.printStackTrace();
		}
		return con;
	}
	

}
