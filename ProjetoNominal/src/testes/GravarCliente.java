package testes;

import javax.swing.JOptionPane;

import beans.Cliente;
import bo.ClienteBO;

public class GravarCliente {
	
	static String texto (String texto) {
		return JOptionPane.showInputDialog(texto);
		
	}

	public static void main(String[] args) {
		try {
	Cliente cliente = new Cliente();
	cliente.setAll(c, r, dn, ac, ni, dp);
	
	
	
	cliente.setCpf(JOptionPane.showInputDialog("CPF"));
	System.out.println(ClienteBO.adicionarCliente(cliente));
}catch(Exception e) {
	e.printStackTrace();
}
	}

}
