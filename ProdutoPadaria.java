package Atividades_Gabriela_Miranda;

public class ProdutoPadaria implements Produto{
	public String nome;
	public float preco;
	public float total;
	
	public ProdutoPadaria() {
		
	}
	
	public ProdutoPadaria(float p, String n) {
		this.nome = n;
		this.preco = p;
	} 
	
	@Override
	public String getNome() {
		return nome;
	}
	
	@Override
	public float getPreco() {
		return preco;
	}

	@Override
	public void setNome(String n) {
		nome = n;
	}

	@Override
	public void setPreco( float p) {
		preco = p;
	}

	public void Exibir() {
		System.out.println("O produto que voce esta comprando:   " +   nome   +
				"    ira pagar:   " + preco + " reais");
	}
		public void PrecoTotal() {
			total = getPreco + getPreco + getPreco;
			System.out.println("Total a pagar: " + total );
		}
	}

