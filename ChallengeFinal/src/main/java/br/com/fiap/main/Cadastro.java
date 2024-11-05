package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.DAO.ClienteDAO;
import br.com.fiap.beans.Cliente;

public class Cadastro {

    static String texto(String j) {
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro(String j) {
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Cliente cliente = new Cliente(inteiro("ID"), texto("Nome"), texto("Email"));
        ClienteDAO dao = new ClienteDAO();
        dao.inserir(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }
}