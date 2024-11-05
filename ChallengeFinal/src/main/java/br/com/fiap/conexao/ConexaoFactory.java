package br.com.fiap.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
    
    public Connection conexao() throws ClassNotFoundException, SQLException {
        // Carrega o driver do Oracle
        Class.forName("oracle.jdbc.driver.OracleDriver");
        
        // Retorna a conexão com o banco de dados
        return DriverManager.getConnection(
                "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl",
                "RM557680", 
                "210205"     
        );
    }
}
