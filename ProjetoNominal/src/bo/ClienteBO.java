package bo;

import beans.Cliente;
import dao.ClienteDAO;

public class ClienteBO {
	
	public static String adicionarCliente(Cliente cli)throws Exception {
		if (cli.getNome().length()>50){
			return "Erro na validacao do Nome";
		}
		
		
		ClienteDAO dao = new ClienteDAO();
		if(dao.selecionarCliente(cli.getCpf()).getCpf()>0){
			dao.fechar();
			return "Este cliente já existe!";
		}
		String x= dao.inserirCliente(cli);
		dao.fechar();
		return x; 
	}
	public static Cliente consultarCodigo(int numero) throws Exception{
		if(numero<1){
			return new Cliente();
		}
		ClienteDAO dao = new ClienteDAO();
		Cliente objeto = dao.selecionarCliente(numero);
		dao.fechar();
		return objeto;
	}
	
	public static int excluirClienteNumero (int numero)throws Exception{
		if(numero<1){
			return 0;
		}
		ClienteDAO dao = new ClienteDAO();
		int x = dao.deletarCliente(numero);
		dao.fechar();
		return x;
	}
	
}
