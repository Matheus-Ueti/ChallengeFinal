package br.com.fiap.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.fiap.conexao.ConexaoFactory;

public class Conexao {

    public static void main(String[] args) {
        try {
            Connection conn = new ConexaoFactory().conexao();
            if (conn != null) {
                System.out.println("Conexão estabelecida com sucesso!");
                conn.close();
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }
    }
}