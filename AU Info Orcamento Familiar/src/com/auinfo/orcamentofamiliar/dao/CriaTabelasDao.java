package com.auinfo.orcamentofamiliar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class CriaTabelasDao {
	
	private Connection conexao;
	
	public CriaTabelasDao () {
		try {
			this.conexao = FabricaConexao.getConexao();
			criaTabelas();
		} catch (SQLException e) {
			System.out.println("Houve um erro ao conectar ao banco de dados:\n");
			e.printStackTrace();
		}
	}
	
	public void criaTabelas() throws SQLException {  
		String sql = " CREATE TABLE IF NOT EXISTS AU Info;"  
		                        + " CREATE TABLE Usuario ("  
		                        + "   idUsuario INTEGER unsigned NOT NULL AUTO_INCREMENT,"  
		                        + "   login text NOT NULL,"
		                        + "   senha text NOT NULL,"
		                        + "   nomeCompleto text NOT NULL,"
		                        + "   cpf INTEGER unsigned NOT NULL,"
		                        + "   dataNascimento date DEFAULT NULL,"  
		                        + "   PRIMARY KEY (idUsuario)"  
		                        + " )";  
		PreparedStatement stmt = conexao.prepareStatement(sql);  
		                stmt.execute();  
		                stmt.close();  
		}  

}
