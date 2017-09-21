package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import beans.PessoaFisica;
import beans.Cliente;
import conexao.ConexaoFactory;

public class ClienteDAO {
	private Connection con;
	
	public ClienteDAO () throws Exception {
		con = new ConexaoFactory().conectar();
	}
	
	public String fechar () throws Exception {
		con.close();
		return "Conexão fechada com sucesso";
		
	}
	
	public String inserirCliente(Cliente cliente) throws Exception {
		PreparedStatement estrutura = null;
		estrutura = con.prepareStatement
				("INSERT INTO Cliente (id, nome, email, telefone, cpf, rg, dataNascimento) VALUES(?,?,?,?,?,?,?)");
		estrutura.setInt (1, cliente.getId());
		estrutura.setString (2, cliente.getNome());
		estrutura.setString (3, cliente.getEmail());
		estrutura.setString(4, cliente.getTelefone());
		estrutura.setString(5, cliente.getCpf());
		estrutura.setString(6, cliente.getRg());
		estrutura.setString(7, cliente.getDataNascimento());
		estrutura.execute();
		estrutura.close();
		return "Gravado com sucesso";


	}
	
	public Cliente selecionarCliente(int n) throws Exception{
		Cliente cliente = new Cliente();
		PreparedStatement estrutura = null;
		estrutura = con.prepareStatement
				("SELECT * FROM Cliente WHERE id = ?");
		estrutura.setInt (1,n);
		ResultSet resultado = estrutura.executeQuery();							
		if(resultado.next()) {
			cliente.setNome(resultado.getString("nome"));
			cliente.setEmail(resultado.getString("telefone"));
			cliente.setTelefone(resultado.getString("telefone"));
			cliente.setCpf(resultado.getString("cpf"));
			cliente.setRg(resultado.getString("rg"));
			cliente.setDataNascimento(resultado.getString("data_nascimento"));
		}
		resultado.close();
		estrutura.close();
		return cliente;

	}
	
	public int deletarCliente(int num) throws Exception {
		PreparedStatement estrutura = con.prepareStatement("DELETE FROM Pessoa WHERE id = ?");
		estrutura.setInt(1, num);
		int i = estrutura.executeUpdate();
		estrutura.close();
		return i;
		
	}
	
	
	public int atualizarCliente (Cliente cliente) throws Exception{
		PreparedStatement estrutura = con.prepareStatement
		("UPDATE Pessoa SET email = ? WHERE NR_CLIENTE =?");
		estrutura.setString(1, cliente.getEmail());
		estrutura.setInt(2, cliente.getId());
		int z = estrutura.executeUpdate();
		return z;
	}
	
	
	

}
