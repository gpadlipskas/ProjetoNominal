package beans;

import java.util.Date;

public class Fornecedor extends PessoaJuridica{
	
	private String numeroContrato;
	private Date vigenciaContrato;
	
	public String getAll() {
		return super.getAll() + "\n" + numeroContrato + "\n" + vigenciaContrato;
		
	}
	
	public void setAll (int i, String n, String em, String t, Endereco e,
				String numeroContrato, String razaoSocial, String cnpj, String inscricaoEstadual, String nc, Date vc) {
		super.setAll(i, n, em, t, e);
		numeroContrato = nc;
		vigenciaContrato = vc;
	
	}
	
	public Fornecedor() {
		super();
	}
	public Fornecedor(int id, String nome, String email, String telefone, Endereco endereco, String numeroContrato,
			String razaoSocial, String cnpj, String inscricaoEstadual, String numeroContrato2, Date vigenciaContrato) {
		super(id, nome, email, telefone, endereco, numeroContrato, razaoSocial, cnpj, inscricaoEstadual);
		numeroContrato = numeroContrato2;
		this.vigenciaContrato = vigenciaContrato;
	}
	public String getNumeroContrato() {
		return numeroContrato;
	}
	public void setNumeroContrato(String numeroContrato) {
		this.numeroContrato = numeroContrato;
	}
	public Date getVigenciaContrato() {
		return vigenciaContrato;
	}
	public void setVigenciaContrato(Date vigenciaContrato) {
		this.vigenciaContrato = vigenciaContrato;
	}
	
	

}
