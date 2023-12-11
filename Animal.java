package AdocaoPet_Gabriela_Miranda;

public class Animal {
	private String especie;
	private int idade;
	private float peso;
	private char sexo;
	
	public Animal() {
		
	}
	
	public Animal( String e, int i, float p, char s) {
		this.especie = e;
		this.idade = i;
		this.sexo = s;
		this.peso = p;
	}
	
	
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
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
	
	public void ExibirInfo() {
		System.out.println(" Especie : " + especie + " Idade: " + idade + " Peso: " + peso +
			"  Sexo:" + sexo );
	}
}
