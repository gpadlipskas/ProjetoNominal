package beans;

import java.util.Date;

public class Cliente extends PessoaFisica{
	private Date atualizacaoCadastral;
	private Fatura fatura;
	private String debitoPendente;
	
	public String getAll() {
		return super.getAll() + "\n" + atualizacaoCadastral + "\n" + fatura + "\n" + debitoPendente;
		
	}
	
	public void setAll(int i, String n, String em, String t, Endereco e, String c, String r, Date dn, Date ac, Fatura f, String dp) {
		super.setAll(i, n, em, t, e);
		atualizacaoCadastral=ac;
		fatura=f;
		debitoPendente=dp;
		
	}
	
	public Cliente() {
		super();
	}
	public Cliente(int id, String nome, String email, String telefone, Endereco endereco, String cpf, String rg,
			Date dataNascimento, Pessoa pessoa, Date atualizacaoCadastral, Fatura fatura, String debitoPendente) {
		//decidir se é date ou String
		super(id, nome, email, telefone, endereco, cpf, rg, dataNascimento, pessoa);
		this.atualizacaoCadastral = atualizacaoCadastral;
		this.fatura = fatura;
		this.debitoPendente = debitoPendente;
	}
	public Date getAtualizacaoCadastral() {
		return atualizacaoCadastral;
	}
	public void setAtualizacaoCadastral(Date atualizacaoCadastral) {
		this.atualizacaoCadastral = atualizacaoCadastral;
	}
	public Fatura getFatura() {
		return fatura;
	}
	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}
	public String getDebitoPendente() {
		return debitoPendente;
	}
	public void setDebitoPendente(String debitoPendente) {
		this.debitoPendente = debitoPendente;
	}
	
	

}
