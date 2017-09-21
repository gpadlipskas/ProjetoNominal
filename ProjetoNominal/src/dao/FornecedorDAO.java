package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import beans.Cliente;
import beans.Fornecedor;
import conexao.ConexaoFactory;

public class FornecedorDAO {
	
		private Connection con;
		
		public FornecedorDAO () throws Exception {
			con = new ConexaoFactory().conectar();
		}
		
		public String fechar () throws Exception {
			con.close();
			return "Conexao fechada com sucesso";
			
		}
	

		public String adcFornecedor(Fornecedor forn) throws Exception {
			PreparedStatement estrutura = null;
			estrutura = con.prepareStatement
					("INSERT INTO Fornecedor (numero_contrato, vigencia_contrato, gerente_contrato) VALUES(?,?,?)");
			estrutura.setString(1, forn.getNumeroContrato());
			estrutura.setString(2, forn.getVigenciaContrato());
			estrutura.setString(3, forn.getGerenteContrato());
			estrutura.execute();
			estrutura.close();
			return "Gravado com sucesso";
		
		}
		
		
}
