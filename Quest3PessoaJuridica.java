package Trabalho.java;

public class Quest3PessoaJuridica extends Quest3Pessoa{
	
	protected String cnpj;
	protected String razaoSocial;
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String toString() {
		return "cnpj"+cnpj+"razaosacial"+razaoSocial;
	}
	
	
}
