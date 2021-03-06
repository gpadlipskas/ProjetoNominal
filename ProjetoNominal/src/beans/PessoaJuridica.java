package beans;


public class PessoaJuridica extends Pessoa{
	
		private String numeroContrato;
		private String razaoSocial;
		private String cnpj;
		private String inscricaoEstadual;
		
		public String getAll() {
			return super.getAll() + "\n" + numeroContrato + "\n" + razaoSocial + "\n" + cnpj + "\n" + inscricaoEstadual; 
			
			
		}
		
		public PessoaJuridica() {
			super();
		}

		public PessoaJuridica(int id, String nome, String email, String telefone, Endereco endereco,
				String numeroContrato, String razaoSocial, String cnpj, String inscricaoEstadual) {
			super(id, nome, email, telefone, endereco);
			this.numeroContrato = numeroContrato;
			this.razaoSocial = razaoSocial;
			this.cnpj = cnpj;
			this.inscricaoEstadual = inscricaoEstadual;
		}
		
		public String getNumeroContrato() {
			return numeroContrato;
		}
		public void setNumeroContrato(String numeroContrato) {
			this.numeroContrato = numeroContrato;
		}
		public String getRazaoSocial() {
			return razaoSocial;
		}
		public void setRazaoSocial(String razaoSocial) {
			this.razaoSocial = razaoSocial;
		}
		public String getCnpj() {
			return cnpj;
		}
		public void setCnpj(String cnpj) {
			this.cnpj = cnpj;
		}
		public String getInscricaoEstadual() {
			return inscricaoEstadual;
		}
		public void setInscricaoEstadual(String inscricaoEstadual) {
			this.inscricaoEstadual = inscricaoEstadual;
		}

		

}
