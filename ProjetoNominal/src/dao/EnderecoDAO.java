package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import beans.Endereco;
import conexao.ConexaoFactory;

public class EnderecoDAO {

private Connection con;

public EnderecoDAO() throws Exception {
    con = new ConexaoFactory().conectar();
}    
    public String fechar() throws Exception {
        con.close();
        return "Fechado com sucesso";
    }
    public String gravar(Endereco end) throws Exception {
        PreparedStatement estrutura = null;
        estrutura = con.prepareStatement("insert into Pessoa(CEP,RUA,NUMERO,CIDADE) VALUES (?,?,?,?)");
        estrutura.setString(1,end.getCep());
        estrutura.setString(2, end.getRua());
        estrutura.setInt(3, end.getNumero());
        estrutura.setString(4, end.getCidade());
        estrutura.execute();
        estrutura.close();
        return "Gravado com sucesso";
    }
    public int delete(String cep) throws Exception {
        PreparedStatement estrutura = con.prepareStatement ("delete * from PESSOAS where contains(CEP,RUA,NUMERO,CIDADE) VALUES (?,?,?,?)");
        estrutura.setString(1, cep);
        int i = estrutura.executeUpdate();
        estrutura.close();
        return i;
    }
    
    public int atualizar(String cep) throws Exception {
        PreparedStatement estrutura = con.prepareStatement("update PESSOA set (CEP,RUA,NUMERO,CIDADE) VALUES (?,?,?,?)");
        estrutura.setString(1, cep);
        int i = estrutura.executeUpdate();
        estrutura.close();
        return i;
    }
    
    public List<Endereco> listarPorEndereco(String n) throws Exception {
        List<Endereco> lista = new ArrayList<Endereco>();
        Endereco obj = null;
        
        PreparedStatement estrutura = con.prepareStatement("select * from PESSOA where CEP like ?");
        estrutura.setString(1, "%" + n + "%");
        ResultSet resultado = estrutura.executeQuery();
        while(resultado.next()) {
            obj = new Endereco();
            obj.setCep(resultado.getString("CEP"));
            obj.setRua(resultado.getString("RUA"));
            obj.setNumero(resultado.getInt("NUEMRO"));
            obj.setCidade(resultado.getString("CIDADE"));
            lista.add(obj);
        }
        resultado.close();
        estrutura.close();
        return lista;
    }
}

