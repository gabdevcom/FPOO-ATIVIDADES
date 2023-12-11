package Atividades_Gabriela_Miranda;

public class Casa {
	private String cor;
	private float preco;
	private float metragem;
	private Sala sala;
	private Quarto quarto;
	
	public Casa() {
		
	}
	
	public Casa(String c, float p, float m, Quarto quarto, Sala sala) {
		this.cor = c;
		this.metragem = m;
		this.quarto= quarto;
		this.sala = sala;
	}
	public Casa(Quarto quarto, Sala sala) {
		
		this.quarto= quarto;
		this.sala = sala;
	}
	
	public Quarto getQuarto() {
		return quarto;
	}
	
	public Sala getSala() {
		return sala;
	}
	
	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}
	
	public void setSala(Sala sala) {
		this.sala = sala;
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public float getMetragem() {
		return metragem;
	}

	public void setMetragem(float metragem) {
		this.metragem = metragem;
	}
	
	
	public void mostrarDetalhes() {
		System.out.println(" Dados da casa: " +  " Cor: " + cor + "  Preco " +
	preco );
	}

}