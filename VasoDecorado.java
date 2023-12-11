package Atividades_Gabriela_Miranda;

public class VasoDecorado extends Vaso{
	//atributos
	private String deco;
	
	//construtor

	public VasoDecorado(){
		super();
	}
	
	
	public VasoDecorado(String deco, String cor, double tamanho, String material){
	super();
	this.deco = deco;
	
	}
	
	//getters e setters 
	public String getDeco() {	
		return deco;
	}
	
	public void setDeco (String d) {
		deco = d;
	}
	

	//metodo
	public void ExibirVasoDeco() {
		System.out.println("Cor do vaso " + getCor() + "" +"Tamanho do vaso: " +
				getTamanho() + "" + "Tipo de material do vaso " + getMaterial() + "" 
				+ "e " + "decoracao "
				+ deco);
	}
}