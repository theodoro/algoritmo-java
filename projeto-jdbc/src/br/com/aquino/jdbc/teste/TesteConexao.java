package br.com.aquino.jdbc.teste;

import br.com.aquino.jdbc.Conexao;



public class TesteConexao {

	public static void main(String[] args) {
		
		Conexao conexao = new Conexao();
		
		conexao.getConnection();
	}

}
