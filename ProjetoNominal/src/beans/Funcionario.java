package beans;

import java.util.Date;

public class Funcionario extends PessoaFisica{
	
	private String numeroMatricula;
	private String cargo;
	private double salario;
	
	public String getAll() {
		return super.getAll() + "\n" + numeroMatricula + "\n" + cargo + "\n" + "\n" + salario;
	}
	
	public void setAll (int i, String n, String em, String t, Endereco e, String c, String r, Date dn, String nm, String cg, double s) {
		super.setAll(i, n, em, t, e);
		numeroMatricula=nm;
		cargo=cg;
		salario=s;
		
	}
	
	public Funcionario() {
		super();
	}
	
	public Funcionario(int id, String nome, String email, String telefone, Endereco endereco, String cpf, String rg,
			Date dataNascimento, Pessoa pessoa, String numeroMatricula, String cargo, double salario) {
		super(id, nome, email, telefone, endereco, cpf, rg, dataNascimento, pessoa);
		this.numeroMatricula = numeroMatricula;
		this.cargo = cargo;
		this.salario = salario;
	}
	public String getNumeroMatricula() {
		return numeroMatricula;
	}
	public void setNumeroMatricula(String numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	

}
