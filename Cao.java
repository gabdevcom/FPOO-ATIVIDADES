package AdocaoPet_Gabriela_Miranda;

public class Cao extends Animal {
	
	public Cao() {
		super();
	}
	
	public Cao( String especie, int idade, float peso, char sexo) {
		super.setIdade(idade);
		super.setEspecie(especie);
		super.setPeso(peso);
		super.setSexo(sexo);
	}
}
