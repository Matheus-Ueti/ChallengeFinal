package br.com.fiap.main;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.DAO.ClienteDAO;
import br.com.fiap.beans.Cliente;

public class Selecionar {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ClienteDAO dao = new ClienteDAO();
        List<Cliente> clientes = dao.listar();
        for (Cliente cliente : clientes) {
            System.out.println("ID: " + cliente.getId() + ", Nome: " + cliente.getNome() + ", Email: " + cliente.getEmail());
        }
    }
}