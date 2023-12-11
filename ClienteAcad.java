package Atividades_Gabriela_Miranda;


public class Cliente {	
	public double peso;
	public double altura;
	public String cpf;
	public String nome;
	public int telefone; 
	public int idade;
		
	public double getAltura() {
		return altura;
	}
	
	public void setAltura (double a) {
		altura = a;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso (double p) {
		peso = p;
	}
	
	public double calcularIMC(){
			double imc = peso/(altura*altura);
			if (imc <= 18.5) {
				System.out.println("Seu IMC é" + imc + " considerado magro");
			}else if( imc >= 18.5 && imc <= 24.9) {
				System.out.println("Resultado: " + imc + " Seu IMC é considerado normal");
			}else if(imc > 25 && imc <= 29.9) {
				System.out.println("Seu IMC é considerado sobpeso" + imc);
			}
			return imc;
			
	}
	
	public void calcularPesoDesejado( float pesodesejado) {
		if ( pesodesejado > peso) {
			System.out.println("Emagrecer:" + (peso - pesodesejado));
		} else if ( peso > pesodesejado) 
			System.out.println("Engordar:" + (pesodesejado - peso));
		
	}
	
	public void imprimirDados () {
		System.out.println("CPF:  " + cpf + "Nome:  " + nome + "Tel:  " + telefone + "Idade:  " 
				+ idade + "Altura:  " + altura + "Peso:  " + peso + "Kg");
	}

}
	