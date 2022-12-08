package Trabalho.java;

public class Quest3PessoaFisica extends Quest3Pessoa{
	
	protected String CPF;
    protected String sobreNome;
	
   public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	@Override
 public String toString() {
	return " CPF: "+ CPF + ", sobrenome " + sobreNome;
	 
 }
}
