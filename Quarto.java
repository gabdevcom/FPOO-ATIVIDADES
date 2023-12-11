package Atividades_Gabriela_Miranda;

public class Quarto extends Comodo{
	private int numeroCamas;
	@SuppressWarnings("unused")
	private String nome;
	
	
	public Quarto() {
		
	}
	
	public Quarto( int numeroCamas) {
		super();
		this.numeroCamas = numeroCamas;
		super.getNome();
	}
	
	public Quarto(String nome, int numeroCamas) {
		super();
		this.numeroCamas = numeroCamas;
		this.nome = nome;
		
	}

	public int getNumeroCamas() {
		return numeroCamas;
	}

	public void setNumeroCamas(int numeroCamas) {
		this.numeroCamas = numeroCamas;
	}
	
	
}
