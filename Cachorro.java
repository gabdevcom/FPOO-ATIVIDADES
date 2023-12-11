package Atividades_Gabriela_Miranda;

public class Cachorro {
		private String nome;
		private float peso;
		private char sexo;
		private int qtdPatas;
		
	public Cachorro() {
		
	}
	
	public Cachorro( String nome, float peso, char sexo, int qtdPatas) {
		this.nome = nome;
		this.peso = peso;
		this.qtdPatas = qtdPatas;
		this.sexo = sexo;
	}
	
	
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public float getPeso() {
			return peso;
		}
		public void setPeso(float peso) {
			this.peso = peso;
		}
		public char getSexo() {
			return sexo;
		}
		public void setSexo(char sexo) {
			this.sexo = sexo;
		}
		public int getQtdPatas() {
			return qtdPatas;
		}
		public void setQtdPatas(int qtdPatas) {
			this.qtdPatas = qtdPatas;
		}
		
	public void Latir() {
		System.out.println(this.nome + " esta latindo!!");
	}
	
	public void Correr() {
		System.out.println( this.nome + " esta latindo!!");
	}
	
	
	public void Dormir() {
		System.out.println( this.nome + " esta dormindo....shh");
	}
	
	
	
	public void Brincar() {
		System.out.println( this.nome +" esta brincando!!");
	}
	
		
}
