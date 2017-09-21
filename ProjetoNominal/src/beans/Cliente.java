package beans;

public class Cliente extends PessoaFisica{
    private String atualizacaoCadastral;
    private Fatura fatura;
    private String debitoPendente;
    
    public String getAll() {
        return super.getAll() + "\n" + atualizacaoCadastral + "\n" + fatura + "\n" + debitoPendente;
        
    }
    
    public void setAll(int i, String n, String em, String t, Endereco e, String c, String r, String dn, String ac, Fatura f, String dp) {
        super.setAll(i, n, em, t, e);
        atualizacaoCadastral=ac;
        fatura=f;
        debitoPendente=dp;
        
    }
    
    public Cliente() {
        super();
    }
    public Cliente(int id, String nome, String email, String telefone, Endereco endereco, String cpf, String rg,
            String dataNascimentp, Pessoa pessoa, String atualizacaoCadastral, Fatura fatura, String debitoPendente) {
        super(id, nome, email, telefone, endereco, cpf, rg, dataNascimentp, pessoa);
        this.atualizacaoCadastral = atualizacaoCadastral;
        this.fatura = fatura;
        this.debitoPendente = debitoPendente;
    }
    public String getAtualizacaoCadastral() {
        return atualizacaoCadastral;
    }
    public void setAtualizacaoCadastral(String atualizacaoCadastral) {
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


