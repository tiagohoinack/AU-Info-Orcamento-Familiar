package com.auinfo.orcamentofamiliar.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
	
	static String DRIVER_H2 = "org.h2.Driver";  
    static String URL_H2 = "jdbc:h2:/"+System.getenv("LOCALAPPDATA")+"/A&U Info Orçamento Familiar/dados";  
              
    static String USER_H2 = "administrador";  
    static String PASSWORD_H2 = "289415au";  
    private static Connection conexao_H2 = null; 
	
    public static Connection getConexao() throws SQLException {  
    	  
        if (conexao_H2 == null) {  
            try {  
                Class.forName(DRIVER_H2);  
                System.out.println("Conectando ao banco H2");  
                conexao_H2 = DriverManager.getConnection(URL_H2, USER_H2, PASSWORD_H2);  
                System.out.println("Conectou ao banco!");
                return conexao_H2;
            } catch (ClassNotFoundException e) {  
                System.out.println("erro" + e + "\n\n");  
                throw new SQLException(e.getMessage());  
            }  
        } else {  
            return conexao_H2;  
        }  
    }  
	

}
