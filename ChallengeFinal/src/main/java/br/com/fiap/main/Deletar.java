package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.DAO.ClienteDAO;

public class Deletar {

    static int inteiro(String j) {
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        int id = inteiro("Insira o ID do Cliente a ser deletado");
        ClienteDAO dao = new ClienteDAO();
        dao.deletar(id);
        System.out.println("Cliente deletado com sucesso!");
    }
}