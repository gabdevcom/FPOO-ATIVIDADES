package Atividades_Gabriela_Miranda;

public class Brinquedo {
	//atributos
	private String nome;
	private double alturaMin;
	private int capacidadeMax;
	//metodo 
	
	public Brinquedo(String id, double al, int i) {
	}

	public String getNome() {	
		return nome;
	}
	
	public void setNome (String n) {
		nome = n;
	}

	public double getAlturaMin() {
		return alturaMin;
	}
	
	public void setAlturaMin (double a) {
		alturaMin = a;
	}
	
	public int getCapacidadeMax() {
		return capacidadeMax;
	}
	
	public void setCapacidadeMax (int c) {
		capacidadeMax = c;
	}
	
	public void exibirInfo() {
		System.out.println("Nome do visitante: " + nome + "Altura" + alturaMin + 
			"Capacidade Maxima:  " + capacidadeMax);
	}
	
	
}
