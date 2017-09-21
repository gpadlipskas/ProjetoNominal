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
	
	public String gravar(Cliente cliente) throws Exception {
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
	
	public PessoaFisica getCliente(int n) throws Exception{
		PessoaFisica pf = new PessoaFisica();
		PreparedStatement estrutura = null;
		estrutura = con.prepareStatement
				("SELECT * FROM Cliente WHERE id = ?");
		estrutura.setInt (1,n);
		ResultSet resultado = estrutura.executeQuery();							
		if(resultado.next()) {
			pf.setNome(resultado.getString("nome"));
			pf.setEmail(resultado.getString("telefone"));
			pf.setTelefone(resultado.getString("telefone"));
			pf.setCpf(resultado.getString("cpf"));
			pf.setRg(resultado.getString("rg"));
			pf.setDataNascimento(resultado.getString("data_nascimento"));


		}
		resultado.close();
		estrutura.close();
		return pf;

	}
	
	public int delete (int num) throws Exception {
		PreparedStatement estrutura = con.prepareStatement("DELETE FROM Pessoa WHERE id = ?");
		estrutura.setInt(1, num);
		int i = estrutura.executeUpdate();
		estrutura.close();
		return i;
		
	}
	
	
	public int atualizarEmail (String x, int y) throws Exception{
		PreparedStatement estrutura = con.prepareStatement
		("UPDATE Pessoa SET email = ? WHERE NR_CLIENTE =?");
		estrutura.setString(1,  x);
		estrutura.setInt(2, y);
		int z = estrutura.executeUpdate();
		return z;
	}
	
	
	

}
