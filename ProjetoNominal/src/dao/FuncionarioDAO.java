package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import beans.Funcionario;
import conexao.ConexaoFactory;

public class FuncionarioDAO {
	
	 private Connection con;

	    public FuncionarioDAO() throws Exception{
	        con = new ConexaoFactory().conectar();
	    }
	    public String fechar()throws Exception{
	        con.close();
	        return "Fechado com sucesso!";
	    }
	    

	    public String gravar(Funcionario func) throws Exception{
	        PreparedStatement estrutura = null;
	        estrutura = con.prepareStatement
	                ("INSERT INTO Funcionario "
	                        + "(codigo, nome_area, gestor) VALUES" 
	                        +"(?,?,?)");
	        estrutura.setString(1, func.getNumeroMatricula());
	        estrutura.setString(2, func.getCargo());
	        estrutura.setDouble(3, func.getSalario());
	        estrutura.execute();
	        estrutura.close();
	        return "Gravado com sucesso!";
	    }
	    
	    

}
