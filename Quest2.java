package Trabalho.java;


public class Quest2 {
	
   private double saldo;
   private String limite;

   public int soma(int num1, int num2) {
	  return num1 + num2;
  }
	public double soma(double num1, double num2) {
		return num1 + num2;
		
	}
	public int soma (int[]vetorInteiros) {
		int total = 0;
		for (int i=0; i<vetorInteiros.length; i++) {
			total += vetorInteiros[i];
			
		}
		return total;
			
		}

		public void debitar(double valor) {
			int saldo = 0;
			int limite = 0;
			double saldoTotal = saldo + limite;
			if(valor <= saldoTotal) {
				this.saldo = this.saldo - valor;
			}
		}
		
		@Override
		public String toString() {
			return super.toString()+
					"\nLimite: "+this.limite+
					"\nStaldo Total: "+(this.limite + this.saldo)+
					"\n-----------------\n";
			}
}

	//___________________________________________________________________________	
	
		//Diferenças entre sobrecarga e sobrescrita 
		
/*A sobrescrita de métodos seria criar um novo método na classe filha contendo 
a mesma assinatura e mesmo tipo de retorno do método sobrescrito. (Override). 
 Ja o sobrecarga, ele no caso seria, o que permite métodos de mesmo nome, mas com
  suas assinaturas diferentes, ex argumentos diferentes.*/
	








