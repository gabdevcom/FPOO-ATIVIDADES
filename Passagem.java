package Atividades_Gabriela_Miranda;

public class Passagem {
	private Voo voo;
	private Passageiro passageiro;
	private double precoTotal;
	
	public Passagem() {
		
	}
	
	public Passagem( Voo v, Passageiro p, double pt){
		this.passageiro = p;
		this.precoTotal = pt;
		this.voo = v;
	}
	
	public Voo getVoo() {
		return voo;
	}
	public void setVoo(Voo voo) {
		this.voo = voo;
	}
	public Passageiro getPassageiro() {
		return passageiro;
	}
	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}
	public double getPrecoTotal() {
		return precoTotal;
	}
	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}

	
	public String toString() {
		return null;
		
	}
	
	
	
	
	
	
	
	
}
