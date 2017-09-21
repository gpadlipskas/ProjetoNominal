package testes;

import javax.swing.JOptionPane;

import beans.Cliente;
import bo.ClienteBO;

public class GravarCliente {

	public static void main(String[] args) {
		try {
	Cliente cliente = new Cliente();
	cliente.setNome(JOptionPane.showInputDialog("Nome"));
	cliente.setCpf(JOptionPane.showInputDialog("CPF"));
	System.out.println(ClienteBO.adicionarCliente(cliente));
}catch(Exception e) {
	e.printStackTrace();
}
	}

}
