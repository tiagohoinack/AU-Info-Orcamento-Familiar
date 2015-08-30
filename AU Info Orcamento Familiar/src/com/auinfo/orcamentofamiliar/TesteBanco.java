package com.auinfo.orcamentofamiliar;

import java.sql.Connection;
import java.sql.SQLException;
import com.auinfo.orcamentofamiliar.dao.FabricaConexao;

public class TesteBanco {
	
	static Connection conn;

	public static void main(String[] args) {
		try {
			conn = FabricaConexao.getConexao();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
