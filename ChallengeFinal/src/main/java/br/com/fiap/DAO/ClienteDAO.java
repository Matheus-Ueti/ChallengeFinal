
import br.com.fiap.beans.Cliente;
import br.com.fiap.conexao.ConexaoFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

 
    public void inserir(Cliente cliente) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO CLIENTES (ID, NOME, EMAIL) VALUES (?, ?, ?)";
        try (Connection conn = new ConexaoFactory().conexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, cliente.getId());
            stmt.setString(2, cliente.getNome());
            stmt.setString(3, cliente.getEmail());
            stmt.executeUpdate();
        }
    }

    
    public List<Cliente> listar() throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM CLIENTES";
        List<Cliente> clientes = new ArrayList<>();
        try (Connection conn = new ConexaoFactory().conexao();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Cliente cliente = new Cliente(
                        rs.getInt("ID"),
                        rs.getString("NOME"),
                        rs.getString("EMAIL"));
                clientes.add(cliente);
            }
        }
        return clientes;
    }

  
    public void atualizar(Cliente cliente) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE CLIENTES SET NOME = ?, EMAIL = ? WHERE ID = ?";
        try (Connection conn = new ConexaoFactory().conexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEmail());
            stmt.setInt(3, cliente.getId());
            stmt.executeUpdate();
        }
    }

   
    public void deletar(int id) throws SQLException, ClassNotFoundException {
        String sql = "DELETE FROM CLIENTES WHERE ID = ?";
        try (Connection conn = new ConexaoFactory().conexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}